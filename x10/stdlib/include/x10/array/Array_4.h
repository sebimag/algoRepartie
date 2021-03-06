#ifndef __X10_ARRAY_ARRAY_4_H
#define __X10_ARRAY_ARRAY_4_H

#include <x10rt.h>


#define X10_ARRAY_ARRAY_H_NODEPS
#include <x10/array/Array.h>
#undef X10_ARRAY_ARRAY_H_NODEPS
#define X10_LANG_FUN_0_4_H_NODEPS
#include <x10/lang/Fun_0_4.h>
#undef X10_LANG_FUN_0_4_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class IllegalOperationException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace array { 
class DenseIterationSpace_4;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 

namespace x10 { namespace array { 

class Array_4_Strings {
  public:
    static ::x10::lang::String sl__163595;
    static ::x10::lang::String sl__163590;
    static ::x10::lang::String sl__163594;
    static ::x10::lang::String sl__163596;
    static ::x10::lang::String sl__163591;
    static ::x10::lang::String sl__163597;
    static ::x10::lang::String sl__163598;
    static ::x10::lang::String sl__163592;
    static ::x10::lang::String sl__163593;
    static ::x10::lang::String sl__163599;
};

template<class TPMGL(T)> class Array_4;
template <> class Array_4<void>;
template<class TPMGL(T)> class Array_4 : public ::x10::array::Array<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(numElems_1);
    
    x10_long FMGL(numElems_2);
    
    x10_long FMGL(numElems_3);
    
    x10_long FMGL(numElems_4);
    
    static ::x10aux::itable_entry _itables[5];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_4<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::Array_4<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_4<TPMGL(T)> > _itable_2;
    
    static typename ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::Array_4<TPMGL(T)> > _itable_3;
    
    x10_long rank();
    void _constructor(x10_long m, x10_long n, x10_long p, x10_long q);
    
    static ::x10::array::Array_4<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  x10_long p, x10_long q);
    
    void _constructor(x10_long m, x10_long n, x10_long p, x10_long q, TPMGL(T) init);
    
    static ::x10::array::Array_4<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  x10_long p, x10_long q,
                                                  TPMGL(T) init);
    
    void _constructor(x10_long m, x10_long n, x10_long p, x10_long q, ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>* init);
    
    static ::x10::array::Array_4<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  x10_long p, x10_long q,
                                                  ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>* init);
    
    void _constructor(::x10::array::Array_4<TPMGL(T)>* src);
    
    static ::x10::array::Array_4<TPMGL(T)>* _make(::x10::array::Array_4<TPMGL(T)>* src);
    
    void _constructor(::x10::lang::Rail< TPMGL(T) >* r, x10_long m, x10_long n,
                      x10_long p, x10_long q);
    
    static ::x10::array::Array_4<TPMGL(T)>* _make(::x10::lang::Rail< TPMGL(T) >* r,
                                                  x10_long m, x10_long n,
                                                  x10_long p, x10_long q);
    
    virtual ::x10::lang::String* toString();
    virtual ::x10::lang::String* toString(x10_long limit);
    virtual ::x10::array::IterationSpace* indices();
    virtual x10_long offset(x10_long i, x10_long j, x10_long k, x10_long l);
    virtual TPMGL(T) __apply(x10_long i, x10_long j, x10_long k, x10_long l);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, x10_long j, x10_long k, x10_long l,
                           TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual ::x10::array::Array_4<TPMGL(T)>* x10__array__Array_4____this__x10__array__Array_4(
      );
    virtual void __fieldInitializers_x10_array_Array_4();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::Array_4<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::Array_4<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::Array<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.Array_4";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Array_4<void> : public ::x10::array::Array<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::array::Array_4<TPMGL(T)>*
      makeView(::x10::lang::Rail< TPMGL(T) >* r, x10_long m,
               x10_long n, x10_long p, x10_long q);
    
    static x10_long validateSize(x10_long m, x10_long n, x10_long p,
                                 x10_long q);
    
    
};

} } 
#endif // X10_ARRAY_ARRAY_4_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class Array_4;
} } 

