/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_enc_info_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_enc_info_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_enc_info_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_enc_info_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLtk(SWIGTYPE_p_unsigned_char value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_ltk_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getLtk() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_ltk_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setLesc(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_lesc_set(swigCPtr, this, value);
  }

  public short getLesc() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_lesc_get(swigCPtr, this);
  }

  public void setAuth(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_auth_set(swigCPtr, this, value);
  }

  public short getAuth() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_auth_get(swigCPtr, this);
  }

  public void setLtk_len(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_ltk_len_set(swigCPtr, this, value);
  }

  public short getLtk_len() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_enc_info_t_ltk_len_get(swigCPtr, this);
  }

  public ble_gap_enc_info_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_enc_info_t(), true);
  }

}
