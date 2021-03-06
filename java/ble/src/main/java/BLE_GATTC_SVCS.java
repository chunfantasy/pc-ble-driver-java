/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class BLE_GATTC_SVCS {
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_PRIMARY_SERVICES_DISCOVER = new BLE_GATTC_SVCS("SD_BLE_GATTC_PRIMARY_SERVICES_DISCOVER", 0x90);
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_RELATIONSHIPS_DISCOVER = new BLE_GATTC_SVCS("SD_BLE_GATTC_RELATIONSHIPS_DISCOVER");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_CHARACTERISTICS_DISCOVER = new BLE_GATTC_SVCS("SD_BLE_GATTC_CHARACTERISTICS_DISCOVER");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_DESCRIPTORS_DISCOVER = new BLE_GATTC_SVCS("SD_BLE_GATTC_DESCRIPTORS_DISCOVER");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_ATTR_INFO_DISCOVER = new BLE_GATTC_SVCS("SD_BLE_GATTC_ATTR_INFO_DISCOVER");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_CHAR_VALUE_BY_UUID_READ = new BLE_GATTC_SVCS("SD_BLE_GATTC_CHAR_VALUE_BY_UUID_READ");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_READ = new BLE_GATTC_SVCS("SD_BLE_GATTC_READ");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_CHAR_VALUES_READ = new BLE_GATTC_SVCS("SD_BLE_GATTC_CHAR_VALUES_READ");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_WRITE = new BLE_GATTC_SVCS("SD_BLE_GATTC_WRITE");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_HV_CONFIRM = new BLE_GATTC_SVCS("SD_BLE_GATTC_HV_CONFIRM");
  public final static BLE_GATTC_SVCS SD_BLE_GATTC_EXCHANGE_MTU_REQUEST = new BLE_GATTC_SVCS("SD_BLE_GATTC_EXCHANGE_MTU_REQUEST");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BLE_GATTC_SVCS swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BLE_GATTC_SVCS.class + " with value " + swigValue);
  }

  private BLE_GATTC_SVCS(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BLE_GATTC_SVCS(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BLE_GATTC_SVCS(String swigName, BLE_GATTC_SVCS swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BLE_GATTC_SVCS[] swigValues = { SD_BLE_GATTC_PRIMARY_SERVICES_DISCOVER, SD_BLE_GATTC_RELATIONSHIPS_DISCOVER, SD_BLE_GATTC_CHARACTERISTICS_DISCOVER, SD_BLE_GATTC_DESCRIPTORS_DISCOVER, SD_BLE_GATTC_ATTR_INFO_DISCOVER, SD_BLE_GATTC_CHAR_VALUE_BY_UUID_READ, SD_BLE_GATTC_READ, SD_BLE_GATTC_CHAR_VALUES_READ, SD_BLE_GATTC_WRITE, SD_BLE_GATTC_HV_CONFIRM, SD_BLE_GATTC_EXCHANGE_MTU_REQUEST };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

