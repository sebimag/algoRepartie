import x10.io.*;
import x10.util.StringBuilder;
import x10.util.ArrayList;

public class MakefileParser {
	
	private var lexer:MakefileLexer;
	private var filename:String;
	private var rules:ArrayList[Rule];
	
	public def this( filename:String ) {
		this.lexer = new MakefileLexer( filename );
		this.filename = filename;
		this.rules = new ArrayList[Rule]();
	}
	
	public def getResult() {
		return this.rules;
	}
	
	public def parse_makefile() {
		// makefile -> (rule | EOL)*
		var currentName:StringBuilder = new StringBuilder();
		var t:MakefileLexer.Token = this.lexer.next( currentName );
		while ( t != MakefileLexer.EOF ) {
			if ( t == MakefileLexer.NAME ) {
				// Create a new rule
				var newRule:Rule = new Rule();
				newRule.setCreatedFilename( currentName.result() );
				// parse the rule
				t = this.parse_rule( newRule );
				// add the rule
				rules.add( newRule );
				currentName = new StringBuilder();
				if( t == MakefileLexer.NAME ) { // Happens when there is no blank lines between two rules
					currentName.addString( this.lexer.getLastName() );
				}
			} else if ( t == MakefileLexer.EOL ){
				// ignore additional EOL
				t = this.lexer.next( currentName );
			} else {
				this.lexer.unexpected( t, currentName.result(), "makefile" );
				t = this.lexer.next( currentName );
			}
		}
	}
	
	private def parse_rule( rule:Rule ):MakefileLexer.Token {
		// rule -> target COLON dependencies (EOL command | eps) (EOL | EOF)
		var currentName:StringBuilder = new StringBuilder();
		var t:MakefileLexer.Token = this.lexer.next( currentName );
		if ( t != MakefileLexer.COLON ) {
			this.lexer.unexpected( t, currentName.result(), "rule" );
		}
		var dependencies:ArrayList[String] = new ArrayList[String]();
		t = this.parse_dependencies( dependencies );
		rule.setDependencies( dependencies.toRail() );
		if ( t == MakefileLexer.EOL ) {
			t = this.lexer.next( currentName );
			if ( t == MakefileLexer.TAB ) {
				this.parse_command( rule );
				t = this.lexer.next( currentName );
			}
		} else if ( t == MakefileLexer.EOF ) {
			// nothing to do
		} else {
			this.lexer.unexpected( t, currentName.result(), "rule" );
		}
		return t;
		
	}
	
	private def parse_dependencies( dependencies:ArrayList[String] ):MakefileLexer.Token {
		// dependencies -> (NAME | TAB)*
		var currentName:StringBuilder = new StringBuilder();
		var t:MakefileLexer.Token = this.lexer.next( currentName );
		while ( t == MakefileLexer.NAME || t == MakefileLexer.TAB ) {
			if ( t == MakefileLexer.NAME ) {
				dependencies.add( currentName.result() );
				currentName = new StringBuilder();
			}
			t = this.lexer.next( currentName );
		}
		return t;
	}
	
	private def parse_command( rule:Rule ) {
		// command -> TAB (all but EOF EOL)*
		val command:String = this.lexer.getCommand();
		rule.setCommand( command );
	}
	
}