
@x10.runtime.impl.java.X10Generated
public class Rule extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Rule> $RTT = 
        x10.rtt.NamedType.<Rule> make("Rule",
                                      Rule.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Rule $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Rule.class + " calling"); } 
        $_obj.command = $deserializer.readObject();
        $_obj.createdFilename = $deserializer.readObject();
        $_obj.dependencies = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Rule $_obj = new Rule((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.command);
        $serializer.write(this.createdFilename);
        $serializer.write(this.dependencies);
        
    }
    
    // constructor just for allocation
    public Rule(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 5 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public java.lang.String command;
    
    //#line 6 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public x10.core.Rail<java.lang.String> dependencies;
    
    //#line 7 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public java.lang.String createdFilename;
    
    
    //#line 9 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public boolean equals$O(final Rule rule) {
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3168 = ((java.lang.String)(this.command));
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3169 = rule.getCommand();
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final boolean t$3170 = (t$3168).equals(t$3169);
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final boolean t$3171 = !(t$3170);
        
        //#line 10 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        if (t$3171) {
            
            //#line 11 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            return false;
        }
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3172 = ((java.lang.String)(this.createdFilename));
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3173 = rule.getCreatedFilename();
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final boolean t$3174 = (t$3172).equals(t$3173);
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final boolean t$3175 = !(t$3174);
        
        //#line 13 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        if (t$3175) {
            
            //#line 14 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            return false;
        }
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.core.Rail t$3176 = ((x10.core.Rail)(this.dependencies));
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final long t$3178 = ((x10.core.Rail<java.lang.String>)t$3176).size;
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.core.Rail t$3177 = rule.getDependencies();
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final long t$3179 = ((x10.core.Rail<java.lang.String>)t$3177).size;
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final boolean t$3180 = ((long) t$3178) != ((long) t$3179);
        
        //#line 16 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        if (t$3180) {
            
            //#line 17 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            return false;
        }
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        long i$3241 = 0L;
        
        //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        for (;
             true;
             ) {
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final long t$3242 = i$3241;
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final x10.core.Rail t$3243 = ((x10.core.Rail)(this.dependencies));
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final long t$3244 = ((x10.core.Rail<java.lang.String>)t$3243).size;
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final boolean t$3245 = ((t$3242) < (((long)(t$3244))));
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            if (!(t$3245)) {
                
                //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                break;
            }
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final x10.core.Rail t$3231 = ((x10.core.Rail)(this.dependencies));
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final long t$3232 = i$3241;
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final java.lang.String t$3233 = ((java.lang.String[])t$3231.value)[(int)t$3232];
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final x10.core.Rail t$3234 = rule.getDependencies();
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final long t$3235 = i$3241;
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final java.lang.String t$3236 = ((java.lang.String[])t$3234.value)[(int)t$3235];
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final boolean t$3237 = (t$3233).equals(t$3236);
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final boolean t$3238 = !(t$3237);
            
            //#line 20 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            if (t$3238) {
                
                //#line 21 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                return false;
            }
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final long t$3239 = i$3241;
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final long t$3240 = ((t$3239) + (((long)(1L))));
            
            //#line 19 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            i$3241 = t$3240;
        }
        
        //#line 24 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        return true;
    }
    
    
    //#line 27 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public java.lang.String getCommand() {
        
        //#line 28 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3196 = ((java.lang.String)(this.command));
        
        //#line 28 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        return t$3196;
    }
    
    
    //#line 31 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public x10.core.Rail getDependencies() {
        
        //#line 32 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.core.Rail t$3197 = ((x10.core.Rail)(this.dependencies));
        
        //#line 32 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        return t$3197;
    }
    
    
    //#line 35 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public java.lang.String getCreatedFilename() {
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3198 = ((java.lang.String)(this.createdFilename));
        
        //#line 36 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        return t$3198;
    }
    
    
    //#line 39 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public long lastModifiedDependency$O() {
        
        //#line 40 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        long max = 0L;
        
        //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.core.Rail rail$3259 = ((x10.core.Rail)(this.dependencies));
        
        //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final long size$3260 = ((x10.core.Rail<java.lang.String>)rail$3259).size;
        
        //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        long idx$3256 = 0L;
        {
            
            //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final java.lang.String[] rail$3259$value$3273 = ((java.lang.String[])rail$3259.value);
            
            //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            for (;
                 true;
                 ) {
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3257 = idx$3256;
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final boolean t$3258 = ((t$3257) < (((long)(size$3260))));
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                if (!(t$3258)) {
                    
                    //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                    break;
                }
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3252 = idx$3256;
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final java.lang.String dependency$3253 = ((java.lang.String)(((java.lang.String)rail$3259$value$3273[(int)t$3252])));
                
                //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final x10.io.File t$3246 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null).x10$io$File$$init$S(((java.lang.String)(dependency$3253)))));
                
                //#line 42 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                long tmp$3247 = t$3246.lastModified$O();
                
                //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3248 = max;
                
                //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3249 = tmp$3247;
                
                //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final boolean t$3250 = ((t$3248) < (((long)(t$3249))));
                
                //#line 43 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                if (t$3250) {
                    
                    //#line 44 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                    final long t$3251 = tmp$3247;
                    
                    //#line 44 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                    max = t$3251;
                }
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3254 = idx$3256;
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3255 = ((t$3254) + (((long)(1L))));
                
                //#line 41 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                idx$3256 = t$3255;
            }
        }
        
        //#line 47 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final long t$3210 = max;
        
        //#line 47 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        return t$3210;
    }
    
    
    //#line 50 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public void setCommand(final java.lang.String command) {
        
        //#line 51 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        this.command = ((java.lang.String)(command));
    }
    
    
    //#line 54 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public void setDependencies__0$1x10$lang$String$2(final x10.core.Rail dependencies) {
        
        //#line 55 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        this.dependencies = ((x10.core.Rail)(dependencies));
    }
    
    
    //#line 58 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public void setCreatedFilename(final java.lang.String createdFilename) {
        
        //#line 59 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        this.createdFilename = ((java.lang.String)(createdFilename));
    }
    
    
    //#line 62 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    public void display() {
        
        //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.io.Printer t$3211 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 63 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        t$3211.print(((java.lang.String)("Rule:[")));
        
        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.io.Printer t$3214 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3212 = ((java.lang.String)(this.createdFilename));
        
        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3213 = ((" CreatedFilename:<") + (t$3212));
        
        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3215 = ((t$3213) + (">"));
        
        //#line 64 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        t$3214.println(((java.lang.Object)(t$3215)));
        
        //#line 65 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.io.Printer t$3216 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 65 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        t$3216.print(((java.lang.String)(" Dependencies:[ ")));
        
        //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.core.Rail rail$3271 = ((x10.core.Rail)(this.dependencies));
        
        //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final long size$3272 = ((x10.core.Rail<java.lang.String>)rail$3271).size;
        
        //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        long idx$3268 = 0L;
        {
            
            //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            final java.lang.String[] rail$3271$value$3274 = ((java.lang.String[])rail$3271.value);
            
            //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            for (;
                 true;
                 ) {
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3269 = idx$3268;
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final boolean t$3270 = ((t$3269) < (((long)(size$3272))));
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                if (!(t$3270)) {
                    
                    //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                    break;
                }
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3264 = idx$3268;
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final java.lang.String dep$3265 = ((java.lang.String)(((java.lang.String)rail$3271$value$3274[(int)t$3264])));
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final x10.io.Printer t$3261 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final java.lang.String t$3262 = ((" <") + (dep$3265));
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final java.lang.String t$3263 = ((t$3262) + (">"));
                
                //#line 67 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                t$3261.println(((java.lang.Object)(t$3263)));
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3266 = idx$3268;
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                final long t$3267 = ((t$3266) + (((long)(1L))));
                
                //#line 66 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
                idx$3268 = t$3267;
            }
        }
        
        //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.io.Printer t$3226 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 69 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        t$3226.println(((java.lang.Object)(" ]")));
        
        //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final x10.io.Printer t$3229 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3227 = ((java.lang.String)(this.command));
        
        //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3228 = ((" Command:<") + (t$3227));
        
        //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        final java.lang.String t$3230 = ((t$3228) + (">"));
        
        //#line 70 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        t$3229.println(((java.lang.Object)(t$3230)));
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    final public Rule Rule$$this$Rule() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        return Rule.this;
    }
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    // creation method for java code (1-phase java constructor)
    public Rule() {
        this((java.lang.System[]) null);
        Rule$$init$S();
    }
    
    // constructor for non-virtual call
    final public Rule Rule$$init$S() {
         {
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            
            
            //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
            this.__fieldInitializers_Rule();
        }
        return this;
    }
    
    
    
    //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
    final public void __fieldInitializers_Rule() {
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        this.command = null;
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        this.dependencies = null;
        
        //#line 4 "/user/3/.base/dekerlen/home/3A/sdca/gitSyst/DistMake/src/Rule.x10"
        this.createdFilename = null;
    }
}

