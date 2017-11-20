import x10.io.File;
import x10.lang.System;
import x10.util.ArrayList;
import x10.lang.Rail;
import x10.util.concurrent.Monitor;

public class MakefileManager {
	
	private static val relativePathOnMaster = new File(".").getAbsoluteFile().getPath();
    private static val hostnames = new Rail[String](Place.numPlaces());
    private static val cluster:Rail[Boolean] = new Rail[Boolean](Place.places().size);
    private static val root:Root = new Root();
    private static val monitor:Monitor = new Monitor();
    
    public static def init(tree:Tree) {
    	readHostfile();
    	x10.io.Console.OUT.println("Taille du cluster : " + cluster.size);
    	for(var i:Long = 0 ;  i < cluster.size ; i++) {
    		cluster(i) = false;
    	}
    	root.setTree(tree);
    	
    	// Attend la fin de toutes les actions asynchrone sur la machine maitre.
    	finish {
    		async {
    			findAndExecuteRules();
    		}
    	}
    }
    
    private static def readHostfile() {
    	var path:String = System.getenv("X10_ABSOLUTEPATH");
    	if(path != null) {
        	val file = new File(path);
        	if(file.exists()) {
        		var count:Long = 0;
        		for(line in file.lines()) {
        			hostnames(count) = line;
        			count++;
        		}
        	}
    	}
    }
	
	private static def findAndExecuteRules() {
		val tree:Tree = root.getTree();
		var leafRules:ArrayList[Rule] = new ArrayList[Rule]();
		leafRules = browseTreeAndFindRules(leafRules,tree);
		if(leafRules.size() > 0) {		
			distributedExecution(leafRules);
		}
	}
	
	/**
	 * Parcourt l'arbre et retourne les règles qui 
	 * sont représentées par des feuilles dans l'arbre
	 * et qui ne sont pas déjà en cours d'exécution.
	 */
	private static def browseTreeAndFindRules(list:ArrayList[Rule], tree:Tree):ArrayList[Rule] {
		var tmp:ArrayList[Rule] = list;
		if(tree != null) {
			// On parcourt le reste des sous-arbres s'ils existent
			if(tree.getSubtrees() != null && tree.getSubtrees().size > 0) {
				for(subtree in tree.getSubtrees()) {
					tmp = browseTreeAndFindRules(tmp,subtree);
				}
		    // Sinon on rajoute la règle si elle n'est pas déjà en cours d'exécution.
			} else if(!tree.isExecuted()) {
				tmp.add(tree.getRule());
				tree.setIsExecuted(true);
			}
		}
		return tmp;
	}
	
	private static def distributedExecution(rules:ArrayList[Rule]) {
		for(rule in rules) {
			var createdFile : File = new File(rule.getCreatedFilename());
			// On vérifie qu'il est nécessaire de mettre à jour le fichier.
			if(!createdFile.exists() || createdFile.lastModified() < rule.lastModifiedDependency()) {
				async manageCommands(rule);
			}
			// Sinon la règle n'a pas besoin d'être exécutée.
			else {
				terminateRule(rule);
			}
		}
	}
	
	private static def isOneMachineFree():Boolean {
		for(var i:Long = 0 ; i<cluster.size ; i++) {
			if(!cluster(i)) {
				return true;
			}
		}
		return false;
	}
	
