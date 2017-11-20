
@x10.runtime.impl.java.X10Generated
public class MakefileManager extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MakefileManager> $RTT = 
        x10.rtt.NamedType.<MakefileManager> make("MakefileManager",
                                                 MakefileManager.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MakefileManager.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        MakefileManager $_obj = new MakefileManager((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public MakefileManager(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static java.lang.String relativePathOnMaster = null;
    
    //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static x10.core.Rail<java.lang.String> hostnames;
    
    //#line 11 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static x10.core.Rail<x10.core.Boolean> cluster;
    
    //#line 12 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static Root root;
    
    //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static x10.util.concurrent.Monitor monitor;
    
    
    //#line 15 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    public static void init(final Tree tree) {
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        MakefileManager.readHostfile();
        
        //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.io.Printer t$120585 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.core.Rail t$120583 = ((x10.core.Rail)(MakefileManager.get$cluster()));
        
        //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final long t$120584 = ((x10.core.Rail<x10.core.Boolean>)t$120583).size;
        
        //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final java.lang.String t$120586 = (("Taille du cluster : ") + ((x10.core.Long.$box(t$120584))));
        
        //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        t$120585.println(((java.lang.Object)(t$120586)));
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        long i$120782 = 0L;
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        for (;
             true;
             ) {
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120783 = i$120782;
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120784 = ((x10.core.Rail)(MakefileManager.get$cluster()));
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120785 = ((x10.core.Rail<x10.core.Boolean>)t$120784).size;
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120786 = ((t$120783) < (((long)(t$120785))));
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (!(t$120786)) {
                
                //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                break;
            }
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120778 = ((x10.core.Rail)(MakefileManager.get$cluster()));
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120779 = i$120782;
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            ((boolean[])t$120778.value)[(int)t$120779] = false;
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120780 = i$120782;
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120781 = ((t$120780) + (((long)(1L))));
            
            //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            i$120782 = t$120781;
        }
        
        //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final Root t$120596 = ((Root)(MakefileManager.get$root()));
        
        //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        t$120596.setTree(((Tree)(tree)));
        {
            
            //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.xrx.FinishState fs$120896 = x10.xrx.Runtime.startFinish();
            
            //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                {
                    
                    //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$12())));
                }
            }}catch (java.lang.Throwable ct$120894) {
                
                //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$120894)));
                
                //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$120896)));
             }}
            }
        }
    
    
    //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void readHostfile() {
        
        //#line 32 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        java.lang.String path = x10.lang.System.getenv(((java.lang.String)("X10_ABSOLUTEPATH")));
        
        //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final java.lang.String t$120597 = ((java.lang.String)(path));
        
        //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final boolean t$120607 = ((t$120597) != (null));
        
        //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        if (t$120607) {
            
            //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String t$120598 = ((java.lang.String)(path));
            
            //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.io.File file = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$120598)));
            
            //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120606 = file.exists$O();
            
            //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120606) {
                
                //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                long count = 0L;
                
                //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.io.ReaderIterator t$120792 = file.lines();
                
                //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.lang.Iterator line$120793 = ((x10.lang.Iterator<java.lang.String>)
                                                        ((x10.io.ReaderIterator<java.lang.String>)t$120792).iterator());
                
                //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final boolean t$120794 = ((x10.lang.Iterator<java.lang.String>)line$120793).hasNext$O();
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    if (!(t$120794)) {
                        
                        //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        break;
                    }
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final java.lang.String line$120787 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)line$120793).next$G()));
                    
                    //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final x10.core.Rail t$120788 = ((x10.core.Rail)(MakefileManager.get$hostnames()));
                    
                    //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final long t$120789 = count;
                    
                    //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    ((java.lang.String[])t$120788.value)[(int)t$120789] = line$120787;
                    
                    //#line 39 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final long t$120790 = count;
                    
                    //#line 39 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final long t$120791 = ((t$120790) + (((long)(1L))));
                    
                    //#line 39 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    count = t$120791;
                }
            }
        }
    }
    
    public static void readHostfile$P() {
        MakefileManager.readHostfile();
    }
    
    
    //#line 45 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void findAndExecuteRules() {
        
        //#line 46 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final Root t$120608 = ((Root)(MakefileManager.get$root()));
        
        //#line 46 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final Tree tree = t$120608.getTree();
        
        //#line 47 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        x10.util.ArrayList leafRules = new x10.util.ArrayList<Rule>((java.lang.System[]) null, Rule.$RTT).x10$util$ArrayList$$init$S();
        
        //#line 48 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.ArrayList t$120609 = ((x10.util.ArrayList)(leafRules));
        
        //#line 48 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.ArrayList t$120610 = MakefileManager.browseTreeAndFindRules__0$1Rule$2(((x10.util.ArrayList)(t$120609)), ((Tree)(tree)));
        
        //#line 48 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        leafRules = ((x10.util.ArrayList)(t$120610));
        
        //#line 49 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.ArrayList t$120611 = ((x10.util.ArrayList)(leafRules));
        
        //#line 49 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final long t$120612 = ((x10.util.ArrayList<Rule>)t$120611).size$O();
        
        //#line 49 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final boolean t$120614 = ((t$120612) > (((long)(0L))));
        
        //#line 49 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        if (t$120614) {
            
            //#line 50 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.util.ArrayList t$120613 = ((x10.util.ArrayList)(leafRules));
            
            //#line 50 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            MakefileManager.distributedExecution__0$1Rule$2(((x10.util.ArrayList)(t$120613)));
        }
    }
    
    public static void findAndExecuteRules$P() {
        MakefileManager.findAndExecuteRules();
    }
    
    
    //#line 59 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    /**
	 * Parcourt l'arbre et retourne les règles qui 
	 * sont représentées par des feuilles dans l'arbre
	 * et qui ne sont pas déjà en cours d'exécution.
	 */
    private static x10.util.ArrayList browseTreeAndFindRules__0$1Rule$2(final x10.util.ArrayList<Rule> list, final Tree tree) {
        
        //#line 60 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        x10.util.ArrayList tmp = list;
        
        //#line 61 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final boolean t$120632 = ((tree) != (null));
        
        //#line 61 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        if (t$120632) {
            
            //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120615 = tree.getSubtrees();
            
            //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            boolean t$120618 = ((t$120615) != (null));
            
            //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120618) {
                
                //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120616 = tree.getSubtrees();
                
                //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120617 = ((x10.core.Rail<Tree>)t$120616).size;
                
                //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120618 = ((t$120617) > (((long)(0L))));
            }
            
            //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120631 = t$120618;
            
            //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120631) {
                
                //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail rail$120508 = tree.getSubtrees();
                
                //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long size$120509 = ((x10.core.Rail<Tree>)rail$120508).size;
                
                //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                long idx$120801 = 0L;
                {
                    
                    //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final Tree[] rail$120508$value$120935 = ((Tree[])rail$120508.value);
                    
                    //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120802 = idx$120801;
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final boolean t$120803 = ((t$120802) < (((long)(size$120509))));
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        if (!(t$120803)) {
                            
                            //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            break;
                        }
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120797 = idx$120801;
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final Tree subtree$120798 = ((Tree)(((Tree)rail$120508$value$120935[(int)t$120797])));
                        
                        //#line 65 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final x10.util.ArrayList t$120795 = ((x10.util.ArrayList)(tmp));
                        
                        //#line 65 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final x10.util.ArrayList t$120796 = MakefileManager.browseTreeAndFindRules__0$1Rule$2(((x10.util.ArrayList)(t$120795)), ((Tree)(subtree$120798)));
                        
                        //#line 65 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        tmp = ((x10.util.ArrayList)(t$120796));
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120799 = idx$120801;
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120800 = ((t$120799) + (((long)(1L))));
                        
                        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        idx$120801 = t$120800;
                    }
                }
            } else {
                
                //#line 68 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final boolean t$120627 = tree.isExecuted$O();
                
                //#line 68 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final boolean t$120630 = !(t$120627);
                
                //#line 68 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                if (t$120630) {
                    
                    //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final x10.util.ArrayList t$120628 = ((x10.util.ArrayList)(tmp));
                    
                    //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final Rule t$120629 = tree.getRule();
                    
                    //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    ((x10.util.ArrayList<Rule>)t$120628).add__0x10$util$ArrayList$$T$O(((Rule)(t$120629)));
                    
                    //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    tree.setIsExecuted((boolean)(true));
                }
            }
        }
        
        //#line 73 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.ArrayList t$120633 = ((x10.util.ArrayList)(tmp));
        
        //#line 73 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        return t$120633;
    }
    
    public static x10.util.ArrayList browseTreeAndFindRules$P__0$1Rule$2(final x10.util.ArrayList<Rule> list, final Tree tree) {
        return MakefileManager.browseTreeAndFindRules__0$1Rule$2(((x10.util.ArrayList)(list)), ((Tree)(tree)));
    }
    
    
    //#line 76 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void distributedExecution__0$1Rule$2(final x10.util.ArrayList<Rule> rules) {
        
        //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.ListIterator rule$120532 = ((x10.util.ListIterator<Rule>)
                                                    ((x10.util.ArrayList<Rule>)rules).iterator());
        
        //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        for (;
             true;
             ) {
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120643 = ((x10.util.ListIterator<Rule>)rule$120532).hasNext$O();
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (!(t$120643)) {
                
                //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                break;
            }
            
            //#line 77 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final Rule rule$120804 = ((Rule)(((x10.util.ListIterator<Rule>)rule$120532).next$G()));
            
            //#line 78 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String t$120805 = rule$120804.getCreatedFilename();
            
            //#line 78 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.io.File createdFile$120806 = new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(t$120805);
            
            //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.io.File t$120807 = ((x10.io.File)(createdFile$120806));
            
            //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120808 = t$120807.exists$O();
            
            //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            boolean t$120809 = !(t$120808);
            
            //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (!(t$120809)) {
                
                //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.io.File t$120810 = ((x10.io.File)(createdFile$120806));
                
                //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120811 = t$120810.lastModified$O();
                
                //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120812 = rule$120804.lastModifiedDependency$O();
                
                //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120809 = ((t$120811) < (((long)(t$120812))));
            }
            
            //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120813 = t$120809;
            
            //#line 80 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120813) {
                
                //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$13(rule$120804))));
            } else {
                
                //#line 85 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.terminateRule(((Rule)(rule$120804)));
            }
        }
    }
    
    public static void distributedExecution$P__0$1Rule$2(final x10.util.ArrayList<Rule> rules) {
        MakefileManager.distributedExecution__0$1Rule$2(((x10.util.ArrayList)(rules)));
    }
    
    
    //#line 90 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static boolean isOneMachineFree$O() {
        
        //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        long i$120820 = 0L;
        
        //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        for (;
             true;
             ) {
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120821 = i$120820;
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120822 = ((x10.core.Rail)(MakefileManager.get$cluster()));
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120823 = ((x10.core.Rail<x10.core.Boolean>)t$120822).size;
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120824 = ((t$120821) < (((long)(t$120823))));
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (!(t$120824)) {
                
                //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                break;
            }
            
            //#line 92 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120814 = ((x10.core.Rail)(MakefileManager.get$cluster()));
            
            //#line 92 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120815 = i$120820;
            
            //#line 92 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120816 = ((boolean[])t$120814.value)[(int)t$120815];
            
            //#line 92 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120817 = !(t$120816);
            
            //#line 92 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120817) {
                
                //#line 93 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                return true;
            }
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120818 = i$120820;
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120819 = ((t$120818) + (((long)(1L))));
            
            //#line 91 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            i$120820 = t$120819;
        }
        
        //#line 96 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        return false;
    }
    
    public static boolean isOneMachineFree$P$O() {
        return MakefileManager.isOneMachineFree$O();
    }
    
    
    //#line 99 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void manageCommands(final Rule rule) {
        
        //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.io.Printer t$120655 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 101 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        t$120655.println(((java.lang.Object)("Managing a command")));
        
        //#line 102 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final Root t$120656 = ((Root)(MakefileManager.get$root()));
        
        //#line 102 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final Tree tree = t$120656.getTree();
        
        //#line 103 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.lang.Place there = ((x10.lang.Place)(x10.x10rt.X10RT.here()));
        
        //#line 106 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.concurrent.Monitor t$120657 = ((x10.util.concurrent.Monitor)(MakefileManager.get$monitor()));
        
        //#line 106 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        t$120657.lock();
        
        //#line 107 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        while (true) {
            
            //#line 107 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120658 = MakefileManager.isOneMachineFree$O();
            
            //#line 107 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120660 = !(t$120658);
            
            //#line 107 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (!(t$120660)) {
                
                //#line 107 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                break;
            }
            
            //#line 109 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.util.concurrent.Monitor t$120825 = ((x10.util.concurrent.Monitor)(MakefileManager.get$monitor()));
            
            //#line 109 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            t$120825.await();
        }
        
        //#line 112 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        long tmpId = 0L;
        
        //#line 113 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        boolean foundFreeMachine = false;
        
        //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        long i$120849 = 0L;
        
        //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        for (;
             true;
             ) {
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120850 = i$120849;
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120851 = ((x10.core.Rail)(MakefileManager.get$cluster()));
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120852 = ((x10.core.Rail<x10.core.Boolean>)t$120851).size;
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120853 = ((t$120850) < (((long)(t$120852))));
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (!(t$120853)) {
                
                //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                break;
            }
            
            //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120826 = foundFreeMachine;
            
            //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            boolean t$120827 = !(t$120826);
            
            //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120827) {
                
                //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120828 = ((x10.core.Rail)(MakefileManager.get$cluster()));
                
                //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120829 = i$120849;
                
                //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final boolean t$120830 = ((boolean[])t$120828.value)[(int)t$120829];
                
                //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120827 = !(t$120830);
            }
            
            //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120831 = t$120827;
            
            //#line 115 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120831) {
                
                //#line 116 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                foundFreeMachine = true;
                
                //#line 117 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120832 = i$120849;
                
                //#line 117 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                tmpId = t$120832;
                
                //#line 118 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120833 = ((x10.core.Rail)(MakefileManager.get$cluster()));
                
                //#line 118 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120834 = i$120849;
                
                //#line 118 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                ((boolean[])t$120833.value)[(int)t$120834] = true;
            }
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120835 = i$120849;
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final long t$120836 = ((t$120835) + (((long)(1L))));
            
            //#line 114 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            i$120849 = t$120836;
        }
        
        //#line 121 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.io.Printer t$120678 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 121 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final long t$120677 = tmpId;
        
        //#line 121 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final java.lang.String t$120679 = (("machine vide : ") + ((x10.core.Long.$box(t$120677))));
        
        //#line 121 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        t$120678.println(((java.lang.Object)(t$120679)));
        
        //#line 122 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final long idFree = tmpId;
        
        //#line 124 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.util.concurrent.Monitor t$120680 = ((x10.util.concurrent.Monitor)(MakefileManager.get$monitor()));
        
        //#line 124 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        t$120680.unlock();
        
        //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.lang.PlaceGroup t$120681 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
        
        //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.lang.Place t$120703 = t$120681.$apply((long)(idFree));
        
        //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        x10.xrx.Runtime.runAsync(((x10.lang.Place)(t$120703)), ((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$15(rule, there, idFree))), ((x10.xrx.Runtime.Profile)(null)));
    }
    
    public static void manageCommands$P(final Rule rule) {
        MakefileManager.manageCommands(((Rule)(rule)));
    }
    
    
    //#line 154 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void terminateRule(final Rule rule) {
        
        //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final x10.lang.Place t$120705 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        x10.xrx.Runtime.runAsync(((x10.lang.Place)(t$120705)), ((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$16(rule))), ((x10.xrx.Runtime.Profile)(null)));
    }
    
    public static void terminateRule$P(final Rule rule) {
        MakefileManager.terminateRule(((Rule)(rule)));
    }
    
    
    //#line 162 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void browseTreeAndTerminateRule(final Rule rule, final Tree tree) {
        
        //#line 163 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        final boolean t$120746 = ((tree) != (null));
        
        //#line 163 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        if (t$120746) {
            
            //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.core.Rail t$120706 = tree.getSubtrees();
            
            //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            boolean t$120709 = ((t$120706) != (null));
            
            //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120709) {
                
                //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120707 = tree.getSubtrees();
                
                //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120708 = ((x10.core.Rail<Tree>)t$120707).size;
                
                //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120709 = ((t$120708) > (((long)(0L))));
            }
            
            //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final boolean t$120745 = t$120709;
            
            //#line 165 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            if (t$120745) {
                
                //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail rail$120560 = tree.getSubtrees();
                
                //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long size$120561 = ((x10.core.Rail<Tree>)rail$120560).size;
                
                //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                long idx$120889 = 0L;
                {
                    
                    //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final Tree[] rail$120560$value$120936 = ((Tree[])rail$120560.value);
                    
                    //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120890 = idx$120889;
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final boolean t$120891 = ((t$120890) < (((long)(size$120561))));
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        if (!(t$120891)) {
                            
                            //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            break;
                        }
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120885 = idx$120889;
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final Tree subtree$120886 = ((Tree)(((Tree)rail$120560$value$120936[(int)t$120885])));
                        
                        //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final Rule t$120876 = subtree$120886.getRule();
                        
                        //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        boolean t$120877 = t$120876.equals$O(((Rule)(rule)));
                        
                        //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        if (t$120877) {
                            
                            //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            t$120877 = subtree$120886.isExecuted$O();
                        }
                        
                        //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final boolean t$120878 = t$120877;
                        
                        //#line 168 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        if (t$120878) {
                            
                            //#line 169 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            final x10.core.Rail t$120879 = tree.getSubtrees();
                            
                            //#line 169 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            final long t$120880 = ((x10.core.Rail<Tree>)t$120879).size;
                            
                            //#line 169 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            final long t$120881 = ((t$120880) - (((long)(1L))));
                            
                            //#line 169 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            x10.core.Rail newSubtrees$120882 = new x10.core.Rail<Tree>(Tree.$RTT, t$120881);
                            
                            //#line 171 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            long j$120883 = 0L;
                            
                            //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            long i$120871 = 0L;
                            
                            //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final long t$120872 = i$120871;
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final x10.core.Rail t$120873 = tree.getSubtrees();
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final long t$120874 = ((x10.core.Rail<Tree>)t$120873).size;
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final boolean t$120875 = ((t$120872) < (((long)(t$120874))));
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                if (!(t$120875)) {
                                    
                                    //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    break;
                                }
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final x10.core.Rail t$120854 = tree.getSubtrees();
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final long t$120855 = i$120871;
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final Tree t$120856 = ((Tree[])t$120854.value)[(int)t$120855];
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final Rule t$120857 = t$120856.getRule();
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final boolean t$120858 = t$120857.equals$O(((Rule)(rule)));
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                boolean t$120859 = !(t$120858);
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                if (!(t$120859)) {
                                    
                                    //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final boolean t$120860 = subtree$120886.isExecuted$O();
                                    
                                    //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    t$120859 = !(t$120860);
                                }
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final boolean t$120861 = t$120859;
                                
                                //#line 173 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                if (t$120861) {
                                    
                                    //#line 174 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final x10.core.Rail t$120862 = ((x10.core.Rail)(newSubtrees$120882));
                                    
                                    //#line 174 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final long t$120863 = j$120883;
                                    
                                    //#line 174 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final x10.core.Rail t$120864 = tree.getSubtrees();
                                    
                                    //#line 174 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final long t$120865 = i$120871;
                                    
                                    //#line 174 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final Tree t$120866 = ((Tree[])t$120864.value)[(int)t$120865];
                                    
                                    //#line 174 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    ((Tree[])t$120862.value)[(int)t$120863] = t$120866;
                                    
                                    //#line 175 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final long t$120867 = j$120883;
                                    
                                    //#line 175 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    final long t$120868 = ((t$120867) + (((long)(1L))));
                                    
                                    //#line 175 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                    j$120883 = t$120868;
                                }
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final long t$120869 = i$120871;
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                final long t$120870 = ((t$120869) + (((long)(1L))));
                                
                                //#line 172 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                                i$120871 = t$120870;
                            }
                            
                            //#line 178 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            final x10.core.Rail t$120884 = ((x10.core.Rail)(newSubtrees$120882));
                            
                            //#line 178 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            tree.setSubtrees__0$1Tree$2(((x10.core.Rail)(t$120884)));
                        } else {
                            
                            //#line 181 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            MakefileManager.browseTreeAndTerminateRule(((Rule)(rule)), ((Tree)(subtree$120886)));
                        }
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120887 = idx$120889;
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120888 = ((t$120887) + (((long)(1L))));
                        
                        //#line 166 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        idx$120889 = t$120888;
                    }
                }
            }
        }
    }
    
    public static void browseTreeAndTerminateRule$P(final Rule rule, final Tree tree) {
        MakefileManager.browseTreeAndTerminateRule(((Rule)(rule)), ((Tree)(tree)));
    }
    
    
    //#line 188 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void sendFileToSlaves(final java.lang.String filename, final x10.lang.Place toPlace) {
        {
            
            //#line 189 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 189 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.xrx.FinishState fs$120922 = x10.xrx.Runtime.startFinish();
            
            //#line 189 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                {
                    
                    //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final x10.lang.Place t$120757 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
                    
                    //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    x10.xrx.Runtime.runAsync(((x10.lang.Place)(t$120757)), ((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$17(filename, toPlace))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Throwable ct$120920) {
                
                //#line 189 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$120920)));
                
                //#line 189 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 189 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$120922)));
             }}
            }
        }
    
    public static void sendFileToSlaves$P(final java.lang.String filename, final x10.lang.Place toPlace) {
        MakefileManager.sendFileToSlaves(((java.lang.String)(filename)), ((x10.lang.Place)(toPlace)));
    }
    
    
    //#line 194 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void receiveFileFromSlaves(final java.lang.String filename) {
        {
            
            //#line 195 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 195 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.xrx.FinishState fs$120928 = x10.xrx.Runtime.startFinish();
            
            //#line 195 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                {
                    
                    //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$18(filename))));
                }
            }}catch (java.lang.Throwable ct$120926) {
                
                //#line 195 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$120926)));
                
                //#line 195 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 195 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$120928)));
             }}
            }
        }
    
    public static void receiveFileFromSlaves$P(final java.lang.String filename) {
        MakefileManager.receiveFileFromSlaves(((java.lang.String)(filename)));
    }
    
    
    //#line 200 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    private static void executeCommand(final java.lang.String command) {
        
        //#line 201 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        try {{
            
            //#line 202 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.io.Printer t$120768 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 202 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String t$120767 = (("Executing \'") + (command));
            
            //#line 202 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String t$120769 = ((t$120767) + ("\'..."));
            
            //#line 202 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            t$120768.println(((java.lang.Object)(t$120769)));
            
            //#line 204 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            java.lang.String[] args = (java.lang.String[])x10.rtt.Types.STRING.makeArray(((int)(3)));
            
            //#line 205 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String[] t$120770 = ((java.lang.String[])(args));
            
            //#line 205 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.runtime.impl.java.EvalUtils.eval((t$120770)[((int)(0))] = "/bin/sh");
            
            //#line 206 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String[] t$120771 = ((java.lang.String[])(args));
            
            //#line 206 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.runtime.impl.java.EvalUtils.eval((t$120771)[((int)(1))] = "-c");
            
            //#line 207 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String[] t$120772 = ((java.lang.String[])(args));
            
            //#line 207 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            x10.runtime.impl.java.EvalUtils.eval((t$120772)[((int)(2))] = command);
            
            //#line 208 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.Runtime t$120773 = java.lang.Runtime.getRuntime();
            
            //#line 208 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String[] t$120774 = ((java.lang.String[])(args));
            
            //#line 208 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.Process p = t$120773.exec(((java.lang.String[])(t$120774)));
            
            //#line 209 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 210 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                p.waitFor();
            }}catch (final java.lang.InterruptedException e) {
                
            }
        }}catch (final java.io.IOException e) {
            
            //#line 214 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final x10.io.Printer t$120776 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 214 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String t$120775 = (("La commande : \'") + (command));
            
            //#line 214 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            final java.lang.String t$120777 = ((t$120775) + ("\' n\'a pas pu \352tre \351x\351cut\351e."));
            
            //#line 214 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            t$120776.println(((java.lang.Object)(t$120777)));
            
            //#line 215 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            e.printStackTrace();
        }
    }
    
    public static void executeCommand$P(final java.lang.String command) {
        MakefileManager.executeCommand(((java.lang.String)(command)));
    }
    
    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    final public MakefileManager MakefileManager$$this$MakefileManager() {
        
        //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
        return MakefileManager.this;
    }
    
    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    // creation method for java code (1-phase java constructor)
    public MakefileManager() {
        this((java.lang.System[]) null);
        MakefileManager$$init$S();
    }
    
    // constructor for non-virtual call
    final public MakefileManager MakefileManager$$init$S() {
         {
            
            //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            
            
            //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            this.__fieldInitializers_MakefileManager();
        }
        return this;
    }
    
    
    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
    final public void __fieldInitializers_MakefileManager() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$monitor = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$monitor;
    final private static x10.core.concurrent.AtomicInteger initStatus$root = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$root;
    final private static x10.core.concurrent.AtomicInteger initStatus$cluster = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$cluster;
    final private static x10.core.concurrent.AtomicInteger initStatus$hostnames = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$hostnames;
    final private static x10.core.concurrent.AtomicInteger initStatus$relativePathOnMaster = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$relativePathOnMaster;
    
    public static java.lang.String get$relativePathOnMaster() {
        if (((int) MakefileManager.initStatus$relativePathOnMaster.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return ((java.lang.String)
                     MakefileManager.relativePathOnMaster);
        }
        if (((int) MakefileManager.initStatus$relativePathOnMaster.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.relativePathOnMaster")));
            }
            throw MakefileManager.exception$relativePathOnMaster;
        }
        if (MakefileManager.initStatus$relativePathOnMaster.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                MakefileManager.relativePathOnMaster = new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)("."))).getAbsoluteFile().getPath();
            }}catch (java.lang.Throwable exc$120930) {
                MakefileManager.exception$relativePathOnMaster = new x10.lang.ExceptionInInitializer(exc$120930);
                MakefileManager.initStatus$relativePathOnMaster.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw MakefileManager.exception$relativePathOnMaster;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: MakefileManager.relativePathOnMaster")));
            }
            MakefileManager.initStatus$relativePathOnMaster.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (MakefileManager.initStatus$relativePathOnMaster.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (MakefileManager.initStatus$relativePathOnMaster.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) MakefileManager.initStatus$relativePathOnMaster.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.relativePathOnMaster")));
                    }
                    throw MakefileManager.exception$relativePathOnMaster;
                }
            }
        }
        return ((java.lang.String)
                 MakefileManager.relativePathOnMaster);
    }
    
    public static x10.core.Rail get$hostnames() {
        if (((int) MakefileManager.initStatus$hostnames.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return MakefileManager.hostnames;
        }
        if (((int) MakefileManager.initStatus$hostnames.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.hostnames")));
            }
            throw MakefileManager.exception$hostnames;
        }
        if (MakefileManager.initStatus$hostnames.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                MakefileManager.hostnames = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)x10.x10rt.X10RT.numPlaces()))));
            }}catch (java.lang.Throwable exc$120931) {
                MakefileManager.exception$hostnames = new x10.lang.ExceptionInInitializer(exc$120931);
                MakefileManager.initStatus$hostnames.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw MakefileManager.exception$hostnames;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: MakefileManager.hostnames")));
            }
            MakefileManager.initStatus$hostnames.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (MakefileManager.initStatus$hostnames.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (MakefileManager.initStatus$hostnames.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) MakefileManager.initStatus$hostnames.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.hostnames")));
                    }
                    throw MakefileManager.exception$hostnames;
                }
            }
        }
        return MakefileManager.hostnames;
    }
    
    public static x10.core.Rail get$cluster() {
        if (((int) MakefileManager.initStatus$cluster.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return MakefileManager.cluster;
        }
        if (((int) MakefileManager.initStatus$cluster.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.cluster")));
            }
            throw MakefileManager.exception$cluster;
        }
        if (MakefileManager.initStatus$cluster.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                MakefileManager.cluster = new x10.core.Rail<x10.core.Boolean>(x10.rtt.Types.BOOLEAN, x10.lang.Place.places().size$O());
            }}catch (java.lang.Throwable exc$120932) {
                MakefileManager.exception$cluster = new x10.lang.ExceptionInInitializer(exc$120932);
                MakefileManager.initStatus$cluster.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw MakefileManager.exception$cluster;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: MakefileManager.cluster")));
            }
            MakefileManager.initStatus$cluster.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (MakefileManager.initStatus$cluster.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (MakefileManager.initStatus$cluster.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) MakefileManager.initStatus$cluster.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.cluster")));
                    }
                    throw MakefileManager.exception$cluster;
                }
            }
        }
        return MakefileManager.cluster;
    }
    
    public static Root get$root() {
        if (((int) MakefileManager.initStatus$root.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return MakefileManager.root;
        }
        if (((int) MakefileManager.initStatus$root.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.root")));
            }
            throw MakefileManager.exception$root;
        }
        if (MakefileManager.initStatus$root.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                MakefileManager.root = new Root((java.lang.System[]) null).Root$$init$S();
            }}catch (java.lang.Throwable exc$120933) {
                MakefileManager.exception$root = new x10.lang.ExceptionInInitializer(exc$120933);
                MakefileManager.initStatus$root.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw MakefileManager.exception$root;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: MakefileManager.root")));
            }
            MakefileManager.initStatus$root.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (MakefileManager.initStatus$root.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (MakefileManager.initStatus$root.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) MakefileManager.initStatus$root.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.root")));
                    }
                    throw MakefileManager.exception$root;
                }
            }
        }
        return MakefileManager.root;
    }
    
    public static x10.util.concurrent.Monitor get$monitor() {
        if (((int) MakefileManager.initStatus$monitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return MakefileManager.monitor;
        }
        if (((int) MakefileManager.initStatus$monitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.monitor")));
            }
            throw MakefileManager.exception$monitor;
        }
        if (MakefileManager.initStatus$monitor.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                MakefileManager.monitor = new x10.util.concurrent.Monitor();
            }}catch (java.lang.Throwable exc$120934) {
                MakefileManager.exception$monitor = new x10.lang.ExceptionInInitializer(exc$120934);
                MakefileManager.initStatus$monitor.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw MakefileManager.exception$monitor;
            }
            if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Doing static initialization for field: MakefileManager.monitor")));
            }
            MakefileManager.initStatus$monitor.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (MakefileManager.initStatus$monitor.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (MakefileManager.initStatus$monitor.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) MakefileManager.initStatus$monitor.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    if (((boolean) x10.runtime.impl.java.InitDispatcher.TRACE_STATIC_INIT) == ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.printStaticInitMessage(((java.lang.String)("Rethrowing ExceptionInInitializer for field: MakefileManager.monitor")));
                    }
                    throw MakefileManager.exception$monitor;
                }
            }
        }
        return MakefileManager.monitor;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$12 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$12> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$12> make($Closure$12.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$12 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$12.class + " calling"); } 
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$12 $_obj = new MakefileManager.$Closure$12((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$12(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.findAndExecuteRules();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public $Closure$12() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$13 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$13> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$13> make($Closure$13.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$13 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$13.class + " calling"); } 
            $_obj.rule$120804 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$13 $_obj = new MakefileManager.$Closure$13((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.rule$120804);
            
        }
        
        // constructor just for allocation
        public $Closure$13(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.manageCommands(((Rule)(this.rule$120804)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 81 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public Rule rule$120804;
        
        public $Closure$13(final Rule rule$120804) {
             {
                this.rule$120804 = ((Rule)(rule$120804));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$14 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$14> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$14> make($Closure$14.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$14 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$14.class + " calling"); } 
            $_obj.idFree = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$14 $_obj = new MakefileManager.$Closure$14((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.idFree);
            
        }
        
        // constructor just for allocation
        public $Closure$14(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 144 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.util.concurrent.Monitor t$120698 = ((x10.util.concurrent.Monitor)(MakefileManager.get$monitor()));
                
                //#line 144 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120698.lock();
                
                //#line 145 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120699 = ((x10.core.Rail)(MakefileManager.get$cluster()));
                
                //#line 145 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                ((boolean[])t$120699.value)[(int)this.idFree] = false;
                
                //#line 146 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.io.Printer t$120700 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 146 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120701 = (("--- On lib\350re la machine : ") + ((x10.core.Long.$box(this.idFree))));
                
                //#line 146 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120700.println(((java.lang.Object)(t$120701)));
                
                //#line 148 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.util.concurrent.Monitor t$120702 = ((x10.util.concurrent.Monitor)(MakefileManager.get$monitor()));
                
                //#line 148 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120702.release();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public long idFree;
        
        public $Closure$14(final long idFree) {
             {
                this.idFree = idFree;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$15 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$15> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$15> make($Closure$15.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$15 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$15.class + " calling"); } 
            $_obj.idFree = $deserializer.readLong();
            $_obj.rule = $deserializer.readObject();
            $_obj.there = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$15 $_obj = new MakefileManager.$Closure$15((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.idFree);
            $serializer.write(this.rule);
            $serializer.write(this.there);
            
        }
        
        // constructor just for allocation
        public $Closure$15(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail rail$120847 = this.rule.getDependencies();
                
                //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long size$120848 = ((x10.core.Rail<java.lang.String>)rail$120847).size;
                
                //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                long idx$120844 = 0L;
                {
                    
                    //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final java.lang.String[] rail$120847$value$120937 = ((java.lang.String[])rail$120847.value);
                    
                    //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120845 = idx$120844;
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final boolean t$120846 = ((t$120845) < (((long)(size$120848))));
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        if (!(t$120846)) {
                            
                            //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            break;
                        }
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120840 = idx$120844;
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final java.lang.String dependency$120841 = ((java.lang.String)(((java.lang.String)rail$120847$value$120937[(int)t$120840])));
                        
                        //#line 129 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final x10.io.File t$120837 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(dependency$120841)))));
                        
                        //#line 129 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final boolean t$120838 = t$120837.exists$O();
                        
                        //#line 129 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final boolean t$120839 = !(t$120838);
                        
                        //#line 129 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        if (t$120839) {
                            
                            //#line 131 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            MakefileManager.sendFileToSlaves(((java.lang.String)(dependency$120841)), ((x10.lang.Place)(this.there)));
                        }
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120842 = idx$120844;
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        final long t$120843 = ((t$120842) + (((long)(1L))));
                        
                        //#line 128 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        idx$120844 = t$120843;
                    }
                }
                
                //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120691 = this.rule.getCommand();
                
                //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                boolean t$120694 = ((t$120691) != (null));
                
                //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                if (t$120694) {
                    
                    //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final java.lang.String t$120692 = this.rule.getCommand();
                    
                    //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final int t$120693 = (t$120692).length();
                    
                    //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    t$120694 = ((int) t$120693) != ((int) 0);
                }
                
                //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final boolean t$120696 = t$120694;
                
                //#line 134 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                if (t$120696) {
                    
                    //#line 135 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final java.lang.String t$120695 = this.rule.getCommand();
                    
                    //#line 135 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    MakefileManager.executeCommand(((java.lang.String)(t$120695)));
                }
                
                //#line 138 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120697 = this.rule.getCreatedFilename();
                
                //#line 138 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.receiveFileFromSlaves(((java.lang.String)(t$120697)));
                
                //#line 139 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.terminateRule(((Rule)(this.rule)));
                {
                    
                    //#line 141 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    x10.xrx.Runtime.ensureNotInAtomic();
                    
                    //#line 141 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    final x10.xrx.FinishState fs$120906 = x10.xrx.Runtime.startFinish();
                    
                    //#line 141 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    try {{
                        {
                            
                            //#line 142 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                            x10.xrx.Runtime.runAsync(((x10.lang.Place)(this.there)), ((x10.core.fun.VoidFun_0_0)(new MakefileManager.$Closure$14(((long)(this.idFree))))), ((x10.xrx.Runtime.Profile)(null)));
                        }
                    }}catch (java.lang.Throwable ct$120904) {
                        
                        //#line 141 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$120904)));
                        
                        //#line 141 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 141 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                         x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$120906)));
                     }}
                    }
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 125 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
        
        public Rule rule;
        public x10.lang.Place there;
        public long idFree;
        
        public $Closure$15(final Rule rule, final x10.lang.Place there, final long idFree) {
             {
                this.rule = ((Rule)(rule));
                this.there = ((x10.lang.Place)(there));
                this.idFree = idFree;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$16 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$16> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$16> make($Closure$16.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$16 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$16.class + " calling"); } 
            $_obj.rule = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$16 $_obj = new MakefileManager.$Closure$16((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.rule);
            
        }
        
        // constructor just for allocation
        public $Closure$16(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 156 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final Root t$120704 = ((Root)(MakefileManager.get$root()));
                
                //#line 156 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final Tree tree = t$120704.getTree();
                
                //#line 157 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.browseTreeAndTerminateRule(((Rule)(this.rule)), ((Tree)(tree)));
                
                //#line 158 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                MakefileManager.findAndExecuteRules();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 155 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public Rule rule;
        
        public $Closure$16(final Rule rule) {
             {
                this.rule = ((Rule)(rule));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$17 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$17> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$17> make($Closure$17.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$17 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$17.class + " calling"); } 
            $_obj.filename = $deserializer.readObject();
            $_obj.toPlace = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$17 $_obj = new MakefileManager.$Closure$17((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.filename);
            $serializer.write(this.toPlace);
            
        }
        
        // constructor just for allocation
        public $Closure$17(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.Runtime t$120755 = java.lang.Runtime.getRuntime();
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120747 = ((java.lang.String)(MakefileManager.get$relativePathOnMaster()));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120748 = (("scp ") + (t$120747));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120749 = ((t$120748) + (this.filename));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120752 = ((t$120749) + (" "));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120750 = ((x10.core.Rail)(MakefileManager.get$hostnames()));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final long t$120751 = this.toPlace.id;
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120753 = ((java.lang.String[])t$120750.value)[(int)t$120751];
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120754 = ((t$120752) + (t$120753));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120756 = ((t$120754) + (":/tmp/projet/"));
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120755.exec(((java.lang.String)(t$120756)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 190 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public java.lang.String filename;
        public x10.lang.Place toPlace;
        
        public $Closure$17(final java.lang.String filename, final x10.lang.Place toPlace) {
             {
                this.filename = ((java.lang.String)(filename));
                this.toPlace = ((x10.lang.Place)(toPlace));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$18 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$18> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$18> make($Closure$18.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(MakefileManager.$Closure$18 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$18.class + " calling"); } 
            $_obj.filename = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            MakefileManager.$Closure$18 $_obj = new MakefileManager.$Closure$18((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.filename);
            
        }
        
        // constructor just for allocation
        public $Closure$18(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
            try {{
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.Runtime t$120765 = java.lang.Runtime.getRuntime();
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120758 = (("scp /tmp/projet/") + (this.filename));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120760 = ((t$120758) + (" "));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final x10.core.Rail t$120759 = ((x10.core.Rail)(MakefileManager.get$hostnames()));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120761 = ((java.lang.String[])t$120759.value)[(int)0L];
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120762 = ((t$120760) + (t$120761));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120763 = ((t$120762) + (":"));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120764 = ((java.lang.String)(MakefileManager.get$relativePathOnMaster()));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                final java.lang.String t$120766 = ((t$120763) + (t$120764));
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                t$120765.exec(((java.lang.String)(t$120766)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 196 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/MakefileManager.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public java.lang.String filename;
        
        public $Closure$18(final java.lang.String filename) {
             {
                this.filename = ((java.lang.String)(filename));
            }
        }
        
    }
    
    }
    
    