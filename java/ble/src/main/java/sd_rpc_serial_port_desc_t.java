/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class sd_rpc_serial_port_desc_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sd_rpc_serial_port_desc_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sd_rpc_serial_port_desc_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pc_ble_driver_sd_api_v5JNI.delete_sd_rpc_serial_port_desc_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPort(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_port_set(swigCPtr, this, value);
  }

  public String getPort() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_port_get(swigCPtr, this);
  }

  public void setManufacturer(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_manufacturer_set(swigCPtr, this, value);
  }

  public String getManufacturer() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_manufacturer_get(swigCPtr, this);
  }

  public void setSerialNumber(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_serialNumber_set(swigCPtr, this, value);
  }

  public String getSerialNumber() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_serialNumber_get(swigCPtr, this);
  }

  public void setPnpId(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_pnpId_set(swigCPtr, this, value);
  }

  public String getPnpId() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_pnpId_get(swigCPtr, this);
  }

  public void setLocationId(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_locationId_set(swigCPtr, this, value);
  }

  public String getLocationId() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_locationId_get(swigCPtr, this);
  }

  public void setVendorId(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_vendorId_set(swigCPtr, this, value);
  }

  public String getVendorId() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_vendorId_get(swigCPtr, this);
  }

  public void setProductId(String value) {
    pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_productId_set(swigCPtr, this, value);
  }

  public String getProductId() {
    return pc_ble_driver_sd_api_v5JNI.sd_rpc_serial_port_desc_t_productId_get(swigCPtr, this);
  }

  public sd_rpc_serial_port_desc_t() {
    this(pc_ble_driver_sd_api_v5JNI.new_sd_rpc_serial_port_desc_t(), true);
  }

}
