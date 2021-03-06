/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_cfg_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_cfg_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_cfg_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_cfg_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRole_count_cfg(ble_gap_cfg_role_count_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_t_role_count_cfg_set(swigCPtr, this, ble_gap_cfg_role_count_t.getCPtr(value), value);
  }

  public ble_gap_cfg_role_count_t getRole_count_cfg() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_t_role_count_cfg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_cfg_role_count_t(cPtr, false);
  }

  public void setDevice_name_cfg(ble_gap_cfg_device_name_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_t_device_name_cfg_set(swigCPtr, this, ble_gap_cfg_device_name_t.getCPtr(value), value);
  }

  public ble_gap_cfg_device_name_t getDevice_name_cfg() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_t_device_name_cfg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_cfg_device_name_t(cPtr, false);
  }

  public ble_gap_cfg_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_cfg_t(), true);
  }

}
