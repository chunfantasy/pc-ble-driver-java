/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_sec_params_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_sec_params_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_sec_params_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_sec_params_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBond(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_bond_set(swigCPtr, this, value);
  }

  public short getBond() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_bond_get(swigCPtr, this);
  }

  public void setMitm(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_mitm_set(swigCPtr, this, value);
  }

  public short getMitm() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_mitm_get(swigCPtr, this);
  }

  public void setLesc(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_lesc_set(swigCPtr, this, value);
  }

  public short getLesc() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_lesc_get(swigCPtr, this);
  }

  public void setKeypress(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_keypress_set(swigCPtr, this, value);
  }

  public short getKeypress() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_keypress_get(swigCPtr, this);
  }

  public void setIo_caps(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_io_caps_set(swigCPtr, this, value);
  }

  public short getIo_caps() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_io_caps_get(swigCPtr, this);
  }

  public void setOob(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_oob_set(swigCPtr, this, value);
  }

  public short getOob() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_oob_get(swigCPtr, this);
  }

  public void setMin_key_size(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_min_key_size_set(swigCPtr, this, value);
  }

  public short getMin_key_size() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_min_key_size_get(swigCPtr, this);
  }

  public void setMax_key_size(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_max_key_size_set(swigCPtr, this, value);
  }

  public short getMax_key_size() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_max_key_size_get(swigCPtr, this);
  }

  public void setKdist_own(ble_gap_sec_kdist_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_kdist_own_set(swigCPtr, this, ble_gap_sec_kdist_t.getCPtr(value), value);
  }

  public ble_gap_sec_kdist_t getKdist_own() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_kdist_own_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_sec_kdist_t(cPtr, false);
  }

  public void setKdist_peer(ble_gap_sec_kdist_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_kdist_peer_set(swigCPtr, this, ble_gap_sec_kdist_t.getCPtr(value), value);
  }

  public ble_gap_sec_kdist_t getKdist_peer() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_sec_params_t_kdist_peer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_sec_kdist_t(cPtr, false);
  }

  public ble_gap_sec_params_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_sec_params_t(), true);
  }

}