#ifndef X10_ARRAY_ARRAY_4_H_NODEPS
#define X10_ARRAY_ARRAY_4_H_NODEPS
#include <x10/array/Array.h>
#include <x10/lang/Fun_0_4.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/lang/String.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Any.h>
#include <x10/lang/Unsafe.h>
#include <x10/array/DenseIterationSpace_4.h>
#include <x10/lang/Point.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/String.h>
#ifndef X10_ARRAY_ARRAY_4_H_GENERICS
#define X10_ARRAY_ARRAY_4_H_GENERICS
#endif // X10_ARRAY_ARRAY_4_H_GENERICS
#ifndef X10_ARRAY_ARRAY_4_H_IMPLEMENTATION
#define X10_ARRAY_ARRAY_4_H_IMPLEMENTATION
#include <x10/array/Array_4.h>


//#line 25 "x10/array/Array_4.x10"
/**
         * The number of elements in rank 1 (indexed 0..(numElems_1-1))
         */

//#line 30 "x10/array/Array_4.x10"
/**
         * The number of elements in rank 2 (indexed 0..(numElems_2-1)).
         */

//#line 35 "x10/array/Array_4.x10"
/**
         * The number of elements in rank 3 (indexed 0..(numElems_3-1)).
         */

//#line 40 "x10/array/Array_4.x10"
/**
         * The number of elements in rank 4 (indexed 0..(numElems_4-1)).
         */
template<class TPMGL(T)> typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_4<TPMGL(T)> >  x10::array::Array_4<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::Array<TPMGL(T)>::iterator, &x10::array::Array_4<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::Array_4<TPMGL(T)> >  x10::array::Array_4<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_4<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_4<TPMGL(T)> >  x10::array::Array_4<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_4<TPMGL(T)>::__apply, &x10::array::Array_4<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::Array_4<TPMGL(T)> >  x10::array::Array_4<TPMGL(T)>::_itable_3(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_4<TPMGL(T)>::__apply, &x10::array::Array_4<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::Array_4<TPMGL(T)>::_itables[5] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)> >, &_itable_3), ::x10aux::itable_entry(NULL, (void*)"::x10::array::Array_4<TPMGL(T)>")};

//#line 46 "x10/array/Array_4.x10"
/**
     * @return the rank (dimensionality) of the Array
     */
template<class TPMGL(T)> x10_long x10::array::Array_4<TPMGL(T)>::rank() {
    return ((x10_long)4ll);
    
}

//#line 52 "x10/array/Array_4.x10"
/**
     * Construct a 4-dimensional array with indices [0..m-1][0..n-1][0..p-1][0..q-1]
     * whose elements are zero-initialized.
     */
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, x10_long p, x10_long q) {
    
    //#line 53 "x10/array/Array_4.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 228 "x10/array/Array_4.x10"
                                                            if ((((((m) < (((x10_long)0ll))) ||
                                                                ((n) < (((x10_long)0ll)))) ||
                                                                ((p) < (((x10_long)0ll)))) ||
                                                                ((q) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            ((((((m) * (n))) * (p))) * (q));
                                                        }))
                                                        ,
                                                        true);
    
    //#line 54 "x10/array/Array_4.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    FMGL(numElems_4) = q;
    
}
template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>* x10::array::Array_4<TPMGL(T)>::_make(
                           x10_long m, x10_long n, x10_long p,
                           x10_long q) {
    ::x10::array::Array_4<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>();
    this_->_constructor(m, n, p, q);
    return this_;
}



//#line 61 "x10/array/Array_4.x10"
/**
     * Construct a 4-dimensional array with indices [0..m-1][0..n-1][0..p-1][0..q-1]
     * whose elements are initialized to init.
     */
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, x10_long p,
                           x10_long q, TPMGL(T) init) {
    
    //#line 62 "x10/array/Array_4.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 228 "x10/array/Array_4.x10"
                                                            if ((((((m) < (((x10_long)0ll))) ||
                                                                ((n) < (((x10_long)0ll)))) ||
                                                                ((p) < (((x10_long)0ll)))) ||
                                                                ((q) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            ((((((m) * (n))) * (p))) * (q));
                                                        }))
                                                        ,
                                                        false);
    
    //#line 63 "x10/array/Array_4.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    FMGL(numElems_4) = q;
    
    //#line 64 "x10/array/Array_4.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::fill(
      init);
}
template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>* x10::array::Array_4<TPMGL(T)>::_make(
                           x10_long m, x10_long n, x10_long p,
                           x10_long q, TPMGL(T) init) {
    ::x10::array::Array_4<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>();
    this_->_constructor(m, n, p, q, init);
    return this_;
}



