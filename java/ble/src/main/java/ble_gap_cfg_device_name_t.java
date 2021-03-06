/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_gap_cfg_device_name_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_gap_cfg_device_name_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_gap_cfg_device_name_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_gap_cfg_device_name_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWrite_perm(ble_gap_conn_sec_mode_t value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_write_perm_set(swigCPtr, this, ble_gap_conn_sec_mode_t.getCPtr(value), value);
  }

  public ble_gap_conn_sec_mode_t getWrite_perm() {
    long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_write_perm_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ble_gap_conn_sec_mode_t(cPtr, false);
  }

  public void setVloc(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_vloc_set(swigCPtr, this, value);
  }

  public short getVloc() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_vloc_get(swigCPtr, this);
  }

  public void setP_value(long value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_p_value_set(swigCPtr, this, value);
  }

  public long getP_value() {
        long cPtr = pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_p_value_get(swigCPtr, this);
        return cPtr;
    }

  public void setCurrent_len(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_current_len_set(swigCPtr, this, value);
  }

  public int getCurrent_len() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_current_len_get(swigCPtr, this);
  }

  public void setMax_len(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_max_len_set(swigCPtr, this, value);
  }

  public int getMax_len() {
    return pc_ble_driver_sd_api_v5JNI.ble_gap_cfg_device_name_t_max_len_get(swigCPtr, this);
  }

  public ble_gap_cfg_device_name_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_gap_cfg_device_name_t(), true);
  }

}
