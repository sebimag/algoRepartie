#ifndef __X10_LANG_ITERATOR_H
#define __X10_LANG_ITERATOR_H

#include <x10rt.h>


#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS

namespace x10 { namespace lang { 

template<class TPMGL(T)> class Iterator;
template <> class Iterator<void>;
template<class TPMGL(T)> class Iterator   {
    public:
    RTT_H_DECLS_INTERFACE
    
    template <class Iface> struct itable {
        itable(x10_boolean (Iface::*equals) (::x10::lang::Any*), x10_boolean (Iface::*hasNext) (), x10_int (Iface::*hashCode) (), TPMGL(T) (Iface::*next) (), ::x10::lang::String* (Iface::*toString) (), ::x10::lang::String* (Iface::*typeName) ()) : equals(equals), hasNext(hasNext), hashCode(hashCode), next(next), toString(toString), typeName(typeName) {}
        x10_boolean (Iface::*equals) (::x10::lang::Any*);
        x10_boolean (Iface::*hasNext) ();
        x10_int (Iface::*hashCode) ();
        TPMGL(T) (Iface::*next) ();
        ::x10::lang::String* (Iface::*toString) ();
        ::x10::lang::String* (Iface::*typeName) ();
    };
    
    template <class R> static x10_boolean equals(R* _recv, ::x10::lang::Any* arg0);
    template <class R> static x10_boolean equals(R _recv, ::x10::lang::Any* arg0);
    template <class R> static x10_boolean hasNext(R* _recv);
    template <class R> static x10_boolean hasNext(R _recv);
    template <class R> static x10_int hashCode(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::lang::Iterator<TPMGL(T)> >(_refRecv->_getITables())->hashCode))();
    }
    template <class R> static x10_int hashCode(R _recv) {
        return _recv->hashCode();
    }
    template <class R> static TPMGL(T) next(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::lang::Iterator<TPMGL(T)> >(_refRecv->_getITables())->next))();
    }
    template <class R> static TPMGL(T) next(R _recv) {
        return _recv->next();
    }
    template <class R> static ::x10::lang::String* toString(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::lang::Iterator<TPMGL(T)> >(_refRecv->_getITables())->toString))();
    }
    template <class R> static ::x10::lang::String* toString(R _recv) {
        return _recv->toString();
    }
    template <class R> static ::x10::lang::String* typeName(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::lang::Iterator<TPMGL(T)> >(_refRecv->_getITables())->typeName))();
    }
    template <class R> static ::x10::lang::String* typeName(R _recv) {
        return _recv->typeName();
    }
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::lang::Iterator<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::lang::Iterator<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::Iterator<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.Iterator";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::interface_kind, 1, parents, 1, params, variances);
}

template <> class Iterator<void> : public ::x10::lang::X10Class {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_LANG_ITERATOR_H

namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 

#ifndef X10_LANG_ITERATOR_H_NODEPS
#define X10_LANG_ITERATOR_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#ifndef X10_LANG_ITERATOR_H_GENERICS
#define X10_LANG_ITERATOR_H_GENERICS
template<class TPMGL(T)> template <class R> x10_boolean x10::lang::Iterator<TPMGL(T)>::equals(R* _recv, ::x10::lang::Any* arg0) {
    ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
    return (_refRecv->*(::x10aux::findITable< ::x10::lang::Iterator<TPMGL(T)> >(_refRecv->_getITables())->equals))(arg0);
}
template<class TPMGL(T)> template <class R> x10_boolean x10::lang::Iterator<TPMGL(T)>::equals(R _recv, ::x10::lang::Any* arg0) {
    return _recv->equals(arg0);
}
template<class TPMGL(T)> template <class R> x10_boolean x10::lang::Iterator<TPMGL(T)>::hasNext(R* _recv) {
    ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
    return (_refRecv->*(::x10aux::findITable< ::x10::lang::Iterator<TPMGL(T)> >(_refRecv->_getITables())->hasNext))();
}
template<class TPMGL(T)> template <class R> x10_boolean x10::lang::Iterator<TPMGL(T)>::hasNext(R _recv) {
    return _recv->hasNext();
}
#endif // X10_LANG_ITERATOR_H_GENERICS
#ifndef X10_LANG_ITERATOR_H_IMPLEMENTATION
#define X10_LANG_ITERATOR_H_IMPLEMENTATION
#include <x10/lang/Iterator.h>

#endif // X10_LANG_ITERATOR_H_IMPLEMENTATION
#endif // __X10_LANG_ITERATOR_H_NODEPS
