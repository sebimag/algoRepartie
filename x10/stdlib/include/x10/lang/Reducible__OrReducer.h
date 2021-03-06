#ifndef __X10_LANG_REDUCIBLE__ORREDUCER_H
#define __X10_LANG_REDUCIBLE__ORREDUCER_H

#include <x10rt.h>


#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS
#define X10_LANG_REDUCIBLE_H_NODEPS
#include <x10/lang/Reducible.h>
#undef X10_LANG_REDUCIBLE_H_NODEPS
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 

namespace x10 { namespace lang { 

class Reducible__OrReducer_Strings {
  public:
    static ::x10::lang::String sl__165488;
};

class Reducible__OrReducer   {
    public:
    RTT_H_DECLS_STRUCT
    
    ::x10::lang::Reducible__OrReducer* operator->() { return this; }
    
    static ::x10aux::itable_entry _itables[3];
    
    ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Any::itable< ::x10::lang::Reducible__OrReducer > _itable_0;
    
    static ::x10::lang::Reducible<x10_boolean>::itable< ::x10::lang::Reducible__OrReducer > _itable_1;
    
    static ::x10aux::itable_entry _iboxitables[3];
    
    ::x10aux::itable_entry* _getIBoxITables() { return _iboxitables; }
    
    static ::x10::lang::Reducible__OrReducer _alloc(){::x10::lang::Reducible__OrReducer t; return t; }
    
    x10_boolean zero() {
        return false;
        
    }
    x10_boolean __apply(x10_boolean a, x10_boolean b) {
        return (a || b);
        
    }
    ::x10::lang::String* typeName();
    ::x10::lang::String* toString();
    x10_int hashCode() {
        x10_int result = ((x10_int)1);
        return result;
        
    }
    x10_boolean equals(::x10::lang::Any* other);
    x10_boolean equals(::x10::lang::Reducible__OrReducer other) {
        return true;
        
    }
    x10_boolean _struct_equals(::x10::lang::Any* other);
    x10_boolean _struct_equals(::x10::lang::Reducible__OrReducer other) {
        return true;
        
    }
    ::x10::lang::Reducible__OrReducer x10__lang__Reducible__OrReducer____this__x10__lang__Reducible__OrReducer(
      ) {
        return (*this);
        
    }
    void _constructor() {
        
    }
    static ::x10::lang::Reducible__OrReducer _make() {
        ::x10::lang::Reducible__OrReducer this_; 
        this_->_constructor();
        return this_;
    }
    
    void __fieldInitializers_x10_lang_Reducible_OrReducer() {
     
    }
    
    static void _serialize(::x10::lang::Reducible__OrReducer this_, ::x10aux::serialization_buffer& buf);
    
    static ::x10::lang::Reducible__OrReducer _deserialize(::x10aux::deserialization_buffer& buf) {
        ::x10::lang::Reducible__OrReducer this_;
        this_->_deserialize_body(buf);
        return this_;
    }
    
    void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_REDUCIBLE__ORREDUCER_H

namespace x10 { namespace lang { 
class Reducible__OrReducer;
} } 

#ifndef X10_LANG_REDUCIBLE__ORREDUCER_H_NODEPS
#define X10_LANG_REDUCIBLE__ORREDUCER_H_NODEPS
#ifndef X10_LANG_REDUCIBLE__ORREDUCER_H_GENERICS
#define X10_LANG_REDUCIBLE__ORREDUCER_H_GENERICS
#endif // X10_LANG_REDUCIBLE__ORREDUCER_H_GENERICS
#endif // __X10_LANG_REDUCIBLE__ORREDUCER_H_NODEPS
