/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_cfg_role_count_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_cfg_role_count_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_cfg_role_count_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_cfg_role_count_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPeriph_role_count(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_role_count_t_periph_role_count_set(swigCPtr, this, value);
  }

  public short getPeriph_role_count() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_role_count_t_periph_role_count_get(swigCPtr, this);
  }

  public void setCentral_role_count(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_role_count_t_central_role_count_set(swigCPtr, this, value);
  }

  public short getCentral_role_count() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_role_count_t_central_role_count_get(swigCPtr, this);
  }

  public void setCentral_sec_count(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_role_count_t_central_sec_count_set(swigCPtr, this, value);
  }

  public short getCentral_sec_count() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_role_count_t_central_sec_count_get(swigCPtr, this);
  }

  public ble_gap_cfg_role_count_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_cfg_role_count_t(), true);
  }

}