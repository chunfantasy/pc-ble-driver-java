/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gattc_evt_rel_disc_rsp_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gattc_evt_rel_disc_rsp_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gattc_evt_rel_disc_rsp_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gattc_evt_rel_disc_rsp_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCount(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_rel_disc_rsp_t_count_set(swigCPtr, this, value);
  }

  public int getCount() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_rel_disc_rsp_t_count_get(swigCPtr, this);
  }

  public void setIncludes(ble_gattc_include_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_rel_disc_rsp_t_includes_set(swigCPtr, this, ble_gattc_include_t.getCPtr(value), value);
  }

  public ble_gattc_include_t getIncludes() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_rel_disc_rsp_t_includes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gattc_include_t(cPtr, false);
  }

  public ble_gattc_evt_rel_disc_rsp_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gattc_evt_rel_disc_rsp_t(), true);
  }

}