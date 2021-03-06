#ifndef __X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H
#define __X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace util { namespace resilient { namespace localstore { 
class MasterState;
} } } } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace lang { 
class CheckedThrowable;
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
namespace x10 { namespace util { namespace resilient { namespace localstore { 
class Cloneable;
} } } } 
namespace x10 { namespace util { namespace resilient { namespace localstore { 
class TransKeyLog;
} } } } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterable;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Set;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 

namespace x10 { namespace util { namespace resilient { namespace localstore { 

class SlaveStore_Strings {
  public:
    static ::x10::lang::String sl__159947;
};

class SlaveStore : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::String* FMGL(moduleName);
    
    ::x10::util::HashMap<x10_long, ::x10::util::resilient::localstore::MasterState*>*
      FMGL(mastersMap);
    
    ::x10::util::concurrent::Lock* FMGL(lock);
    
    void _constructor();
    
    static ::x10::util::resilient::localstore::SlaveStore* _make(
             );
    
    virtual void addMasterPlace(x10_long masterVirtualId, ::x10::util::resilient::localstore::MasterState* masterState);
    virtual ::x10::util::resilient::localstore::MasterState* getMasterState(
      x10_long masterVirtualId);
    virtual void commit(::x10::lang::String* mapName, x10_long masterVirtualId,
                        ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::resilient::localstore::TransKeyLog*>* transLog);
    void applyChangesLockAcquired(::x10::lang::String* mapName, ::x10::util::resilient::localstore::MasterState* state,
                                  ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::resilient::localstore::TransKeyLog*>* transLog);
    virtual ::x10::util::resilient::localstore::SlaveStore*
      x10__util__resilient__localstore__SlaveStore____this__x10__util__resilient__localstore__SlaveStore(
      );
    virtual void __fieldInitializers_x10_util_resilient_localstore_SlaveStore(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } } } 
#endif // X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H

namespace x10 { namespace util { namespace resilient { namespace localstore { 
class SlaveStore;
} } } } 

#ifndef X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H_NODEPS
#define X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H_NODEPS
#ifndef X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H_GENERICS
#define X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H_GENERICS
#endif // X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H_GENERICS
#endif // __X10_UTIL_RESILIENT_LOCALSTORE_SLAVESTORE_H_NODEPS
