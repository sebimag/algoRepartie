@x10.runtime.impl.java.X10Generated
public class Root extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Root> $RTT = 
        x10.rtt.NamedType.<Root> make("Root",
                                      Root.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Root $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Root.class + " calling"); } 
        $_obj.tree = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Root $_obj = new Root((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.tree);
        
    }
    
    // constructor just for allocation
    public Root(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 2 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
    public Tree tree;
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
    public Tree getTree() {
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
        final Tree t$3735 = ((Tree)(this.tree));
        
        //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
        return t$3735;
    }
    
    
    //#line 8 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
    public void setTree(final Tree tree) {
        
        //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
        this.tree = ((Tree)(tree));
    }
    
    
    //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
    final public Root Root$$this$Root() {
        
        //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
        return Root.this;
    }
    
    
    //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
    // creation method for java code (1-phase java constructor)
    public Root() {
        this((java.lang.System[]) null);
        Root$$init$S();
    }
    
    // constructor for non-virtual call
    final public Root Root$$init$S() {
         {
            
            //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
            
            
            //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
            this.__fieldInitializers_Root();
        }
        return this;
    }
    
    
    
    //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
    final public void __fieldInitializers_Root() {
        
        //#line 1 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Root.x10"
        this.tree = null;
    }
}

