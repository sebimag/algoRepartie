import x10.lang.Rail;
import x10.io.File;

public class Rule {
	private var command:String;
	private var dependencies:Rail[String];
	private var createdFilename:String;
	
	public def equals(rule:Rule):Boolean {
		if(!this.command.equals(rule.getCommand())) {
			return false;
		}
		if(!this.createdFilename.equals(rule.getCreatedFilename())) {
			return false;
		}
		if(this.dependencies.size != rule.getDependencies().size) {
			return false;
		}
		for(var i:Long = 0 ; i<this.dependencies.size ; i++) {
			if(!this.dependencies(i).equals(rule.getDependencies()(i))) {
				return false;
			}
		}
		return true;
	}
	
	public def getCommand():String {
		return this.command;
	}
	
	public def getDependencies():Rail[String] {
		return this.dependencies;
	}
	
	public def getCreatedFilename():String {
		return this.createdFilename;
	}
	
	public def lastModifiedDependency():Long {
		var max : Long = 0;
		for(dependency in dependencies) {
			var tmp : Long = new File(dependency).lastModified();
			if(max < tmp) {
				max = tmp;
			}
		}
		return max;
	}
	
	public def setCommand(command:String){
		this.command = command;
	}
	
	public def setDependencies(dependencies:Rail[String]){
		this.dependencies = dependencies;
	}
	
	public def setCreatedFilename(createdFilename:String){
		this.createdFilename = createdFilename;
	}
	
	public def display() {
		x10.io.Console.OUT.print( "Rule:[");
		x10.io.Console.OUT.println( " CreatedFilename:<" + createdFilename + ">" );
		x10.io.Console.OUT.print( " Dependencies:[ ");
		for ( dep in dependencies ) {
			x10.io.Console.OUT.println( " <" + dep + ">" );
		}
		x10.io.Console.OUT.println( " ]");
		x10.io.Console.OUT.println( " Command:<" + command + ">" );


	}

}