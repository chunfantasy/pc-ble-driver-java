/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class BLE_COMMON_CFGS {
  public final static BLE_COMMON_CFGS BLE_COMMON_CFG_VS_UUID = new BLE_COMMON_CFGS("BLE_COMMON_CFG_VS_UUID", 0x80);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BLE_COMMON_CFGS swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BLE_COMMON_CFGS.class + " with value " + swigValue);
  }

  private BLE_COMMON_CFGS(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BLE_COMMON_CFGS(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BLE_COMMON_CFGS(String swigName, BLE_COMMON_CFGS swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BLE_COMMON_CFGS[] swigValues = { BLE_COMMON_CFG_VS_UUID };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