//#line 71 "x10/array/Array_4.x10"
/**
     * Construct a 4-dimensional array with indices [0..m-1][0..n-1][0..p-1][0..q-1]
     * whose elements are initialized to the value returned by the init closure for each index.
     */
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, x10_long p,
                           x10_long q, ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>* init) {
    
    //#line 72 "x10/array/Array_4.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 228 "x10/array/Array_4.x10"
                                                            if ((((((m) < (((x10_long)0ll))) ||
                                                                ((n) < (((x10_long)0ll)))) ||
                                                                ((p) < (((x10_long)0ll)))) ||
                                                                ((q) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            ((((((m) * (n))) * (p))) * (q));
                                                        }))
                                                        ,
                                                        false);
    
    //#line 73 "x10/array/Array_4.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    FMGL(numElems_4) = q;
    
    //#line 74 "x10/array/Array_4.x10"
    x10_long i__95506max__96263 = ((m) - (((x10_long)1ll)));
    {
        x10_long i__96264;
        for (i__96264 = ((x10_long)0ll); ((i__96264) <= (i__95506max__96263));
             i__96264 = ((i__96264) + (((x10_long)1ll))))
        {
            
            //#line 75 "x10/array/Array_4.x10"
            x10_long i__95488max__96260 = ((n) - (((x10_long)1ll)));
            {
                x10_long i__96261;
                for (i__96261 = ((x10_long)0ll); ((i__96261) <= (i__95488max__96260));
                     i__96261 = ((i__96261) + (((x10_long)1ll))))
                {
                    
                    //#line 76 "x10/array/Array_4.x10"
                    x10_long i__95470max__96257 = ((p) - (((x10_long)1ll)));
                    {
                        x10_long i__96258;
                        for (i__96258 = ((x10_long)0ll); ((i__96258) <= (i__95470max__96257));
                             i__96258 = ((i__96258) + (((x10_long)1ll))))
                        {
                            
                            //#line 77 "x10/array/Array_4.x10"
                            x10_long i__95452max__96254 =
                              ((q) - (((x10_long)1ll)));
                            {
                                x10_long i__96255;
                                for (i__96255 = ((x10_long)0ll);
                                     ((i__96255) <= (i__95452max__96254));
                                     i__96255 = ((i__96255) + (((x10_long)1ll))))
                                {
                                    
                                    //#line 78 "x10/array/Array_4.x10"
                                    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
                                      (__extension__ ({
                                          ::x10::array::Array_4<TPMGL(T)>* this__96249 =
                                            this;
                                          ((i__96255) + (((::x10aux::nullCheck(this__96249)->FMGL(numElems_4)) * (((i__96258) + (((::x10aux::nullCheck(this__96249)->FMGL(numElems_3)) * (((i__96261) + (((i__96264) * (::x10aux::nullCheck(this__96249)->FMGL(numElems_2)))))))))))));
                                      }))
                                      , ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                                        i__96264, i__96261,
                                        i__96258, i__96255));
                                }
                            }
                            
                        }
                    }
                    
                }
            }
            
        }
    }
    
}
template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>* x10::array::Array_4<TPMGL(T)>::_make(
                           x10_long m, x10_long n, x10_long p,
                           x10_long q, ::x10::lang::Fun_0_4<x10_long, x10_long, x10_long, x10_long, TPMGL(T)>* init)
{
    ::x10::array::Array_4<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>();
    this_->_constructor(m, n, p, q, init);
    return this_;
}



