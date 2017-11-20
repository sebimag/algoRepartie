
@x10.runtime.impl.java.X10Generated
public class MakefileLexer extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MakefileLexer> $RTT = 
        x10.rtt.NamedType.<MakefileLexer> make("MakefileLexer",
                                               MakefileLexer.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileLexer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MakefileLexer.class + " calling"); } 
        $_obj.current = $deserializer.readChar();
        $_obj.init = $deserializer.readBoolean();
        $_obj.lastName = $deserializer.readObject();
        $_obj.reader = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        MakefileLexer $_obj = new MakefileLexer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.current);
        $serializer.write(this.init);
        $serializer.write(this.lastName);
        $serializer.write(this.reader);
        
    }
    
    // constructor just for allocation
    public MakefileLexer(final java.lang.System[] $dummy) {
        
    }
    
    

    /**
	 * Token types for the lexer
	 */
    
    
    //#line 12 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public static int EOF = 0;
    
    //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public static int EOL = 1;
    
    //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public static int COLON = 2;
    
    //#line 15 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public static int TAB = 3;
    
    //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public static int NAME = 4;
    
    //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public static int HASHTAG = 5;
    
    
    //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    private static java.lang.String get_token_name(final int t) {
        
        //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        switch (t) {
            
            //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.EOF:
                
                //#line 22 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "<EOF>";
            
            //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.EOL:
                
                //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "<EOL>";
            
            //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.COLON:
                
                //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return ":";
            
            //#line 27 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.TAB:
                
                //#line 28 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "<TAB>";
            
            //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.NAME:
                
                //#line 30 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "<NAME>";
            
            //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.HASHTAG:
                
                //#line 32 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "#";
            
            //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            default:
                
                //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "UNKNOWN TOKEN";
        }
    }
    
    public static java.lang.String get_token_name$P(final int t) {
        return MakefileLexer.get_token_name((int)(t));
    }
    
    
    //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public java.lang.String getStringRepresentation(final int t, final java.lang.String name) {
        
        //#line 39 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        switch (t) {
            
            //#line 40 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.EOF:
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "";
            
            //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.EOL:
                
                //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "\n";
            
            //#line 44 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.COLON:
                
                //#line 45 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return ":";
            
            //#line 46 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.TAB:
                
                //#line 47 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "\t";
            
            //#line 48 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.NAME:
                
                //#line 49 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return name;
            
            //#line 50 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            case MakefileLexer.HASHTAG:
                
                //#line 51 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "#";
            
            //#line 52 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            default:
                
                //#line 53 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                return "";
        }
    }
    
    
    //#line 61 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    /**
	 * Attributes of one lexer
	 */
    public x10.io.ReaderIterator<x10.core.Char> reader;
    
    //#line 62 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public boolean init;
    
    //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public char current;
    
    //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public java.lang.String lastName;
    
    
    //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    /**
	 * Constructor and methods
	 */
    // creation method for java code (1-phase java constructor)
    public MakefileLexer(final java.lang.String filename) {
        this((java.lang.System[]) null);
        MakefileLexer$$init$S(filename);
    }
    
    // constructor for non-virtual call
    final public MakefileLexer MakefileLexer$$init$S(final java.lang.String filename) {
         {
            
            //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.__fieldInitializers_MakefileLexer();
            
            //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            try {{
                
                //#line 71 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                final x10.io.File inputFile = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(filename)))));
                
                //#line 72 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                final x10.io.ReaderIterator t$3663 = inputFile.chars();
                
                //#line 72 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                this.reader = ((x10.io.ReaderIterator)(t$3663));
            }}catch (final x10.io.IOException id$96) {
                
                //#line 74 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                final x10.io.Printer t$3665 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 74 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                final java.lang.String t$3664 = (("Unable to open file : <") + (filename));
                
                //#line 74 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                final java.lang.String t$3666 = ((t$3664) + (">"));
                
                //#line 74 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                t$3665.println(((java.lang.Object)(t$3666)));
                
                //#line 75 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                java.lang.System.exit(1);
            }
        }
        return this;
    }
    
    
    
    //#line 79 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public void display(final int t, final java.lang.String name) {
        
        //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final int t$3667 = MakefileLexer.NAME;
        
        //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final boolean t$3673 = ((int) t) == ((int) t$3667);
        
        //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3673) {
            
            //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final x10.io.Printer t$3669 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final java.lang.String t$3668 = MakefileLexer.get_token_name((int)(t));
            
            //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final java.lang.String t$3670 = ((t$3668) + (name));
            
            //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3669.print(((java.lang.String)(t$3670)));
        } else {
            
            //#line 83 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final x10.io.Printer t$3671 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 83 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final java.lang.String t$3672 = MakefileLexer.get_token_name((int)(t));
            
            //#line 83 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3671.print(((java.lang.String)(t$3672)));
        }
    }
    
    
    //#line 87 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    private void update_current() {
        
        //#line 88 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final x10.io.ReaderIterator t$3674 = ((x10.io.ReaderIterator)(this.reader));
        
        //#line 88 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final boolean t$3677 = ((x10.io.ReaderIterator<x10.core.Char>)t$3674).hasNext$O();
        
        //#line 88 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3677) {
            
            //#line 89 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final x10.io.ReaderIterator t$3675 = ((x10.io.ReaderIterator)(this.reader));
            
            //#line 89 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final char t$3676 = x10.core.Char.$unbox(((x10.io.ReaderIterator<x10.core.Char>)t$3675).next$G());
            
            //#line 89 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.current = t$3676;
        } else {
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.current = '}';
        }
    }
    
    public static void update_current$P(final MakefileLexer MakefileLexer) {
        MakefileLexer.update_current();
    }
    
    
    //#line 95 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    private boolean is_name_char$O(final char c) {
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        boolean t$3678 = ((char) c) != ((char) ' ');
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3678) {
            
            //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3678 = ((char) c) != ((char) '\n');
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        boolean t$3679 = t$3678;
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3679) {
            
            //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3679 = ((char) c) != ((char) '\r');
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        boolean t$3680 = t$3679;
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3680) {
            
            //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3680 = ((char) c) != ((char) ':');
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        boolean t$3681 = t$3680;
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3681) {
            
            //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3681 = ((char) c) != ((char) '\t');
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        boolean t$3682 = t$3681;
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3682) {
            
            //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3682 = ((char) c) != ((char) '}');
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        boolean t$3683 = t$3682;
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3683) {
            
            //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3683 = ((char) c) != ((char) '#');
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final boolean t$3684 = t$3683;
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        return t$3684;
    }
    
    public static boolean is_name_char$P$O(final char c, final MakefileLexer MakefileLexer) {
        return MakefileLexer.is_name_char$O((char)(c));
    }
    
    
    //#line 99 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    private java.lang.String parse_name() {
        
        //#line 100 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        x10.util.StringBuilder builder = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        while (true) {
            
            //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final char t$3685 = this.current;
            
            //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final boolean t$3688 = this.is_name_char$O((char)(t$3685));
            
            //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            if (!(t$3688)) {
                
                //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                break;
            }
            
            //#line 102 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final x10.util.StringBuilder t$3717 = ((x10.util.StringBuilder)(builder));
            
            //#line 102 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final char t$3718 = this.current;
            
            //#line 102 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3717.add((char)(t$3718));
            
            //#line 103 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.update_current();
        }
        
        //#line 105 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final x10.util.StringBuilder t$3689 = ((x10.util.StringBuilder)(builder));
        
        //#line 105 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final java.lang.String t$3690 = t$3689.result();
        
        //#line 105 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        return t$3690;
    }
    
    public static java.lang.String parse_name$P(final MakefileLexer MakefileLexer) {
        return MakefileLexer.parse_name();
    }
    
    
    //#line 112 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    /**
     * Used to get to the next token
     * If the next token is a Name, add the corresponding String to the StringBuilder
     */
    public int next$O(x10.util.StringBuilder currentName) {
        
        //#line 113 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final boolean t$3691 = this.init;
        
        //#line 113 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final boolean t$3692 = !(t$3691);
        
        //#line 113 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3692) {
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.update_current();
            
            //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.init = true;
        }
        
        //#line 117 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        for (;
             ;
             ) {
            
            //#line 118 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final char t$3719 = this.current;
            
            //#line 118 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            switch (t$3719) {
                
                //#line 119 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case ' ':
                    
                    //#line 120 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.update_current();
                    
                    //#line 121 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    break;
                
                //#line 122 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case '#':
                    
                    //#line 123 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.getCommand();
                    
                    //#line 124 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    break;
                
                //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case ':':
                    
                    //#line 126 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.update_current();
                    
                    //#line 127 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final int t$3720 = MakefileLexer.COLON;
                    
                    //#line 127 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    return t$3720;
                
                //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case '\r':
                    
                    //#line 129 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.update_current();
                
                //#line 131 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case '\n':
                    
                    //#line 132 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.update_current();
                    
                    //#line 133 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final int t$3721 = MakefileLexer.EOL;
                    
                    //#line 133 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    return t$3721;
                
                //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case '\t':
                    
                    //#line 135 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.update_current();
                    
                    //#line 136 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final int t$3722 = MakefileLexer.TAB;
                    
                    //#line 136 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    return t$3722;
                
                //#line 137 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                case '}':
                    
                    //#line 139 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final int t$3723 = MakefileLexer.EOF;
                    
                    //#line 139 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    return t$3723;
                
                //#line 140 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                default:
                    
                    //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final x10.util.StringBuilder t$3724 = ((x10.util.StringBuilder)(currentName));
                    
                    //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final java.lang.String t$3725 = this.parse_name();
                    
                    //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    t$3724.addString(((java.lang.String)(t$3725)));
                    
                    //#line 143 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final x10.util.StringBuilder t$3726 = ((x10.util.StringBuilder)(currentName));
                    
                    //#line 143 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final java.lang.String t$3727 = t$3726.result();
                    
                    //#line 143 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    this.lastName = ((java.lang.String)(t$3727));
                    
                    //#line 144 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    final int t$3728 = MakefileLexer.NAME;
                    
                    //#line 144 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                    return t$3728;
            }
        }
    }
    
    
    //#line 149 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public java.lang.String getCommand() {
        
        //#line 150 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        x10.util.StringBuilder builder = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        while (true) {
            
            //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final char t$3704 = this.current;
            
            //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            boolean t$3706 = ((char) t$3704) != ((char) '}');
            
            //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            if (t$3706) {
                
                //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                final char t$3705 = this.current;
                
                //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                t$3706 = ((char) t$3705) != ((char) '\n');
            }
            
            //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final boolean t$3709 = t$3706;
            
            //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            if (!(t$3709)) {
                
                //#line 151 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
                break;
            }
            
            //#line 152 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final x10.util.StringBuilder t$3729 = ((x10.util.StringBuilder)(builder));
            
            //#line 152 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final char t$3730 = this.current;
            
            //#line 152 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3729.add((char)(t$3730));
            
            //#line 153 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            this.update_current();
        }
        
        //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final x10.util.StringBuilder t$3710 = ((x10.util.StringBuilder)(builder));
        
        //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final java.lang.String t$3711 = t$3710.result();
        
        //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        return t$3711;
    }
    
    
    //#line 158 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public java.lang.String getLastName() {
        
        //#line 159 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final java.lang.String t$3712 = ((java.lang.String)(this.lastName));
        
        //#line 159 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        return t$3712;
    }
    
    
    //#line 162 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    public void unexpected(final int t, final java.lang.String name, final java.lang.String addInfo) {
        
        //#line 163 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final x10.io.Printer t$3713 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 163 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        t$3713.print(((java.lang.String)("ERROR: unexpected token ")));
        
        //#line 164 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        this.display((int)(t), ((java.lang.String)(name)));
        
        //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        final boolean t$3716 = ((name) != (null));
        
        //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        if (t$3716) {
            
            //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final x10.io.Printer t$3714 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            final java.lang.String t$3715 = ((" in ") + (addInfo));
            
            //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
            t$3714.println(((java.lang.Object)(t$3715)));
        }
        
        //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        java.lang.System.exit(1);
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public MakefileLexer MakefileLexer$$this$MakefileLexer() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        return MakefileLexer.this;
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
    final public void __fieldInitializers_MakefileLexer() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        this.reader = null;
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        this.init = false;
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        this.current = '\000';
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileLexer.x10"
        this.lastName = null;
    }
    
    public static int get$EOF() {
        return MakefileLexer.EOF;
    }
    
    public static int get$EOL() {
        return MakefileLexer.EOL;
    }
    
    public static int get$COLON() {
        return MakefileLexer.COLON;
    }
    
    public static int get$TAB() {
        return MakefileLexer.TAB;
    }
    
    public static int get$NAME() {
        return MakefileLexer.NAME;
    }
    
    public static int get$HASHTAG() {
        return MakefileLexer.HASHTAG;
    }
}

