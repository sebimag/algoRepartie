#ifndef __X10_XRX_FINISHRESILIENTPLACE0_H
#define __X10_XRX_FINISHRESILIENTPLACE0_H

#include <x10rt.h>


#define X10_XRX_FINISHRESILIENT_H_NODEPS
#include <x10/xrx/FinishResilient.h>
#undef X10_XRX_FINISHRESILIENT_H_NODEPS
#define X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#include <x10/io/CustomSerialization.h>
#undef X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#define X10_XRX_FINISHRESILIENTPLACE0__ID_H_NODEPS
#include <x10/xrx/FinishResilientPlace0__Id.h>
#undef X10_XRX_FINISHRESILIENTPLACE0__ID_H_NODEPS
#define X10_XRX_FINISHRESILIENTPLACE0__ID_H_NODEPS
#include <x10/xrx/FinishResilientPlace0__Id.h>
#undef X10_XRX_FINISHRESILIENTPLACE0__ID_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace xrx { 
class FinishResilientPlace0__State;
} } 
namespace x10 { namespace xrx { 
class Runtime;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicInteger;
} } } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace xrx { 
class FinishState;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class FailedDynamicCheckException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace io { 
class Deserializer;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace io { 
class Serializer;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace xrx { 
class FinishResilientPlace0__Task;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Val)> class Map__Entry;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterable;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Set;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class HashSet;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class MapSet;
} } 
namespace x10 { namespace xrx { 
class Activity;
} } 
namespace x10 { namespace xrx { 
class Worker;
} } 
namespace x10 { namespace compiler { 
class Immediate;
} } 
namespace x10 { namespace xrx { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class DeadPlaceException;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace lang { 
class System;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 

namespace x10 { namespace xrx { 

class FinishResilientPlace0_Strings {
  public:
    static ::x10::lang::String sl__161156;
    static ::x10::lang::String sl__161123;
    static ::x10::lang::String sl__161127;
    static ::x10::lang::String sl__161171;
    static ::x10::lang::String sl__161133;
    static ::x10::lang::String sl__161163;
    static ::x10::lang::String sl__161138;
    static ::x10::lang::String sl__161176;
    static ::x10::lang::String sl__161175;
    static ::x10::lang::String sl__161120;
    static ::x10::lang::String sl__161181;
    static ::x10::lang::String sl__161143;
    static ::x10::lang::String sl__161151;
    static ::x10::lang::String sl__161153;
    static ::x10::lang::String sl__161167;
    static ::x10::lang::String sl__161137;
    static ::x10::lang::String sl__161182;
    static ::x10::lang::String sl__161130;
    static ::x10::lang::String sl__161149;
    static ::x10::lang::String sl__161174;
    static ::x10::lang::String sl__161131;
    static ::x10::lang::String sl__161113;
    static ::x10::lang::String sl__161106;
    static ::x10::lang::String sl__161142;
    static ::x10::lang::String sl__161126;
    static ::x10::lang::String sl__161177;
    static ::x10::lang::String sl__161140;
    static ::x10::lang::String sl__161165;
    static ::x10::lang::String sl__161111;
    static ::x10::lang::String sl__161168;
    static ::x10::lang::String sl__161108;
    static ::x10::lang::String sl__161178;
    static ::x10::lang::String sl__161148;
    static ::x10::lang::String sl__161154;
    static ::x10::lang::String sl__161105;
    static ::x10::lang::String sl__161170;
    static ::x10::lang::String sl__161115;
    static ::x10::lang::String sl__161158;
    static ::x10::lang::String sl__161150;
    static ::x10::lang::String sl__161119;
    static ::x10::lang::String sl__161121;
    static ::x10::lang::String sl__161109;
    static ::x10::lang::String sl__161135;
    static ::x10::lang::String sl__161180;
    static ::x10::lang::String sl__161146;
    static ::x10::lang::String sl__161136;
    static ::x10::lang::String sl__161117;
    static ::x10::lang::String sl__161155;
    static ::x10::lang::String sl__161147;
    static ::x10::lang::String sl__161114;
    static ::x10::lang::String sl__161141;
    static ::x10::lang::String sl__161152;
    static ::x10::lang::String sl__161112;
    static ::x10::lang::String sl__161129;
    static ::x10::lang::String sl__161169;
    static ::x10::lang::String sl__161139;
    static ::x10::lang::String sl__161179;
    static ::x10::lang::String sl__161125;
    static ::x10::lang::String sl__161124;
    static ::x10::lang::String sl__161172;
    static ::x10::lang::String sl__161122;
    static ::x10::lang::String sl__161128;
    static ::x10::lang::String sl__161164;
    static ::x10::lang::String sl__161118;
    static ::x10::lang::String sl__161161;
    static ::x10::lang::String sl__161116;
    static ::x10::lang::String sl__161144;
    static ::x10::lang::String sl__161162;
    static ::x10::lang::String sl__161110;
    static ::x10::lang::String sl__161157;
    static ::x10::lang::String sl__161159;
    static ::x10::lang::String sl__161166;
    static ::x10::lang::String sl__161134;
    static ::x10::lang::String sl__161173;
    static ::x10::lang::String sl__161107;
    static ::x10::lang::String sl__161160;
    static ::x10::lang::String sl__161132;
    static ::x10::lang::String sl__161145;
};

class FinishResilientPlace0 : public ::x10::xrx::FinishResilient   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::CustomSerialization::itable< ::x10::xrx::FinishResilientPlace0 > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::xrx::FinishResilientPlace0 > _itable_1;
    
    /* Static field: FMGL(verbose) */
    static x10_long FMGL(verbose);
    static void FMGL(verbose__do_init)();
    static void FMGL(verbose__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(verbose__status);
    static ::x10::lang::CheckedThrowable* FMGL(verbose__exception);
    static x10_long FMGL(verbose__get)();
    
    /* Static field: FMGL(place0) */
    static ::x10::lang::Place FMGL(place0);
    static void FMGL(place0__do_init)();
    static void FMGL(place0__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(place0__status);
    static ::x10::lang::CheckedThrowable* FMGL(place0__exception);
    static ::x10::lang::Place FMGL(place0__get)();
    
    /* Static field: FMGL(AT) */
    static const x10_int FMGL(AT) = 0;
    static x10_int FMGL(AT__get)();
    
    /* Static field: FMGL(ASYNC) */
    static const x10_int FMGL(ASYNC) = 1;
    static x10_int FMGL(ASYNC__get)();
    
    /* Static field: FMGL(UNASSIGNED) */
    static ::x10::xrx::FinishResilientPlace0__Id FMGL(UNASSIGNED);
    static void FMGL(UNASSIGNED__do_init)();
    static void FMGL(UNASSIGNED__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(UNASSIGNED__status);
    static ::x10::lang::CheckedThrowable* FMGL(UNASSIGNED__exception);
    static ::x10::xrx::FinishResilientPlace0__Id FMGL(UNASSIGNED__get)();
    
    /* Static field: FMGL(states) */
    static ::x10::util::HashMap< ::x10::xrx::FinishResilientPlace0__Id, ::x10::xrx::FinishResilientPlace0__State*>* FMGL(states);
    static void FMGL(states__do_init)();
    static void FMGL(states__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(states__status);
    static ::x10::lang::CheckedThrowable* FMGL(states__exception);
    static ::x10::util::HashMap< ::x10::xrx::FinishResilientPlace0__Id, ::x10::xrx::FinishResilientPlace0__State*>*
      FMGL(states__get)();
    
    /* Static field: FMGL(lock) */
    static ::x10::util::concurrent::Lock* FMGL(lock);
    static void FMGL(lock__do_init)();
    static void FMGL(lock__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(lock__status);
    static ::x10::lang::CheckedThrowable* FMGL(lock__exception);
    static ::x10::util::concurrent::Lock* FMGL(lock__get)();
    
    /* Static field: FMGL(nextId) */
    static ::x10::util::concurrent::AtomicInteger* FMGL(nextId);
    static void FMGL(nextId__do_init)();
    static void FMGL(nextId__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(nextId__status);
    static ::x10::lang::CheckedThrowable* FMGL(nextId__exception);
    static ::x10::util::concurrent::AtomicInteger* FMGL(nextId__get)();
    
    ::x10::xrx::FinishResilientPlace0__Id FMGL(id);
    
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* >
      FMGL(grlc);
    
    ::x10::lang::GlobalRef< ::x10::xrx::FinishResilientPlace0* > FMGL(ref);
    
    x10_boolean FMGL(isGlobal);
    
    x10_boolean FMGL(strictFinish);
    
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    ::x10::xrx::FinishState* FMGL(parent);
    
    ::x10::util::GrowableRail< ::x10::lang::CheckedThrowable*>* FMGL(excs);
    
    ::x10::util::concurrent::AtomicInteger* localCount();
    virtual ::x10::lang::String* toString();
    void _constructor(::x10::xrx::FinishState* p);
    
    static ::x10::xrx::FinishResilientPlace0* _make(::x10::xrx::FinishState* p);
    
    void _constructor(::x10::io::Deserializer* deser);
    
    static ::x10::xrx::FinishResilientPlace0* _make(::x10::io::Deserializer* deser);
    
    virtual void serialize(::x10::io::Serializer* ser);
    void globalInit();
    static ::x10::xrx::FinishResilientPlace0* make(::x10::xrx::FinishState* parent);
    static void notifyPlaceDeath();
    void forgetGlobalRefs();
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual void notifyShiftedActivitySpawn(::x10::lang::Place place);
    virtual void notifySubActivitySpawn(::x10::lang::Place place,
                                        x10_int kind);
    virtual void notifyRemoteContinuationCreated();
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace,
                                               ::x10::xrx::Activity* activity);
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace,
                                               ::x10::xrx::Activity* activity,
                                               x10_int kind);
    virtual x10_boolean notifyShiftedActivityCreation(::x10::lang::Place srcPlace);
    virtual void notifyActivityCreationFailed(::x10::lang::Place srcPlace,
                                              ::x10::lang::CheckedThrowable* t);
    virtual void notifyActivityCreationFailed(::x10::lang::Place srcPlace,
                                              ::x10::lang::CheckedThrowable* t,
                                              x10_int kind);
    virtual void notifyActivityCreatedAndTerminated(::x10::lang::Place srcPlace);
    virtual void notifyActivityCreatedAndTerminated(::x10::lang::Place srcPlace,
                                                    x10_int kind);
    virtual void notifyActivityTermination();
    virtual void notifyShiftedActivityCompletion();
    virtual void notifyActivityTermination(x10_int kind);
    virtual void pushException(::x10::lang::CheckedThrowable* t);
    virtual void waitForFinish();
    virtual void spawnRemoteActivity(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                                     ::x10::xrx::Runtime__Profile* prof);
    virtual ::x10::xrx::FinishResilientPlace0* x10__xrx__FinishResilientPlace0____this__x10__xrx__FinishResilientPlace0(
      );
    virtual void __fieldInitializers_x10_xrx_FinishResilientPlace0(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_XRX_FINISHRESILIENTPLACE0_H

namespace x10 { namespace xrx { 
class FinishResilientPlace0;
} } 

#ifndef X10_XRX_FINISHRESILIENTPLACE0_H_NODEPS
#define X10_XRX_FINISHRESILIENTPLACE0_H_NODEPS
#include <x10/xrx/FinishResilient.h>
#include <x10/io/CustomSerialization.h>
#include <x10/xrx/FinishResilientPlace0__Id.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/lang/Place.h>
#include <x10/lang/Int.h>
#include <x10/util/HashMap.h>
#include <x10/xrx/FinishResilientPlace0__State.h>
#include <x10/xrx/Runtime.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/xrx/FinishState.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/FailedDynamicCheckException.h>
#include <x10/lang/String.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/io/Serializer.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/xrx/FinishResilientPlace0__Task.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Finalization.h>
#include <x10/lang/Iterator.h>
#include <x10/util/Map__Entry.h>
#include <x10/lang/Iterable.h>
#include <x10/util/Set.h>
#include <x10/util/HashSet.h>
#include <x10/util/MapSet.h>
#include <x10/xrx/Activity.h>
#include <x10/xrx/Worker.h>
#include <x10/compiler/Immediate.h>
#include <x10/xrx/Runtime__Profile.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/System.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/String.h>
#ifndef X10_XRX_FINISHRESILIENTPLACE0_H_GENERICS
#define X10_XRX_FINISHRESILIENTPLACE0_H_GENERICS
inline x10_long x10::xrx::FinishResilientPlace0::FMGL(verbose__get)() {
    if (FMGL(verbose__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(verbose__init)();
    }
    return x10::xrx::FinishResilientPlace0::FMGL(verbose);
}

inline ::x10::lang::Place x10::xrx::FinishResilientPlace0::FMGL(place0__get)() {
    if (FMGL(place0__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(place0__init)();
    }
    return x10::xrx::FinishResilientPlace0::FMGL(place0);
}

inline x10_int x10::xrx::FinishResilientPlace0::FMGL(AT__get)() {
    return x10::xrx::FinishResilientPlace0::FMGL(AT);
}

inline x10_int x10::xrx::FinishResilientPlace0::FMGL(ASYNC__get)() {
    return x10::xrx::FinishResilientPlace0::FMGL(ASYNC);
}

inline ::x10::xrx::FinishResilientPlace0__Id x10::xrx::FinishResilientPlace0::FMGL(UNASSIGNED__get)() {
    if (FMGL(UNASSIGNED__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(UNASSIGNED__init)();
    }
    return x10::xrx::FinishResilientPlace0::FMGL(UNASSIGNED);
}

inline ::x10::util::HashMap< ::x10::xrx::FinishResilientPlace0__Id, ::x10::xrx::FinishResilientPlace0__State*>*
  x10::xrx::FinishResilientPlace0::FMGL(states__get)() {
    if (FMGL(states__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(states__init)();
    }
    return x10::xrx::FinishResilientPlace0::FMGL(states);
}

inline ::x10::util::concurrent::Lock* x10::xrx::FinishResilientPlace0::FMGL(lock__get)() {
    if (FMGL(lock__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(lock__init)();
    }
    return x10::xrx::FinishResilientPlace0::FMGL(lock);
}

inline ::x10::util::concurrent::AtomicInteger* x10::xrx::FinishResilientPlace0::FMGL(nextId__get)() {
    if (FMGL(nextId__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(nextId__init)();
    }
    return x10::xrx::FinishResilientPlace0::FMGL(nextId);
}

#endif // X10_XRX_FINISHRESILIENTPLACE0_H_GENERICS
#endif // __X10_XRX_FINISHRESILIENTPLACE0_H_NODEPS
