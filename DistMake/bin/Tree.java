
@x10.runtime.impl.java.X10Generated
public class Tree extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Tree> $RTT = 
        x10.rtt.NamedType.<Tree> make("Tree",
                                      Tree.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Tree $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Tree.class + " calling"); } 
        $_obj.isExecuted = $deserializer.readBoolean();
        $_obj.rule = $deserializer.readObject();
        $_obj.subtrees = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Tree $_obj = new Tree((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.isExecuted);
        $serializer.write(this.rule);
        $serializer.write(this.subtrees);
        
    }
    
    // constructor just for allocation
    public Tree(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public Rule rule;
    
    //#line 6 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public x10.core.Rail<Tree> subtrees;
    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public boolean isExecuted;
    
    
    //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public x10.core.Rail getSubtrees() {
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final x10.core.Rail t$2824 = ((x10.core.Rail)(this.subtrees));
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        return t$2824;
    }
    
    
    //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public Rule getRule() {
        
        //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final Rule t$2825 = ((Rule)(this.rule));
        
        //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        return t$2825;
    }
    
    
    //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public boolean isExecuted$O() {
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final boolean t$2826 = this.isExecuted;
        
        //#line 18 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        return t$2826;
    }
    
    
    //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public void setSubtrees__0$1Tree$2(final x10.core.Rail subtrees) {
        
        //#line 22 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.subtrees = ((x10.core.Rail)(subtrees));
    }
    
    
    //#line 25 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public void setRule(final Rule rule) {
        
        //#line 26 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.rule = ((Rule)(rule));
    }
    
    
    //#line 29 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public void setIsExecuted(final boolean isExecuted) {
        
        //#line 30 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.isExecuted = isExecuted;
    }
    
    
    //#line 33 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    private void recDisplay(final long depth) {
        
        //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final x10.io.Printer t$2827 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final java.lang.String t$2828 = (("Depth ") + ((x10.core.Long.$box(depth))));
        
        //#line 34 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        t$2827.println(((java.lang.Object)(t$2828)));
        
        //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final Rule t$2829 = ((Rule)(this.rule));
        
        //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        t$2829.display();
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final x10.core.Rail t$2830 = this.getSubtrees();
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        boolean t$2833 = ((t$2830) != (null));
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        if (t$2833) {
            
            //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            final x10.core.Rail t$2831 = this.getSubtrees();
            
            //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            final long t$2832 = ((x10.core.Rail<Tree>)t$2831).size;
            
            //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            t$2833 = ((t$2832) > (((long)(0L))));
        }
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        final boolean t$2841 = t$2833;
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        if (t$2841) {
            
            //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            final x10.core.Rail rail$2801 = this.getSubtrees();
            
            //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            final long size$2802 = ((x10.core.Rail<Tree>)rail$2801).size;
            
            //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            long idx$2847 = 0L;
            {
                
                //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                final Tree[] rail$2801$value$2850 = ((Tree[])rail$2801.value);
                
                //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final long t$2848 = idx$2847;
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final boolean t$2849 = ((t$2848) < (((long)(size$2802))));
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    if (!(t$2849)) {
                        
                        //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                        break;
                    }
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final long t$2843 = idx$2847;
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final Tree dep$2844 = ((Tree)(((Tree)rail$2801$value$2850[(int)t$2843])));
                    
                    //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final long t$2842 = ((depth) + (((long)(1L))));
                    
                    //#line 38 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    dep$2844.recDisplay((long)(t$2842));
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final long t$2845 = idx$2847;
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    final long t$2846 = ((t$2845) + (((long)(1L))));
                    
                    //#line 37 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
                    idx$2847 = t$2846;
                }
            }
        }
    }
    
    public static void recDisplay$P(final long depth, final Tree Tree) {
        Tree.recDisplay((long)(depth));
    }
    
    
    //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    public void display() {
        
        //#line 44 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.recDisplay((long)(0L));
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    final public Tree Tree$$this$Tree() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        return Tree.this;
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    // creation method for java code (1-phase java constructor)
    public Tree() {
        this((java.lang.System[]) null);
        Tree$$init$S();
    }
    
    // constructor for non-virtual call
    final public Tree Tree$$init$S() {
         {
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
            this.__fieldInitializers_Tree();
        }
        return this;
    }
    
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
    final public void __fieldInitializers_Tree() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.rule = null;
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.subtrees = null;
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Tree.x10"
        this.isExecuted = false;
    }
}