//#line 89 "x10/array/Array_4.x10"
/**
     * Construct a new 4-dimensional array by copying all elements of src
     * @param src The source array to copy
     */
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_constructor(
                           ::x10::array::Array_4<TPMGL(T)>* src) {
    
    //#line 90 "x10/array/Array_4.x10"
    ::x10::array::Array<TPMGL(T)>* this__96267 = this;
    ::x10::lang::Rail< TPMGL(T) >* r__96268 = ::x10::lang::Rail< TPMGL(T) >::_make(::x10aux::nullCheck(src)->FMGL(raw));
    
    //#line 65 "x10/array/Array.x10"
    ::x10aux::nullCheck(this__96267)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__96268)->FMGL(size));
    
    //#line 66 "x10/array/Array.x10"
    ::x10aux::nullCheck(this__96267)->FMGL(raw) = r__96268;
    
    //#line 91 "x10/array/Array_4.x10"
    FMGL(numElems_1) = ::x10aux::nullCheck(src)->FMGL(numElems_1);
    FMGL(numElems_2) = ::x10aux::nullCheck(src)->FMGL(numElems_2);
    FMGL(numElems_3) = ::x10aux::nullCheck(src)->FMGL(numElems_3);
    FMGL(numElems_4) = ::x10aux::nullCheck(src)->FMGL(numElems_4);
    
}
template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>* x10::array::Array_4<TPMGL(T)>::_make(
                           ::x10::array::Array_4<TPMGL(T)>* src)
{
    ::x10::array::Array_4<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>();
    this_->_constructor(src);
    return this_;
}



//#line 95 "x10/array/Array_4.x10"
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* r,
                           x10_long m, x10_long n, x10_long p,
                           x10_long q) {
    
    //#line 96 "x10/array/Array_4.x10"
    ::x10::array::Array<TPMGL(T)>* this__96270 = this;
    
    //#line 65 "x10/array/Array.x10"
    ::x10aux::nullCheck(this__96270)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r)->FMGL(size));
    
    //#line 66 "x10/array/Array.x10"
    ::x10aux::nullCheck(this__96270)->FMGL(raw) = r;
    
    //#line 97 "x10/array/Array_4.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    FMGL(numElems_4) = q;
    
}
template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>* x10::array::Array_4<TPMGL(T)>::_make(
                           ::x10::lang::Rail< TPMGL(T) >* r,
                           x10_long m, x10_long n, x10_long p,
                           x10_long q) {
    ::x10::array::Array_4<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>();
    this_->_constructor(r, m, n, p, q);
    return this_;
}



//#line 103 "x10/array/Array_4.x10"
/**
     * Construct an Array_4 view over an existing Rail
     */

//#line 115 "x10/array/Array_4.x10"
/**
     * Return the string representation of this array.
     * 
     * @return the string representation of this array.
     */
template<class TPMGL(T)> ::x10::lang::String* x10::array::Array_4<TPMGL(T)>::toString(
  ) {
    
    //#line 116 "x10/array/Array_4.x10"
    return this->x10::array::template Array_4<TPMGL(T)>::toString(
             ((x10_long)10ll));
    
}

//#line 125 "x10/array/Array_4.x10"
/**
     * Return the string representation of this array.
     *
     * @param limit maximum number of elements to print
     * @return the string representation of this array.
     */
