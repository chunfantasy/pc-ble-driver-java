/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gatts_char_pf_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gatts_char_pf_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gatts_char_pf_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gatts_char_pf_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFormat(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_format_set(swigCPtr, this, value);
  }

  public short getFormat() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_format_get(swigCPtr, this);
  }

  public void setExponent(byte value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_exponent_set(swigCPtr, this, value);
  }

  public byte getExponent() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_exponent_get(swigCPtr, this);
  }

  public void setUnit(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_unit_set(swigCPtr, this, value);
  }

  public int getUnit() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_unit_get(swigCPtr, this);
  }

  public void setName_space(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_name_space_set(swigCPtr, this, value);
  }

  public short getName_space() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_name_space_get(swigCPtr, this);
  }

  public void setDesc(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_desc_set(swigCPtr, this, value);
  }

  public int getDesc() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_char_pf_t_desc_get(swigCPtr, this);
  }

  public ble_gatts_char_pf_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gatts_char_pf_t(), true);
  }

}