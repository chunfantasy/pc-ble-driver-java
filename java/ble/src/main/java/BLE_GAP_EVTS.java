/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class BLE_GAP_EVTS {
  public final static BLE_GAP_EVTS BLE_GAP_EVT_CONNECTED = new BLE_GAP_EVTS("BLE_GAP_EVT_CONNECTED", 0x10);
  public final static BLE_GAP_EVTS BLE_GAP_EVT_DISCONNECTED = new BLE_GAP_EVTS("BLE_GAP_EVT_DISCONNECTED");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_CONN_PARAM_UPDATE = new BLE_GAP_EVTS("BLE_GAP_EVT_CONN_PARAM_UPDATE");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_SEC_PARAMS_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_SEC_PARAMS_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_SEC_INFO_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_SEC_INFO_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_PASSKEY_DISPLAY = new BLE_GAP_EVTS("BLE_GAP_EVT_PASSKEY_DISPLAY");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_KEY_PRESSED = new BLE_GAP_EVTS("BLE_GAP_EVT_KEY_PRESSED");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_AUTH_KEY_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_AUTH_KEY_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_LESC_DHKEY_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_LESC_DHKEY_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_AUTH_STATUS = new BLE_GAP_EVTS("BLE_GAP_EVT_AUTH_STATUS");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_CONN_SEC_UPDATE = new BLE_GAP_EVTS("BLE_GAP_EVT_CONN_SEC_UPDATE");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_TIMEOUT = new BLE_GAP_EVTS("BLE_GAP_EVT_TIMEOUT");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_RSSI_CHANGED = new BLE_GAP_EVTS("BLE_GAP_EVT_RSSI_CHANGED");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_ADV_REPORT = new BLE_GAP_EVTS("BLE_GAP_EVT_ADV_REPORT");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_SEC_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_SEC_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_CONN_PARAM_UPDATE_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_CONN_PARAM_UPDATE_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_SCAN_REQ_REPORT = new BLE_GAP_EVTS("BLE_GAP_EVT_SCAN_REQ_REPORT");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_PHY_UPDATE_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_PHY_UPDATE_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_PHY_UPDATE = new BLE_GAP_EVTS("BLE_GAP_EVT_PHY_UPDATE");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_DATA_LENGTH_UPDATE_REQUEST = new BLE_GAP_EVTS("BLE_GAP_EVT_DATA_LENGTH_UPDATE_REQUEST");
  public final static BLE_GAP_EVTS BLE_GAP_EVT_DATA_LENGTH_UPDATE = new BLE_GAP_EVTS("BLE_GAP_EVT_DATA_LENGTH_UPDATE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BLE_GAP_EVTS swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BLE_GAP_EVTS.class + " with value " + swigValue);
  }

  private BLE_GAP_EVTS(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BLE_GAP_EVTS(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BLE_GAP_EVTS(String swigName, BLE_GAP_EVTS swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BLE_GAP_EVTS[] swigValues = { BLE_GAP_EVT_CONNECTED, BLE_GAP_EVT_DISCONNECTED, BLE_GAP_EVT_CONN_PARAM_UPDATE, BLE_GAP_EVT_SEC_PARAMS_REQUEST, BLE_GAP_EVT_SEC_INFO_REQUEST, BLE_GAP_EVT_PASSKEY_DISPLAY, BLE_GAP_EVT_KEY_PRESSED, BLE_GAP_EVT_AUTH_KEY_REQUEST, BLE_GAP_EVT_LESC_DHKEY_REQUEST, BLE_GAP_EVT_AUTH_STATUS, BLE_GAP_EVT_CONN_SEC_UPDATE, BLE_GAP_EVT_TIMEOUT, BLE_GAP_EVT_RSSI_CHANGED, BLE_GAP_EVT_ADV_REPORT, BLE_GAP_EVT_SEC_REQUEST, BLE_GAP_EVT_CONN_PARAM_UPDATE_REQUEST, BLE_GAP_EVT_SCAN_REQ_REPORT, BLE_GAP_EVT_PHY_UPDATE_REQUEST, BLE_GAP_EVT_PHY_UPDATE, BLE_GAP_EVT_DATA_LENGTH_UPDATE_REQUEST, BLE_GAP_EVT_DATA_LENGTH_UPDATE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