template<class TPMGL(T)> ::x10::lang::String* x10::array::Array_4<TPMGL(T)>::toString(
  x10_long limit) {
    
    //#line 126 "x10/array/Array_4.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 127 "x10/array/Array_4.x10"
    sb->add((&::x10::array::Array_4_Strings::sl__163593));
    
    //#line 128 "x10/array/Array_4.x10"
    x10_long printed = ((x10_long)0ll);
    
    //#line 129 "x10/array/Array_4.x10"
    x10_long i__95578max__96291 = ((this->FMGL(numElems_1)) - (((x10_long)1ll)));
    goto outer__96292; outer__96292: {
        x10_long i__96293;
        for (i__96293 = ((x10_long)0ll); ((i__96293) <= (i__95578max__96291));
             i__96293 = ((i__96293) + (((x10_long)1ll))))
        {
        {
            
            //#line 130 "x10/array/Array_4.x10"
            x10_long i__95560max__96288 = ((this->FMGL(numElems_2)) - (((x10_long)1ll)));
            {
                x10_long i__96289;
                for (i__96289 = ((x10_long)0ll); ((i__96289) <= (i__95560max__96288));
                     i__96289 = ((i__96289) + (((x10_long)1ll))))
                {
                    
                    //#line 131 "x10/array/Array_4.x10"
                    x10_long i__95542max__96285 = ((this->FMGL(numElems_3)) - (((x10_long)1ll)));
                    {
                        x10_long i__96286;
                        for (i__96286 = ((x10_long)0ll); ((i__96286) <= (i__95542max__96285));
                             i__96286 = ((i__96286) + (((x10_long)1ll))))
                        {
                            
                            //#line 132 "x10/array/Array_4.x10"
                            x10_long i__95524max__96282 =
                              ((this->FMGL(numElems_4)) - (((x10_long)1ll)));
                            {
                                x10_long i__96283;
                                for (i__96283 = ((x10_long)0ll);
                                     ((i__96283) <= (i__95524max__96282));
                                     i__96283 = ((i__96283) + (((x10_long)1ll))))
                                {
                                    
                                    //#line 133 "x10/array/Array_4.x10"
                                    if ((!::x10aux::struct_equals(i__96283,
                                                                  ((x10_long)0ll))))
                                    {
                                        sb->add((&::x10::array::Array_4_Strings::sl__163594));
                                    }
                                    
                                    //#line 134 "x10/array/Array_4.x10"
                                    reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                                                     ::x10aux::class_cast_unchecked< ::x10::lang::Any*>((__extension__ ({
                                                                                         ::x10::array::Array_4<TPMGL(T)>* this__96273 =
                                                                                           this;
                                                                                         
                                                                                         //#line 175 "x10/array/Array_4.x10"
                                                                                         if ((true &&
                                                                                             ((((((((((i__96293) < (((x10_long)0ll))) ||
                                                                                              ((i__96293) >= (::x10aux::nullCheck(this__96273)->FMGL(numElems_1)))) ||
                                                                                              ((i__96289) < (((x10_long)0ll)))) ||
                                                                                              ((i__96289) >= (::x10aux::nullCheck(this__96273)->FMGL(numElems_2)))) ||
                                                                                              ((i__96286) < (((x10_long)0ll)))) ||
                                                                                              ((i__96286) >= (::x10aux::nullCheck(this__96273)->FMGL(numElems_3)))) ||
                                                                                              ((i__96283) < (((x10_long)0ll)))) ||
                                                                                              ((i__96283) >= (::x10aux::nullCheck(this__96273)->FMGL(numElems_4)))))))
                                                                                         {
                                                                                             
                                                                                             //#line 179 "x10/array/Array_4.x10"
                                                                                             ::x10::array::Array<void>::raiseBoundsError(
                                                                                               i__96293,
                                                                                               i__96289,
                                                                                               i__96286,
                                                                                               i__96283);
                                                                                         }
                                                                                         (::x10aux::nullCheck(this__96273)->FMGL(raw))->unchecked_apply(((i__96283) + (((::x10aux::nullCheck(this__96273)->FMGL(numElems_4)) * (((i__96286) + (((::x10aux::nullCheck(this__96273)->FMGL(numElems_3)) * (((i__96289) + (((i__96293) * (::x10aux::nullCheck(this__96273)->FMGL(numElems_2))))))))))))));
                                                                                     }))
                                                                                     )));
                                    
                                    //#line 135 "x10/array/Array_4.x10"
                                    if (((printed = ((printed) + (((x10_long)1ll)))) > (limit)))
                                    {
                                        goto outer__96292_end_;
                                    }
                                    
                                }
                            }
                            
                            //#line 137 "x10/array/Array_4.x10"
                            sb->add((::x10aux::struct_equals(i__96286,
                                                             ((this->FMGL(numElems_3)) - (((x10_long)1ll)))))
                                      ? ((&::x10::array::Array_4_Strings::sl__163595))
                                      : ((&::x10::array::Array_4_Strings::sl__163596)));
                        }
                    }
                    
                    //#line 139 "x10/array/Array_4.x10"
                    sb->add((::x10aux::struct_equals(i__96289,
                                                     ((this->FMGL(numElems_2)) - (((x10_long)1ll)))))
                              ? ((&::x10::array::Array_4_Strings::sl__163595))
                              : ((&::x10::array::Array_4_Strings::sl__163596)));
                }
            }
            
        }
        goto outer__96292_next_; outer__96292_next_: ;
        }
        goto outer__96292_end_; outer__96292_end_: ;
    }
    
    //#line 142 "x10/array/Array_4.x10"
    if (((limit) < (this->FMGL(size)))) {
        
        //#line 143 "x10/array/Array_4.x10"
        sb->add(::x10::lang::String::__plus(::x10::lang::String::__plus((&::x10::array::Array_4_Strings::sl__163597), ((this->FMGL(size)) - (limit))), (&::x10::array::Array_4_Strings::sl__163598)));
    }
    
    //#line 145 "x10/array/Array_4.x10"
    sb->add((&::x10::array::Array_4_Strings::sl__163599));
    
    //#line 146 "x10/array/Array_4.x10"
    return sb->toString();
    
}

