
@x10.runtime.impl.java.X10Generated
public class TreeBuilder extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<TreeBuilder> $RTT = 
        x10.rtt.NamedType.<TreeBuilder> make("TreeBuilder",
                                             TreeBuilder.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(TreeBuilder $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + TreeBuilder.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        TreeBuilder $_obj = new TreeBuilder((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public TreeBuilder(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
    private static Rule findRuleByName__0$1Rule$2(final x10.util.ArrayList<Rule> rules, final java.lang.String name) {
        
        //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        final x10.util.ListIterator rule$2762 = ((x10.util.ListIterator<Rule>)
                                                  ((x10.util.ArrayList<Rule>)rules).iterator());
        
        //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        for (;
             true;
             ) {
            
            //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final boolean t$2763 = ((x10.util.ListIterator<Rule>)rule$2762).hasNext$O();
            
            //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            if (!(t$2763)) {
                
                //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                break;
            }
            
            //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final Rule rule$2759 = ((Rule)(((x10.util.ListIterator<Rule>)rule$2762).next$G()));
            
            //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final java.lang.String t$2760 = rule$2759.getCreatedFilename();
            
            //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final boolean t$2761 = (t$2760).equals(name);
            
            //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            if (t$2761) {
                
                //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                return rule$2759;
            }
        }
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        return null;
    }
    
    public static Rule findRuleByName$P__0$1Rule$2(final x10.util.ArrayList<Rule> rules, final java.lang.String name) {
        return TreeBuilder.findRuleByName__0$1Rule$2(((x10.util.ArrayList)(rules)), ((java.lang.String)(name)));
    }
    
    
    //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
    public static Tree rulesToTree__0$1Rule$2(final x10.util.ArrayList<Rule> rules, final java.lang.String ruleName) {
        
        //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        Tree finalTree = null;
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        Rule rootRule = TreeBuilder.findRuleByName__0$1Rule$2(((x10.util.ArrayList)(rules)), ((java.lang.String)(ruleName)));
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        final Rule t$2739 = ((Rule)(rootRule));
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        final boolean t$2757 = ((t$2739) != (null));
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        if (t$2757) {
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final Tree t$2740 = ((Tree)(new Tree((java.lang.System[]) null).Tree$$init$S()));
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            finalTree = ((Tree)(t$2740));
            
            //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final Tree t$2741 = ((Tree)(finalTree));
            
            //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final Rule t$2742 = ((Rule)(rootRule));
            
            //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            t$2741.setRule(((Rule)(t$2742)));
            
            //#line 22 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            x10.util.ArrayList subtrees = new x10.util.ArrayList<Tree>((java.lang.System[]) null, Tree.$RTT).x10$util$ArrayList$$init$S();
            
            //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final Rule t$2776 = ((Rule)(rootRule));
            
            //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final x10.core.Rail rail$2777 = t$2776.getDependencies();
            
            //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final long size$2778 = ((x10.core.Rail<java.lang.String>)rail$2777).size;
            
            //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            long idx$2773 = 0L;
            {
                
                //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                final java.lang.String[] rail$2777$value$2779 = ((java.lang.String[])rail$2777.value);
                
                //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final long t$2774 = idx$2773;
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final boolean t$2775 = ((t$2774) < (((long)(size$2778))));
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    if (!(t$2775)) {
                        
                        //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                        break;
                    }
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final long t$2769 = idx$2773;
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final java.lang.String dependency$2770 = ((java.lang.String)(((java.lang.String)rail$2777$value$2779[(int)t$2769])));
                    
                    //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    Tree child$2764 = TreeBuilder.rulesToTree__0$1Rule$2(((x10.util.ArrayList)(rules)), ((java.lang.String)(dependency$2770)));
                    
                    //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final Tree t$2765 = ((Tree)(child$2764));
                    
                    //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final boolean t$2766 = ((t$2765) != (null));
                    
                    //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    if (t$2766) {
                        
                        //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                        final x10.util.ArrayList t$2767 = ((x10.util.ArrayList)(subtrees));
                        
                        //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                        final Tree t$2768 = ((Tree)(child$2764));
                        
                        //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                        ((x10.util.ArrayList<Tree>)t$2767).add__0x10$util$ArrayList$$T$O(((Tree)(t$2768)));
                    }
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final long t$2771 = idx$2773;
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    final long t$2772 = ((t$2771) + (((long)(1L))));
                    
                    //#line 23 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
                    idx$2773 = t$2772;
                }
            }
            
            //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final Tree t$2755 = ((Tree)(finalTree));
            
            //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final x10.util.ArrayList t$2754 = ((x10.util.ArrayList)(subtrees));
            
            //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            final x10.core.Rail t$2756 = ((x10.core.Rail<Tree>)
                                           ((x10.util.ArrayList<Tree>)t$2754).toRail());
            
            //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            t$2755.setSubtrees__0$1Tree$2(((x10.core.Rail)(t$2756)));
        }
        
        //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        final Tree t$2758 = ((Tree)(finalTree));
        
        //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        return t$2758;
    }
    
    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
    final public TreeBuilder TreeBuilder$$this$TreeBuilder() {
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
        return TreeBuilder.this;
    }
    
    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
    // creation method for java code (1-phase java constructor)
    public TreeBuilder() {
        this((java.lang.System[]) null);
        TreeBuilder$$init$S();
    }
    
    // constructor for non-virtual call
    final public TreeBuilder TreeBuilder$$init$S() {
         {
            
            //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            
            
            //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
            this.__fieldInitializers_TreeBuilder();
        }
        return this;
    }
    
    
    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/TreeBuilder.x10"
    final public void __fieldInitializers_TreeBuilder() {
        
    }
}

