/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gatts_hvx_params_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gatts_hvx_params_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gatts_hvx_params_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gatts_hvx_params_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHandle(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_handle_set(swigCPtr, this, value);
  }

  public int getHandle() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_handle_get(swigCPtr, this);
  }

  public void setType(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_type_get(swigCPtr, this);
  }

  public void setOffset(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_offset_set(swigCPtr, this, value);
  }

  public int getOffset() {
    return pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_offset_get(swigCPtr, this);
  }

  public void setP_len(SWIGTYPE_p_unsigned_short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_p_len_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getP_len() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_p_len_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setP_data(long value) {
    pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_p_data_set(swigCPtr, this, value);
  }

  public long getP_data() {
        long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gatts_hvx_params_t_p_data_get(swigCPtr, this);
        return cPtr;
    }

  public ble_gatts_hvx_params_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gatts_hvx_params_t(), true);
  }

}