//#line 152 "x10/array/Array_4.x10"
/**
     * @return an IterationSpace containing all valid Points for indexing this Array.
     */
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::Array_4<TPMGL(T)>::indices(
  ) {
    
    //#line 153 "x10/array/Array_4.x10"
    ::x10::array::DenseIterationSpace_4* alloc__96295 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_4>()) ::x10::array::DenseIterationSpace_4());
    (alloc__96295)->::x10::array::DenseIterationSpace_4::_constructor(
      ((x10_long)0ll), ((x10_long)0ll), ((x10_long)0ll), ((x10_long)0ll),
      ((this->FMGL(numElems_1)) - (((x10_long)1ll))), ((this->FMGL(numElems_2)) - (((x10_long)1ll))),
      ((this->FMGL(numElems_3)) - (((x10_long)1ll))), ((this->FMGL(numElems_4)) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::array::IterationSpace*>(alloc__96295);
    
}

//#line 160 "x10/array/Array_4.x10"
/**
     * Map a 4-D (i,j,k,l) index into a 1-D index into the backing Rail
     * returned by raw(). Uses row-major ordering.
     */
template<class TPMGL(T)> x10_long x10::array::Array_4<TPMGL(T)>::offset(
  x10_long i, x10_long j, x10_long k, x10_long l) {
    
    //#line 161 "x10/array/Array_4.x10"
    return ((l) + (((this->FMGL(numElems_4)) * (((k) + (((this->FMGL(numElems_3)) * (((j) + (((i) * (this->FMGL(numElems_2)))))))))))));
    
}

//#line 174 "x10/array/Array_4.x10"
/**
     * Return the element of this array corresponding to the given triple of indices.
     * 
     * @param i the given index in the first dimension
     * @param j the given index in the second dimension
     * @param k the given index in the third dimension
     * @param l the given index in the fourth dimension
     * @return the element of this array corresponding to the given quad of indices.
     * @see #set(T, Long, Long, Long, Long)
     */
template<class TPMGL(T)> TPMGL(T) x10::array::Array_4<TPMGL(T)>::__apply(
  x10_long i, x10_long j, x10_long k, x10_long l) {
    
    //#line 175 "x10/array/Array_4.x10"
    if ((true && ((((((((((i) < (((x10_long)0ll))) || ((i) >= (this->FMGL(numElems_1)))) ||
                  ((j) < (((x10_long)0ll)))) || ((j) >= (this->FMGL(numElems_2)))) ||
                  ((k) < (((x10_long)0ll)))) || ((k) >= (this->FMGL(numElems_3)))) ||
                  ((l) < (((x10_long)0ll)))) || ((l) >= (this->FMGL(numElems_4)))))))
    {
        
        //#line 179 "x10/array/Array_4.x10"
        ::x10::array::Array<void>::raiseBoundsError(i, j,
                                                    k, l);
    }
    
    //#line 181 "x10/array/Array_4.x10"
    return (this->FMGL(raw))->unchecked_apply((__extension__ ({
        ::x10::array::Array_4<TPMGL(T)>* this__96215 = this;
        ((l) + (((::x10aux::nullCheck(this__96215)->FMGL(numElems_4)) * (((k) + (((::x10aux::nullCheck(this__96215)->FMGL(numElems_3)) * (((j) + (((i) * (::x10aux::nullCheck(this__96215)->FMGL(numElems_2)))))))))))));
    }))
    );
    
}

//#line 191 "x10/array/Array_4.x10"
/**
     * Return the element of this array corresponding to the given Point.
     * 
     * @param p the given Point
     * @return the element of this array corresponding to the given Point.
     * @see #set(T, Point)
     */
template<class TPMGL(T)> TPMGL(T) x10::array::Array_4<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::Array_4<TPMGL(T)>* this__96296 = this;
    x10_long i__96297 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__96298 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    x10_long k__96299 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)2ll));
    x10_long l__96300 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)3ll));
    
    //#line 175 "x10/array/Array_4.x10"
    if ((true && ((((((((((i__96297) < (((x10_long)0ll))) ||
                  ((i__96297) >= (::x10aux::nullCheck(this__96296)->FMGL(numElems_1)))) ||
                  ((j__96298) < (((x10_long)0ll)))) || ((j__96298) >= (::x10aux::nullCheck(this__96296)->FMGL(numElems_2)))) ||
                  ((k__96299) < (((x10_long)0ll)))) || ((k__96299) >= (::x10aux::nullCheck(this__96296)->FMGL(numElems_3)))) ||
                  ((l__96300) < (((x10_long)0ll)))) || ((l__96300) >= (::x10aux::nullCheck(this__96296)->FMGL(numElems_4)))))))
    {
        
        //#line 179 "x10/array/Array_4.x10"
        ::x10::array::Array<void>::raiseBoundsError(i__96297,
                                                    j__96298,
                                                    k__96299,
                                                    l__96300);
    }
    
    //#line 191 "x10/array/Array_4.x10"
    return (::x10aux::nullCheck(this__96296)->FMGL(raw))->unchecked_apply(((l__96300) + (((::x10aux::nullCheck(this__96296)->FMGL(numElems_4)) * (((k__96299) + (((::x10aux::nullCheck(this__96296)->FMGL(numElems_3)) * (((j__96298) + (((i__96297) * (::x10aux::nullCheck(this__96296)->FMGL(numElems_2))))))))))))));
    
}

