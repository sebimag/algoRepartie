#ifndef __X10_LANG_ZERO_H
#define __X10_LANG_ZERO_H

#include <x10rt.h>


namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 

namespace x10 { namespace lang { 

class Zero : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    virtual ::x10::lang::Zero* x10__lang__Zero____this__x10__lang__Zero();
    void _constructor();
    
    static ::x10::lang::Zero* _make();
    
    virtual void __fieldInitializers_x10_lang_Zero();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_ZERO_H

namespace x10 { namespace lang { 
class Zero;
} } 

#ifndef X10_LANG_ZERO_H_NODEPS
#define X10_LANG_ZERO_H_NODEPS
#include <x10/compiler/Native.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_ZERO_H_GENERICS
#define X10_LANG_ZERO_H_GENERICS
#endif // X10_LANG_ZERO_H_GENERICS
#endif // __X10_LANG_ZERO_H_NODEPS
