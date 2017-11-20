
@x10.runtime.impl.java.X10Generated
public class DistMake extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DistMake> $RTT = 
        x10.rtt.NamedType.<DistMake> make("DistMake",
                                          DistMake.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(DistMake $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + DistMake.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        DistMake $_obj = new DistMake((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public DistMake(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 6 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            DistMake.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final long t$121020 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final boolean t$121022 = ((long) t$121020) != ((long) 2L);
        
        //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        if (t$121022) {
            
            //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            final x10.io.Printer t$121021 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            t$121021.println(((java.lang.Object)("Usage : [DistMake] <makefile name> <rootrule name>.")));
            
            //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            java.lang.System.exit(1);
        }
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final java.lang.String filename = ((java.lang.String[])args.value)[(int)0L];
        
        //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final java.lang.String rulename = ((java.lang.String[])args.value)[(int)1L];
        
        //#line 15 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final MakefileParser parser = new MakefileParser((java.lang.System[]) null).MakefileParser$$init$S(((java.lang.String)(filename)));
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        parser.parse_makefile();
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final x10.util.ArrayList t$121023 = ((x10.util.ArrayList)(parser.getResult()));
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        Tree makefile = TreeBuilder.rulesToTree__0$1Rule$2(((x10.util.ArrayList)(t$121023)), ((java.lang.String)(rulename)));
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final Tree t$121024 = ((Tree)(makefile));
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final boolean t$121028 = ((t$121024) == (null));
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        if (t$121028) {
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            final x10.io.Printer t$121026 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            final java.lang.String t$121025 = (("R\350gle <") + (rulename));
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            final java.lang.String t$121027 = ((t$121025) + ("> inexistante."));
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            t$121026.println(((java.lang.Object)(t$121027)));
            
            //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            java.lang.System.exit(1);
        }
        
        //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final Tree t$121029 = ((Tree)(makefile));
        
        //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        t$121029.display();
        
        //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        final Tree t$121030 = ((Tree)(makefile));
        
        //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        MakefileManager.init(((Tree)(t$121030)));
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
    final public DistMake DistMake$$this$DistMake() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
        return DistMake.this;
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
    // creation method for java code (1-phase java constructor)
    public DistMake() {
        this((java.lang.System[]) null);
        DistMake$$init$S();
    }
    
    // constructor for non-virtual call
    final public DistMake DistMake$$init$S() {
         {
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
            this.__fieldInitializers_DistMake();
        }
        return this;
    }
    
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/DistMake.x10"
    final public void __fieldInitializers_DistMake() {
        
    }
}

