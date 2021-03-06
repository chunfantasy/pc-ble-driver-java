/*
 * Copyright (c) 2016 Nordic Semiconductor ASA
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *   2. Redistributions in binary form must reproduce the above copyright notice, this
 *   list of conditions and the following disclaimer in the documentation and/or
 *   other materials provided with the distribution.
 *
 *   3. Neither the name of Nordic Semiconductor ASA nor the names of other
 *   contributors to this software may be used to endorse or promote products
 *   derived from this software without specific prior written permission.
 *
 *   4. This software must only be used in or with a processor manufactured by Nordic
 *   Semiconductor ASA, or in or with a processor manufactured by a third party that
 *   is used in combination with a processor manufactured by Nordic Semiconductor.
 *
 *   5. Any software provided in binary or object form under this license must not be
 *   reverse engineered, decompiled, modified and/or disassembled.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

%javaconst(1);

#define BLE_SVC_BASE           0x60
#define BLE_RESERVED_SVC_BASE  0x6C
#define BLE_GAP_SVC_BASE       0x70
#define BLE_GATTC_SVC_BASE     0x90
#define BLE_GATTS_SVC_BASE     0xA0
#define BLE_L2CAP_SVC_BASE     0xB0
#define BLE_EVT_BASE           0x01
#define BLE_GAP_EVT_BASE       0x10
#define BLE_GATTC_EVT_BASE     0x30
#define BLE_GATTS_EVT_BASE     0x50
#define BLE_L2CAP_EVT_BASE     0x70
#define BLE_OPT_BASE           0x01
#define BLE_GAP_OPT_BASE       0x20
#define BLE_GATTC_OPT_BASE     0x40
#define BLE_GATTS_OPT_BASE     0x60
#define BLE_L2CAP_OPT_BASE     0x80
#define BLE_GAP_CFG_BASE       0x80
#define BLE_GATT_CFG_BASE      0x80
#define BLE_GATTS_CFG_BASE     0x80
#define BLE_CFG_BASE           0x80
#define BLE_CONN_CFG_BASE      0x80

%module(directors="1") pc_ble_driver_sd_api_v5

%include "stdint.i"
%include "carrays.i"
%include "cpointer.i"

// Includes used in this transformation
%{
#include "sd_rpc.h"
#include "stdio.h"
%}

// Define reusable collection of typemaps for IntPtr types
%define %java_intptr(TYPE, JAVATYPE)
    %typemap(jni)  TYPE "void *"
    %typemap(jtype) TYPE "long"
    %typemap(jstype) TYPE "long"
    %typemap(javain)   TYPE "$javainput"
    %typemap(in)     TYPE %{ $1 = ($1_ltype)$input; %}
    %typemap(in)     TYPE& %{ $1 = ($1_ltype)&$input; %}
    %typemap(out)    TYPE %{ $result = $1; %}
    %typemap(javaout)  TYPE {
        long cPtr = $jnicall;
        return cPtr;
    }
    %typemap(javavarout) TYPE %{
        get {
            long cPtr = $jnicall;
            return cPtr;
       }
    %}
%enddef

%java_intptr(void *, long);
%java_intptr(unsigned char *, long);

// // Use apply on unsigned char[] since it was not possible to call with cs_intptr
// %apply unsigned char* {unsigned char[ANY]};
//
// /*%include "arrays_csharp.i";
// %apply unsigned char INPUT[]  { unsigned char[ANY] };
// %typemap(csvarout, excode=SWIGEXCODE2) unsigned char[ANY] %{
//     get {
//         byte[] val = $imcall;$excode
//         return val;
//    }
// %}
// */

//Typemaps for use with callback types so it's compatible with csharp delegates
%define %cs_callback(TYPE, CSTYPE)
    %typemap(jni) TYPE, TYPE& "void *"
    %typemap(in) TYPE  %{ $1 = ($1_type)$input; %}
    %typemap(in) TYPE& %{ $1 = ($1_type)&$input; %}
    %typemap(jtype, out="long'") TYPE, TYPE& "CSTYPE"
    %typemap(jstype, out="long") TYPE, TYPE& "CSTYPE"
    %typemap(javain) TYPE, TYPE& "$javainput"
%enddef

%cs_callback(sd_rpc_status_handler_t, CallBackFunction1)
%cs_callback(sd_rpc_evt_handler_t, CallBackFunction2)
%cs_callback(sd_rpc_log_handler_t, CallBackFunction3)

// %ignore sd_rpc_open;
// extern void(*sd_rpc_status_handler_t)(adapter_t *adapter, sd_rpc_app_status_t code, const char * message);
// %constant(void (*)(sd_rpc_status_handler_t)) StatusHandler = sd_rpc_status_handler_t;

// Ignore L2CAP APIs that will be replaced by L2CAP CoCs
%ignore sd_ble_l2cap_cid_register;
%ignore sd_ble_l2cap_cid_unregister;
%ignore sd_ble_l2cap_tx;
%ignore sd_ble_l2cap_ch_flow_control;
%ignore sd_ble_l2cap_ch_release;
%ignore sd_ble_l2cap_ch_rx;
%ignore sd_ble_l2cap_ch_setup;
%ignore sd_ble_l2cap_ch_tx;

// Ignore event getter, handled by the connectivity device
%ignore sd_ble_evt_get;


// Grab the definitions
%include "config/platform.h"
%define SVCALL(number, return_type, signature) return_type signature
%enddef
%include "adapter.h"
%include "ble.h"
%include "ble_err.h"
%include "ble_gap.h"
%include "ble_gatt.h"
%include "ble_gatts.h"
%include "ble_gattc.h"
%include "ble_hci.h"
%include "ble_l2cap.h"
//%include "ble_ranges.h"
%include "ble_types.h"
%include "nrf_error.h"
%include "sd_rpc.h"
%include "sd_rpc_types.h"
