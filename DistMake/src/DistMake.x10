import x10.array.Array;
import x10.array.Array_1;

public class DistMake {
	
    public static def main(args: Rail[String]) {
    	// ----- Récupération de la règle a exécuter et du makefile
    	if( args.size != 2 ) {
    		Console.OUT.println("Usage : [DistMake] <makefile name> <rootrule name>.");
    		System.killHere();
    	}
    	// ----- Parsing
    	val filename:String = args(0);
    	val rulename:String = args(1);
    	val parser:MakefileParser = new MakefileParser( filename );
    	parser.parse_makefile();
    	// ----- Boucle principale
    	var makefile:Tree = TreeBuilder.rulesToTree( parser.getResult(), rulename ); // initialisé par le parser
    	if(makefile == null) {
	    	Console.OUT.println("Règle <" + rulename + "> inexistante.");
	    	System.killHere();
    	}
    	makefile.display();
    	MakefileManager.init(makefile);
    }
}
