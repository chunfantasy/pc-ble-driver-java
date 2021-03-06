/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_evt_phy_update_request_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_evt_phy_update_request_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_evt_phy_update_request_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_evt_phy_update_request_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPeer_preferred_phys(ble_gap_phys_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_evt_phy_update_request_t_peer_preferred_phys_set(swigCPtr, this, ble_gap_phys_t.getCPtr(value), value);
  }

  public ble_gap_phys_t getPeer_preferred_phys() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_evt_phy_update_request_t_peer_preferred_phys_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_phys_t(cPtr, false);
  }

  public ble_gap_evt_phy_update_request_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_evt_phy_update_request_t(), true);
  }

}
