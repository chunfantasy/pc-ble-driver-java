/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gattc_evt_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gattc_evt_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gattc_evt_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gattc_evt_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setConn_handle(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_t_conn_handle_set(swigCPtr, this, value);
  }

  public int getConn_handle() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_t_conn_handle_get(swigCPtr, this);
  }

  public void setGatt_status(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_t_gatt_status_set(swigCPtr, this, value);
  }

  public int getGatt_status() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_t_gatt_status_get(swigCPtr, this);
  }

  public void setError_handle(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_t_error_handle_set(swigCPtr, this, value);
  }

  public int getError_handle() {
    return pc_ble_driver_sd_api_v5JNI.ble_gattc_evt_t_error_handle_get(swigCPtr, this);
  }

  public ble_gattc_evt_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gattc_evt_t(), true);
  }

}
