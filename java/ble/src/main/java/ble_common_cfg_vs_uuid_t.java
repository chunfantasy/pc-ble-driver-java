/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_common_cfg_vs_uuid_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_common_cfg_vs_uuid_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_common_cfg_vs_uuid_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_common_cfg_vs_uuid_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVs_uuid_count(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_common_cfg_vs_uuid_t_vs_uuid_count_set(swigCPtr, this, value);
  }

  public short getVs_uuid_count() {
    return pc_ble_driver_sd_api_v5JNI.ble_common_cfg_vs_uuid_t_vs_uuid_count_get(swigCPtr, this);
  }

  public ble_common_cfg_vs_uuid_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_common_cfg_vs_uuid_t(), true);
  }

}
