/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_evt_rssi_changed_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_evt_rssi_changed_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_evt_rssi_changed_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_evt_rssi_changed_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRssi(byte value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_evt_rssi_changed_t_rssi_set(swigCPtr, this, value);
  }

  public byte getRssi() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_evt_rssi_changed_t_rssi_get(swigCPtr, this);
  }

  public ble_gap_evt_rssi_changed_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_evt_rssi_changed_t(), true);
  }

}
