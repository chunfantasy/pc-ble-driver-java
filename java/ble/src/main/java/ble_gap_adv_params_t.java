/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_adv_params_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_adv_params_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_adv_params_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_adv_params_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_type_get(swigCPtr, this);
  }

  public void setP_peer_addr(ble_gap_addr_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_p_peer_addr_set(swigCPtr, this, ble_gap_addr_t.getCPtr(value), value);
  }

  public ble_gap_addr_t getP_peer_addr() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_p_peer_addr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_addr_t(cPtr, false);
  }

  public void setFp(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_fp_set(swigCPtr, this, value);
  }

  public short getFp() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_fp_get(swigCPtr, this);
  }

  public void setInterval(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_interval_set(swigCPtr, this, value);
  }

  public int getInterval() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_interval_get(swigCPtr, this);
  }

  public void setTimeout(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_timeout_set(swigCPtr, this, value);
  }

  public int getTimeout() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_timeout_get(swigCPtr, this);
  }

  public void setChannel_mask(ble_gap_adv_ch_mask_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_channel_mask_set(swigCPtr, this, ble_gap_adv_ch_mask_t.getCPtr(value), value);
  }

  public ble_gap_adv_ch_mask_t getChannel_mask() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_adv_params_t_channel_mask_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_adv_ch_mask_t(cPtr, false);
  }

  public ble_gap_adv_params_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_adv_params_t(), true);
  }

}