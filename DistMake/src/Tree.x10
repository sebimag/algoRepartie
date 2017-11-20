import x10.lang.Rail;
import x10.io.*;

public class Tree {
	private var rule:Rule;
	private var subtrees:Rail[Tree];
	private var isExecuted:Boolean = false;
	
	public def getSubtrees():Rail[Tree] {
		return this.subtrees;
	}
	
	public def getRule():Rule {
		return this.rule;
	}
	
	public def isExecuted():Boolean {
		return this.isExecuted;
	}
	
	public def setSubtrees(subtrees:Rail[Tree]) {
		this.subtrees = subtrees;
	}
	
	public def setRule(rule:Rule) {
		this.rule = rule;
	}
	
	public def setIsExecuted(isExecuted:Boolean) {
		this.isExecuted = isExecuted;
	}
	
	private def recDisplay(depth:long) {
		x10.io.Console.OUT.println("Depth " + depth);
		this.rule.display();
		if(this.getSubtrees() != null && this.getSubtrees().size > 0) { 
			for ( dep in this.getSubtrees() ) {
				dep.recDisplay(depth+1);
			}
		}
	}
	
	public def display() {
		this.recDisplay(0);
	}
}