//#line 205 "x10/array/Array_4.x10"
/**
     * Set the element of this array corresponding to the given triple of indices to the given value.
     * Return the new value of the element.
     * 
     * @param v the given value
     * @param i the given index in the first dimension
     * @param j the given index in the second dimension
     * @param k the given index in the third dimension
     * @param l the given index in the fourth dimension
     * @return the new value of the element of this array corresponding to the given quad of indices.
     * @see #operator(Long, Long, Long, Long)
     */
template<class TPMGL(T)> TPMGL(T) x10::array::Array_4<TPMGL(T)>::__set(
  x10_long i, x10_long j, x10_long k, x10_long l, TPMGL(T) v) {
    
    //#line 206 "x10/array/Array_4.x10"
    if ((true && ((((((((((i) < (((x10_long)0ll))) || ((i) >= (this->FMGL(numElems_1)))) ||
                  ((j) < (((x10_long)0ll)))) || ((j) >= (this->FMGL(numElems_2)))) ||
                  ((k) < (((x10_long)0ll)))) || ((k) >= (this->FMGL(numElems_3)))) ||
                  ((l) < (((x10_long)0ll)))) || ((l) >= (this->FMGL(numElems_4)))))))
    {
        
        //#line 210 "x10/array/Array_4.x10"
        ::x10::array::Array<void>::raiseBoundsError(i, j,
                                                    k, l);
    }
    
    //#line 212 "x10/array/Array_4.x10"
    return (this->FMGL(raw))->unchecked_set((__extension__ ({
        ::x10::array::Array_4<TPMGL(T)>* this__96232 = this;
        ((l) + (((::x10aux::nullCheck(this__96232)->FMGL(numElems_4)) * (((k) + (((::x10aux::nullCheck(this__96232)->FMGL(numElems_3)) * (((j) + (((i) * (::x10aux::nullCheck(this__96232)->FMGL(numElems_2)))))))))))));
    }))
    , v);
    
}

//#line 224 "x10/array/Array_4.x10"
/**
     * Set the element of this array corresponding to the given Point to the given value.
     * Return the new value of the element.
     * 
     * @param v the given value
     * @param p the given Point
     * @return the new value of the element of this array corresponding to the given Point.
     * @see #operator(Point)
     */
