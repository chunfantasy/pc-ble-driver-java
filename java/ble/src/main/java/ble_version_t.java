/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ble_version_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ble_version_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ble_version_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_ble_version_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion_number(short value) {
    pc_ble_driver_sd_api_v5JNI.ble_version_t_version_number_set(swigCPtr, this, value);
  }

  public short getVersion_number() {
    return pc_ble_driver_sd_api_v5JNI.ble_version_t_version_number_get(swigCPtr, this);
  }

  public void setCompany_id(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_version_t_company_id_set(swigCPtr, this, value);
  }

  public int getCompany_id() {
    return pc_ble_driver_sd_api_v5JNI.ble_version_t_company_id_get(swigCPtr, this);
  }

  public void setSubversion_number(int value) {
    pc_ble_driver_sd_api_v5JNI.ble_version_t_subversion_number_set(swigCPtr, this, value);
  }

  public int getSubversion_number() {
    return pc_ble_driver_sd_api_v5JNI.ble_version_t_subversion_number_get(swigCPtr, this);
  }

  public ble_version_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_ble_version_t(), true);
  }

}
