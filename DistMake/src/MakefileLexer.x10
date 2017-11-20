import x10.io.*;
import x10.util.StringBuilder;

public class MakefileLexer {
	
	/**
	 * Token types for the lexer
	 */
	
	public static type Token = int;
	
	public static val EOF:Token = 0n;
	public static val EOL:Token = 1n;
	public static val COLON:Token = 2n;
	public static val TAB:Token = 3n;
	public static val NAME:Token = 4n;
	public static val HASHTAG:Token = 5n;
	
	private static def get_token_name( t:Token ):String {
		switch(t) {
		case EOF:
			return "<EOF>";
		case EOL:
			return "<EOL>";
		case COLON:
			return ":";
		case TAB:
			return "<TAB>";
		case NAME:
			return "<NAME>";
		case HASHTAG:
			return "#";
		default:
			return "UNKNOWN TOKEN";
		}
	}
	
	public def getStringRepresentation( t:Token, name:String ):String {
		switch(t) {
		case EOF:
			return "";
		case EOL:
			return "\n";
		case COLON:
			return ":";
		case TAB:
			return "\t";
		case NAME:
			return name;
		case HASHTAG:
			return "#";
		default:
			return "";
		}
	}
	
	/**
	 * Attributes of one lexer
	 */
	
	private var reader:ReaderIterator[Char] = null;	// Reader to read the input file
	private var init:Boolean = false;				// Set to true after first update_current
	private var current:Char;						// Current read character
	private var lastName:String;
		
	/**
	 * Constructor and methods
	 */
    public def this( filename:String ) {
    	try {
	    	val inputFile = new File( filename );
	    	this.reader = inputFile.chars();
    	} catch (IOException) {
    		x10.io.Console.OUT.println("Unable to open file : <" + filename + ">");
    		System.killHere();
    	}
    }
    
    public def display( t:Token, name:String ):void {
    	if ( t == NAME ) {
    		x10.io.Console.OUT.print( get_token_name( t ) + name );
    	} else {
    		x10.io.Console.OUT.print( get_token_name( t ) );
    	}
    }
    
    private def update_current():void {
    	if( this.reader.hasNext() ) {
    		this.current = this.reader.next();
    	} else {
    		this.current = '}';
    	}
    }
    
    private def is_name_char( c:Char ):Boolean {
    	return c != ' ' && c != '\n' && c != '\r' && c!= ':' && c != '\t' && c!= '}' && c != '#';
    }
    
    private def parse_name():String {
    	var builder:StringBuilder = new StringBuilder();
    	while ( is_name_char( this.current ) ) {
    		builder.add( this.current );
    		this.update_current();
    	}
    	return builder.result();
    }

    /**
     * Used to get to the next token
     * If the next token is a Name, add the corresponding String to the StringBuilder
     */
    public def next( var currentName:StringBuilder ):Token {
    	if ( !this.init ) {
    		this.update_current();
    		init = true;
    	}
		for ( ; ; ) {
			switch( this.current ) {
			case ' ':
				this.update_current();
				break;
			case '#':
				this.getCommand();
				break;
			case ':':
				this.update_current();
				return COLON;
			case '\r': // for Windows systems
				this.update_current();
				// fallthrough
			case '\n':
				this.update_current();
				return EOL;
			case '\t':
				this.update_current();
				return TAB;
			case '}': // TODO : Trouver une meilleure facon
				// No update current here
				return EOF;
			default:
				// parse string here
				currentName.addString( this.parse_name() );
				this.lastName = currentName.result();
				return NAME;
			}
    	}
    }
    
    public def getCommand():String {
    	var builder:StringBuilder = new StringBuilder();
    	while ( this.current != '}' && this.current != '\n' ) {
    		builder.add( this.current );
    		this.update_current();
    	}
    	return builder.result();
    }
    
    public def getLastName():String {
    	return this.lastName;
    }
    
    public def unexpected( t:Token, name:String, addInfo:String ):void {
    	x10.io.Console.OUT.print( "ERROR: unexpected token " );
    	this.display( t, name );
    	if ( name != null ) {
    		x10.io.Console.OUT.println( " in " + addInfo );
    	}
    	System.killHere();
    }
    
}