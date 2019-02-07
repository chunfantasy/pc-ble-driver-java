/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class BLE_L2CAP_EVTS {
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_SETUP_REQUEST = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_SETUP_REQUEST", 0x70);
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_SETUP_REFUSED = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_SETUP_REFUSED");
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_SETUP = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_SETUP");
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_RELEASED = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_RELEASED");
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_SDU_BUF_RELEASED = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_SDU_BUF_RELEASED");
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_CREDIT = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_CREDIT");
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_RX = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_RX");
  public final static BLE_L2CAP_EVTS BLE_L2CAP_EVT_CH_TX = new BLE_L2CAP_EVTS("BLE_L2CAP_EVT_CH_TX");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BLE_L2CAP_EVTS swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BLE_L2CAP_EVTS.class + " with value " + swigValue);
  }

  private BLE_L2CAP_EVTS(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BLE_L2CAP_EVTS(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BLE_L2CAP_EVTS(String swigName, BLE_L2CAP_EVTS swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BLE_L2CAP_EVTS[] swigValues = { BLE_L2CAP_EVT_CH_SETUP_REQUEST, BLE_L2CAP_EVT_CH_SETUP_REFUSED, BLE_L2CAP_EVT_CH_SETUP, BLE_L2CAP_EVT_CH_RELEASED, BLE_L2CAP_EVT_CH_SDU_BUF_RELEASED, BLE_L2CAP_EVT_CH_CREDIT, BLE_L2CAP_EVT_CH_RX, BLE_L2CAP_EVT_CH_TX };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

