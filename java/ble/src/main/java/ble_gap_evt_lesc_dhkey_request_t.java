/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_evt_lesc_dhkey_request_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_evt_lesc_dhkey_request_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_evt_lesc_dhkey_request_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_evt_lesc_dhkey_request_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setP_pk_peer(ble_gap_lesc_p256_pk_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_evt_lesc_dhkey_request_t_p_pk_peer_set(swigCPtr, this, ble_gap_lesc_p256_pk_t.getCPtr(value), value);
  }

  public ble_gap_lesc_p256_pk_t getP_pk_peer() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_evt_lesc_dhkey_request_t_p_pk_peer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_lesc_p256_pk_t(cPtr, false);
  }

  public void setOobd_req(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_evt_lesc_dhkey_request_t_oobd_req_set(swigCPtr, this, value);
  }

  public short getOobd_req() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_evt_lesc_dhkey_request_t_oobd_req_get(swigCPtr, this);
  }

  public ble_gap_evt_lesc_dhkey_request_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_evt_lesc_dhkey_request_t(), true);
  }

}
