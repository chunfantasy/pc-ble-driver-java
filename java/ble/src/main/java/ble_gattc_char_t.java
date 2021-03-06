/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gattc_char_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gattc_char_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gattc_char_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gattc_char_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUuid(ble_uuid_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_uuid_set(swigCPtr, this, ble_uuid_t.getCPtr(value), value);
  }

  public ble_uuid_t getUuid() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_uuid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_uuid_t(cPtr, false);
  }

  public void setChar_props(ble_gatt_char_props_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_char_props_set(swigCPtr, this, ble_gatt_char_props_t.getCPtr(value), value);
  }

  public ble_gatt_char_props_t getChar_props() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_char_props_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gatt_char_props_t(cPtr, false);
  }

  public void setChar_ext_props(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_char_ext_props_set(swigCPtr, this, value);
  }

  public short getChar_ext_props() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_char_ext_props_get(swigCPtr, this);
  }

  public void setHandle_decl(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_handle_decl_set(swigCPtr, this, value);
  }

  public int getHandle_decl() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_handle_decl_get(swigCPtr, this);
  }

  public void setHandle_value(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_handle_value_set(swigCPtr, this, value);
  }

  public int getHandle_value() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_char_t_handle_value_get(swigCPtr, this);
  }

  public ble_gattc_char_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gattc_char_t(), true);
  }

}
