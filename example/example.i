/* File : example.i */

%module example

%{
#include "example.h"
%}

%typemap(ctype)  void* "void *"
%typemap(imtype) void* "System.IntPtr"
%typemap(cstype) void* "System.IntPtr"
%typemap(csin)   void* "$csinput"
%typemap(in)     void* %{ $1 = $input; %}
%typemap(out)    void* %{ $result = $1; %}
%typemap(csout, excode=SWIGEXCODE)  void* { 
    System.IntPtr cPtr = $imcall;$excode
    return cPtr;
    }
%typemap(csvarout, excode=SWIGEXCODE2) void* %{ 
    get {
        System.IntPtr cPtr = $imcall;$excode 
        return cPtr;
   } 
%}

%apply void* {unsigned char *};

%include "arrays_csharp.i";
%apply unsigned char INPUT[]  { unsigned char[ANY] };
%typemap(csvarout, excode=SWIGEXCODE2) unsigned char[ANY] %{ 
    get {
        byte[] val = $imcall;$excode 
        return val;
   }
%}

%define %cs_callback(TYPE, CSTYPE)
%typemap(ctype) TYPE, TYPE& "void*"
%typemap(in) TYPE  %{ $1 = ($1_type)$input; %}
%typemap(in) TYPE& %{ $1 = ($1_type)&$input; %}
%typemap(imtype, out="IntPtr") TYPE, TYPE& "CSTYPE"
%typemap(cstype, out="IntPtr") TYPE, TYPE& "CSTYPE"
%typemap(csin) TYPE, TYPE& "$csinput"
%enddef

%cs_callback(op_t, OP_CALLBACK);
%cs_callback(string_cb_t, STR_CALLBACK);

%include "example.h"
