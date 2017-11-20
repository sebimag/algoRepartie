import x10.util.ArrayList;
import x10.io.*;


public class TreeBuilder {
	
	private static def findRuleByName( rules:ArrayList[Rule], name:String ):Rule {
		for ( rule in rules ) {
			if ( rule.getCreatedFilename().equals( name ) ) {
				return rule;
			}
		}
		return null;
	}
	
	public static def rulesToTree( rules:ArrayList[Rule], ruleName:String ):Tree {
		var finalTree:Tree = null;
		var rootRule:Rule = TreeBuilder.findRuleByName( rules, ruleName );
		if( rootRule != null ) {
			finalTree = new Tree();
			finalTree.setRule( rootRule );
			var subtrees:ArrayList[Tree] = new ArrayList[Tree]();
			for ( dependency in rootRule.getDependencies() ) {
				var child:Tree = TreeBuilder.rulesToTree( rules, dependency );
				if(child != null) {
					subtrees.add(child);
				}
			}
			finalTree.setSubtrees( subtrees.toRail() );
		}
		return finalTree;
	}
	
}