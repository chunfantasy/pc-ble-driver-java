/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_evt_hdr_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_evt_hdr_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_evt_hdr_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_evt_hdr_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEvt_id(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_evt_hdr_t_evt_id_set(swigCPtr, this, value);
  }

  public int getEvt_id() {
    return pc_ble_driver_sd_api_v5JNI.ble_evt_hdr_t_evt_id_get(swigCPtr, this);
  }

  public void setEvt_len(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_evt_hdr_t_evt_len_set(swigCPtr, this, value);
  }

  public int getEvt_len() {
    return pc_ble_driver_sd_api_v5JNI.ble_evt_hdr_t_evt_len_get(swigCPtr, this);
  }

  public ble_evt_hdr_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_evt_hdr_t(), true);
  }

}
