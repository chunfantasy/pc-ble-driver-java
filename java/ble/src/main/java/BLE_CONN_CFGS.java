/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class BLE_CONN_CFGS {
  public final static BLE_CONN_CFGS BLE_CONN_CFG_GAP = new BLE_CONN_CFGS("BLE_CONN_CFG_GAP", 0x80);
  public final static BLE_CONN_CFGS BLE_CONN_CFG_GATTC = new BLE_CONN_CFGS("BLE_CONN_CFG_GATTC");
  public final static BLE_CONN_CFGS BLE_CONN_CFG_GATTS = new BLE_CONN_CFGS("BLE_CONN_CFG_GATTS");
  public final static BLE_CONN_CFGS BLE_CONN_CFG_GATT = new BLE_CONN_CFGS("BLE_CONN_CFG_GATT");
  public final static BLE_CONN_CFGS BLE_CONN_CFG_L2CAP = new BLE_CONN_CFGS("BLE_CONN_CFG_L2CAP");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BLE_CONN_CFGS swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BLE_CONN_CFGS.class + " with value " + swigValue);
  }

  private BLE_CONN_CFGS(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BLE_CONN_CFGS(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BLE_CONN_CFGS(String swigName, BLE_CONN_CFGS swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BLE_CONN_CFGS[] swigValues = { BLE_CONN_CFG_GAP, BLE_CONN_CFG_GATTC, BLE_CONN_CFG_GATTS, BLE_CONN_CFG_GATT, BLE_CONN_CFG_L2CAP };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