template<class TPMGL(T)> TPMGL(T) x10::array::Array_4<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::Array_4<TPMGL(T)>* this__96305 = this;
    x10_long i__96306 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__96307 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    x10_long k__96308 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)2ll));
    x10_long l__96309 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)3ll));
    
    //#line 206 "x10/array/Array_4.x10"
    if ((true && ((((((((((i__96306) < (((x10_long)0ll))) ||
                  ((i__96306) >= (::x10aux::nullCheck(this__96305)->FMGL(numElems_1)))) ||
                  ((j__96307) < (((x10_long)0ll)))) || ((j__96307) >= (::x10aux::nullCheck(this__96305)->FMGL(numElems_2)))) ||
                  ((k__96308) < (((x10_long)0ll)))) || ((k__96308) >= (::x10aux::nullCheck(this__96305)->FMGL(numElems_3)))) ||
                  ((l__96309) < (((x10_long)0ll)))) || ((l__96309) >= (::x10aux::nullCheck(this__96305)->FMGL(numElems_4)))))))
    {
        
        //#line 210 "x10/array/Array_4.x10"
        ::x10::array::Array<void>::raiseBoundsError(i__96306,
                                                    j__96307,
                                                    k__96308,
                                                    l__96309);
    }
    
    //#line 224 "x10/array/Array_4.x10"
    return (::x10aux::nullCheck(this__96305)->FMGL(raw))->unchecked_set(((l__96309) + (((::x10aux::nullCheck(this__96305)->FMGL(numElems_4)) * (((k__96308) + (((::x10aux::nullCheck(this__96305)->FMGL(numElems_3)) * (((j__96307) + (((i__96306) * (::x10aux::nullCheck(this__96305)->FMGL(numElems_2))))))))))))), v);
    
}

//#line 227 "x10/array/Array_4.x10"

//#line 21 "x10/array/Array_4.x10"
template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>*
  x10::array::Array_4<TPMGL(T)>::x10__array__Array_4____this__x10__array__Array_4(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::__fieldInitializers_x10_array_Array_4(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::Array_4<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::Array_4<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_serialize_body(buf);
    buf.write(this->FMGL(numElems_1));
    buf.write(this->FMGL(numElems_2));
    buf.write(this->FMGL(numElems_3));
    buf.write(this->FMGL(numElems_4));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::Array_4<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array_4<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::Array_4<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_deserialize_body(buf);
    FMGL(numElems_1) = buf.read<x10_long>();
    FMGL(numElems_2) = buf.read<x10_long>();
    FMGL(numElems_3) = buf.read<x10_long>();
    FMGL(numElems_4) = buf.read<x10_long>();
}

template<class TPMGL(T)> ::x10::array::Array_4<TPMGL(T)>*
  x10::array::Array_4<void>::makeView(::x10::lang::Rail< TPMGL(T) >* r,
                                      x10_long m, x10_long n,
                                      x10_long p, x10_long q) {
    
    //#line 104 "x10/array/Array_4.x10"
    x10_long size = ((((((n) * (m))) * (p))) * (q));
    
    //#line 105 "x10/array/Array_4.x10"
    if ((!::x10aux::struct_equals(size, (x10_long)(::x10aux::nullCheck(r)->FMGL(size)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((&::x10::array::Array_4_Strings::sl__163590), m), (&::x10::array::Array_4_Strings::sl__163591)), n), (&::x10::array::Array_4_Strings::sl__163591)), p), (&::x10::array::Array_4_Strings::sl__163591)), q), (&::x10::array::Array_4_Strings::sl__163592)), (x10_long)(::x10aux::nullCheck(r)->FMGL(size))))));
    }
    
    //#line 106 "x10/array/Array_4.x10"
    ::x10::array::Array_4<TPMGL(T)>* alloc__96272 =  (new (::x10aux::alloc_z< ::x10::array::Array_4<TPMGL(T)> >()) ::x10::array::Array_4<TPMGL(T)>());
    (alloc__96272)->::x10::array::Array_4<TPMGL(T)>::_constructor(
      r, m, n, p, q);
    return alloc__96272;
    
}
#endif // X10_ARRAY_ARRAY_4_H_IMPLEMENTATION
#endif // __X10_ARRAY_ARRAY_4_H_NODEPS
