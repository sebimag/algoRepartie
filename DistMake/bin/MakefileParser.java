
@x10.runtime.impl.java.X10Generated
public class MakefileParser extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MakefileParser> $RTT = 
        x10.rtt.NamedType.<MakefileParser> make("MakefileParser",
                                                MakefileParser.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileParser $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MakefileParser.class + " calling"); } 
        $_obj.filename = $deserializer.readObject();
        $_obj.lexer = $deserializer.readObject();
        $_obj.rules = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        MakefileParser $_obj = new MakefileParser((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.filename);
        $serializer.write(this.lexer);
        $serializer.write(this.rules);
        
    }
    
    // constructor just for allocation
    public MakefileParser(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    public MakefileLexer lexer;
    
    //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    public java.lang.String filename;
    
    //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    public x10.util.ArrayList<Rule> rules;
    
    
    //#line 11 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    // creation method for java code (1-phase java constructor)
    public MakefileParser(final java.lang.String filename) {
        this((java.lang.System[]) null);
        MakefileParser$$init$S(filename);
    }
    
    // constructor for non-virtual call
    final public MakefileParser MakefileParser$$init$S(final java.lang.String filename) {
         {
            
            //#line 11 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            
            
            //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            this.__fieldInitializers_MakefileParser();
            
            //#line 12 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final MakefileLexer t$3275 = ((MakefileLexer)(new MakefileLexer((java.lang.System[]) null).MakefileLexer$$init$S(((java.lang.String)(filename)))));
            
            //#line 12 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            this.lexer = ((MakefileLexer)(t$3275));
            
            //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            this.filename = ((java.lang.String)(filename));
            
            //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final x10.util.ArrayList t$3276 = ((x10.util.ArrayList)(new x10.util.ArrayList<Rule>((java.lang.System[]) null, Rule.$RTT).x10$util$ArrayList$$init$S()));
            
            //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            this.rules = ((x10.util.ArrayList)(t$3276));
        }
        return this;
    }
    
    
    
    //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    public x10.util.ArrayList getResult() {
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.util.ArrayList t$3277 = ((x10.util.ArrayList)(this.rules));
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        return t$3277;
    }
    
    
    //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    public void parse_makefile() {
        
        //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        x10.util.StringBuilder currentName = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final MakefileLexer t$3278 = ((MakefileLexer)(this.lexer));
        
        //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.util.StringBuilder t$3279 = ((x10.util.StringBuilder)(currentName));
        
        //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        int t = t$3278.next$O(((x10.util.StringBuilder)(t$3279)));
        
        //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        while (true) {
            
            //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3280 = t;
            
            //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3281 = MakefileLexer.EOF;
            
            //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final boolean t$3312 = ((int) t$3280) != ((int) t$3281);
            
            //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (!(t$3312)) {
                
                //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                break;
            }
            
            //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3365 = t;
            
            //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3366 = MakefileLexer.NAME;
            
            //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final boolean t$3367 = ((int) t$3365) == ((int) t$3366);
            
            //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (t$3367) {
                
                //#line 28 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                Rule newRule$3368 = new Rule((java.lang.System[]) null).Rule$$init$S();
                
                //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final Rule t$3369 = ((Rule)(newRule$3368));
                
                //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.StringBuilder t$3370 = ((x10.util.StringBuilder)(currentName));
                
                //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final java.lang.String t$3371 = t$3370.result();
                
                //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                t$3369.setCreatedFilename(((java.lang.String)(t$3371)));
                
                //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final Rule t$3372 = ((Rule)(newRule$3368));
                
                //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3373 = this.parse_rule$O(((Rule)(t$3372)));
                
                //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                t = t$3373;
                
                //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.ArrayList t$3374 = ((x10.util.ArrayList)(this.rules));
                
                //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final Rule t$3375 = ((Rule)(newRule$3368));
                
                //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                ((x10.util.ArrayList<Rule>)t$3374).add__0x10$util$ArrayList$$T$O(((Rule)(t$3375)));
                
                //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.StringBuilder t$3376 = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
                
                //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                currentName = ((x10.util.StringBuilder)(t$3376));
                
                //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3377 = t;
                
                //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3378 = MakefileLexer.NAME;
                
                //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final boolean t$3379 = ((int) t$3377) == ((int) t$3378);
                
                //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                if (t$3379) {
                    
                    //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final x10.util.StringBuilder t$3380 = ((x10.util.StringBuilder)(currentName));
                    
                    //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final MakefileLexer t$3381 = ((MakefileLexer)(this.lexer));
                    
                    //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final java.lang.String t$3382 = t$3381.getLastName();
                    
                    //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    t$3380.addString(((java.lang.String)(t$3382)));
                }
            } else {
                
                //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3383 = t;
                
                //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3384 = MakefileLexer.EOL;
                
                //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final boolean t$3385 = ((int) t$3383) == ((int) t$3384);
                
                //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                if (t$3385) {
                    
                    //#line 40 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final MakefileLexer t$3386 = ((MakefileLexer)(this.lexer));
                    
                    //#line 40 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final x10.util.StringBuilder t$3387 = ((x10.util.StringBuilder)(currentName));
                    
                    //#line 40 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final int t$3388 = t$3386.next$O(((x10.util.StringBuilder)(t$3387)));
                    
                    //#line 40 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    t = t$3388;
                } else {
                    
                    //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final MakefileLexer t$3389 = ((MakefileLexer)(this.lexer));
                    
                    //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final int t$3390 = t;
                    
                    //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final x10.util.StringBuilder t$3391 = ((x10.util.StringBuilder)(currentName));
                    
                    //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final java.lang.String t$3392 = t$3391.result();
                    
                    //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    t$3389.unexpected((int)(t$3390), ((java.lang.String)(t$3392)), ((java.lang.String)("makefile")));
                    
                    //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final MakefileLexer t$3393 = ((MakefileLexer)(this.lexer));
                    
                    //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final x10.util.StringBuilder t$3394 = ((x10.util.StringBuilder)(currentName));
                    
                    //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    final int t$3395 = t$3393.next$O(((x10.util.StringBuilder)(t$3394)));
                    
                    //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                    t = t$3395;
                }
            }
        }
    }
    
    
    //#line 48 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    private int parse_rule$O(final Rule rule) {
        
        //#line 50 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        x10.util.StringBuilder currentName = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 51 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final MakefileLexer t$3313 = ((MakefileLexer)(this.lexer));
        
        //#line 51 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.util.StringBuilder t$3314 = ((x10.util.StringBuilder)(currentName));
        
        //#line 51 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        int t = t$3313.next$O(((x10.util.StringBuilder)(t$3314)));
        
        //#line 52 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3315 = t;
        
        //#line 52 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3316 = MakefileLexer.COLON;
        
        //#line 52 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final boolean t$3321 = ((int) t$3315) != ((int) t$3316);
        
        //#line 52 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        if (t$3321) {
            
            //#line 53 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final MakefileLexer t$3318 = ((MakefileLexer)(this.lexer));
            
            //#line 53 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3319 = t;
            
            //#line 53 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final x10.util.StringBuilder t$3317 = ((x10.util.StringBuilder)(currentName));
            
            //#line 53 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final java.lang.String t$3320 = t$3317.result();
            
            //#line 53 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            t$3318.unexpected((int)(t$3319), ((java.lang.String)(t$3320)), ((java.lang.String)("rule")));
        }
        
        //#line 55 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        x10.util.ArrayList dependencies = new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S();
        
        //#line 56 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.util.ArrayList t$3322 = ((x10.util.ArrayList)(dependencies));
        
        //#line 56 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3323 = this.parse_dependencies__0$1x10$lang$String$2$O(((x10.util.ArrayList)(t$3322)));
        
        //#line 56 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        t = t$3323;
        
        //#line 57 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.util.ArrayList t$3324 = ((x10.util.ArrayList)(dependencies));
        
        //#line 57 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.core.Rail t$3325 = ((x10.core.Rail<java.lang.String>)
                                       ((x10.util.ArrayList<java.lang.String>)t$3324).toRail());
        
        //#line 57 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        rule.setDependencies__0$1x10$lang$String$2(((x10.core.Rail)(t$3325)));
        
        //#line 58 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3326 = t;
        
        //#line 58 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3327 = MakefileLexer.EOL;
        
        //#line 58 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final boolean t$3344 = ((int) t$3326) == ((int) t$3327);
        
        //#line 58 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        if (t$3344) {
            
            //#line 59 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final MakefileLexer t$3328 = ((MakefileLexer)(this.lexer));
            
            //#line 59 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final x10.util.StringBuilder t$3329 = ((x10.util.StringBuilder)(currentName));
            
            //#line 59 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3330 = t$3328.next$O(((x10.util.StringBuilder)(t$3329)));
            
            //#line 59 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            t = t$3330;
            
            //#line 60 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3331 = t;
            
            //#line 60 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3332 = MakefileLexer.TAB;
            
            //#line 60 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final boolean t$3336 = ((int) t$3331) == ((int) t$3332);
            
            //#line 60 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (t$3336) {
                
                //#line 61 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                this.parse_command(((Rule)(rule)));
                
                //#line 62 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final MakefileLexer t$3333 = ((MakefileLexer)(this.lexer));
                
                //#line 62 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.StringBuilder t$3334 = ((x10.util.StringBuilder)(currentName));
                
                //#line 62 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3335 = t$3333.next$O(((x10.util.StringBuilder)(t$3334)));
                
                //#line 62 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                t = t$3335;
            }
        } else {
            
            //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3337 = t;
            
            //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3338 = MakefileLexer.EOF;
            
            //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final boolean t$3343 = ((int) t$3337) == ((int) t$3338);
            
            //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (t$3343) {
                
            } else {
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final MakefileLexer t$3340 = ((MakefileLexer)(this.lexer));
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3341 = t;
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.StringBuilder t$3339 = ((x10.util.StringBuilder)(currentName));
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final java.lang.String t$3342 = t$3339.result();
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                t$3340.unexpected((int)(t$3341), ((java.lang.String)(t$3342)), ((java.lang.String)("rule")));
            }
        }
        
        //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3345 = t;
        
        //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        return t$3345;
    }
    
    public static int parse_rule$P$O(final Rule rule, final MakefileParser MakefileParser) {
        return MakefileParser.parse_rule$O(((Rule)(rule)));
    }
    
    
    //#line 73 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    private int parse_dependencies__0$1x10$lang$String$2$O(final x10.util.ArrayList dependencies) {
        
        //#line 75 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        x10.util.StringBuilder currentName = new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S();
        
        //#line 76 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final MakefileLexer t$3346 = ((MakefileLexer)(this.lexer));
        
        //#line 76 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final x10.util.StringBuilder t$3347 = ((x10.util.StringBuilder)(currentName));
        
        //#line 76 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        int t = t$3346.next$O(((x10.util.StringBuilder)(t$3347)));
        
        //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        while (true) {
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3348 = t;
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3349 = MakefileLexer.NAME;
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            boolean t$3352 = ((int) t$3348) == ((int) t$3349);
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (!(t$3352)) {
                
                //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3350 = t;
                
                //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final int t$3351 = MakefileLexer.TAB;
                
                //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                t$3352 = ((int) t$3350) == ((int) t$3351);
            }
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final boolean t$3362 = t$3352;
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (!(t$3362)) {
                
                //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                break;
            }
            
            //#line 78 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3396 = t;
            
            //#line 78 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3397 = MakefileLexer.NAME;
            
            //#line 78 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final boolean t$3398 = ((int) t$3396) == ((int) t$3397);
            
            //#line 78 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            if (t$3398) {
                
                //#line 79 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.StringBuilder t$3399 = ((x10.util.StringBuilder)(currentName));
                
                //#line 79 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final java.lang.String t$3400 = t$3399.result();
                
                //#line 79 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                ((x10.util.ArrayList<java.lang.String>)dependencies).add__0x10$util$ArrayList$$T$O(((java.lang.String)(t$3400)));
                
                //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                final x10.util.StringBuilder t$3401 = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
                
                //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
                currentName = ((x10.util.StringBuilder)(t$3401));
            }
            
            //#line 82 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final MakefileLexer t$3402 = ((MakefileLexer)(this.lexer));
            
            //#line 82 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final x10.util.StringBuilder t$3403 = ((x10.util.StringBuilder)(currentName));
            
            //#line 82 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            final int t$3404 = t$3402.next$O(((x10.util.StringBuilder)(t$3403)));
            
            //#line 82 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
            t = t$3404;
        }
        
        //#line 84 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final int t$3363 = t;
        
        //#line 84 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        return t$3363;
    }
    
    public static int parse_dependencies$P__0$1x10$lang$String$2$O(final x10.util.ArrayList<java.lang.String> dependencies, final MakefileParser MakefileParser) {
        return MakefileParser.parse_dependencies__0$1x10$lang$String$2$O(((x10.util.ArrayList)(dependencies)));
    }
    
    
    //#line 87 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    private void parse_command(final Rule rule) {
        
        //#line 89 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final MakefileLexer t$3364 = ((MakefileLexer)(this.lexer));
        
        //#line 89 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        final java.lang.String command = t$3364.getCommand();
        
        //#line 90 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        rule.setCommand(((java.lang.String)(command)));
    }
    
    public static void parse_command$P(final Rule rule, final MakefileParser MakefileParser) {
        MakefileParser.parse_command(((Rule)(rule)));
    }
    
    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    final public MakefileParser MakefileParser$$this$MakefileParser() {
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        return MakefileParser.this;
    }
    
    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
    final public void __fieldInitializers_MakefileParser() {
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        this.lexer = null;
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        this.filename = null;
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileParser.x10"
        this.rules = null;
    }
}