	private static def manageCommands(rule:Rule) {

		x10.io.Console.OUT.println("Managing a command");
		val tree:Tree = root.getTree();
		val there = here;
		
		// On utilise un Lock pour empêcher de réserver plusieurs fois la même machine en même temps
		monitor.lock();
		while(!isOneMachineFree()) {
			// Si aucune machine n'est libre, on endort le thread et on libère le Lock
			monitor.await();
		}

		var tmpId:Long = 0;
		var foundFreeMachine:Boolean = false;
		for(var i:Long = 0 ; i<cluster.size ; i++)  {
			if(!foundFreeMachine && !cluster(i)) {
				foundFreeMachine = true;
				tmpId = i;
				cluster(i) = true;
			}
		}
		Console.OUT.println("machine vide : " + tmpId);
		val idFree : Long = tmpId;
		// La machine est "réservée", on peut laisser un autre thread essayer d'en prendre une autre
		monitor.unlock();
		at (Place.places()(idFree)) async {
				
			// On vérifie que la machine esclave a les fichiers nécessaires
			for(dependency in rule.getDependencies()) {
				if(!(new File(dependency).exists())) {
					// on transfert une dépendance de la machine maitre vers l'esclave.
					sendFileToSlaves(dependency, there);
				}
			}
			if (rule.getCommand() != null && rule.getCommand().length() != 0n) {
				executeCommand(rule.getCommand());
			}
			// on transfert le fichier créé par la commande de la machine esclave vers le maitre.
			receiveFileFromSlaves(rule.getCreatedFilename()); 
			terminateRule(rule);
			// puis on considère que la règle a été exécutée.
			finish {
				at (there) async {
					// La règle est teminée, on peut libérer une machine (en prenant le Lock)
					monitor.lock();
					cluster(idFree) = false;
					Console.OUT.println("--- On libère la machine : " + idFree);
					// Une machine a été libérée, on peut réveiller les threads qui attendent
					monitor.release();
				}
			}
		}
	}
	
	private static def terminateRule(rule:Rule) {
		at (Place.FIRST_PLACE) async {
			val tree:Tree = root.getTree();
			browseTreeAndTerminateRule(rule, tree);
			findAndExecuteRules();
		}
	}
	
	private static def browseTreeAndTerminateRule(rule:Rule, tree:Tree) {
		if(tree != null) {
			// On parcourt le reste des sous-arbres s'ils existent
			if(tree.getSubtrees() != null && tree.getSubtrees().size > 0) {
				for(subtree in tree.getSubtrees()) {
					// Si on trouve la règle qui a été exécutée
					if(subtree.getRule().equals(rule) && subtree.isExecuted()) {
						var newSubtrees:Rail[Tree] = new Rail[Tree](tree.getSubtrees().size - 1);
						// Copie de tree.getSubtrees() en retirant la règle voulue.
						var j:Long = 0;
						for (var i:Long = 0 ; i < tree.getSubtrees().size ; i++) {
							if(!tree.getSubtrees()(i).getRule().equals(rule) || !subtree.isExecuted()) {
								newSubtrees(j) = tree.getSubtrees()(i);
								j++;
							}
						}
						tree.setSubtrees(newSubtrees);
					// Sinon on parcourt le reste de l'arbre	
					} else {
						browseTreeAndTerminateRule(rule,subtree);
					}
				}
			}
		}
	}
	
	private static def sendFileToSlaves(filename:String, toPlace:Place) {
		finish {
			at (Place.FIRST_PLACE) async java.lang.Runtime.getRuntime().exec("scp " + relativePathOnMaster + filename + " " + hostnames(toPlace.id) + ":/tmp/projet/");
		}
	}
	
	private static def receiveFileFromSlaves(filename:String) {
		finish {
			async java.lang.Runtime.getRuntime().exec("scp /tmp/projet/" + filename + " " + hostnames(0) + ":" + relativePathOnMaster);
		}
	}
	
	private static def executeCommand(command:String) {
		try {
			Console.OUT.println("Executing '" + command + "'...");
			// Il faut utiliser /bin/sh -c sinon les redirections sont impossibles
			var args:x10.interop.Java.array[String] = new x10.interop.Java.array[String](3n);
			args(0n) = "/bin/sh";
			args(1n) = "-c";
			args(2n) = command;
			val p = java.lang.Runtime.getRuntime().exec( args );
			try {
				p.waitFor();
			} catch (e:java.lang.InterruptedException) {	
			}
		} catch (e:java.io.IOException) {
			Console.OUT.println("La commande : '" + command + "' n'a pas pu être éxécutée.");
			e.printStackTrace();
		}
	}
}