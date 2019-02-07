/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class sd_rpc_log_severity_t {
  public final static sd_rpc_log_severity_t SD_RPC_LOG_TRACE = new sd_rpc_log_severity_t("SD_RPC_LOG_TRACE");
  public final static sd_rpc_log_severity_t SD_RPC_LOG_DEBUG = new sd_rpc_log_severity_t("SD_RPC_LOG_DEBUG");
  public final static sd_rpc_log_severity_t SD_RPC_LOG_INFO = new sd_rpc_log_severity_t("SD_RPC_LOG_INFO");
  public final static sd_rpc_log_severity_t SD_RPC_LOG_WARNING = new sd_rpc_log_severity_t("SD_RPC_LOG_WARNING");
  public final static sd_rpc_log_severity_t SD_RPC_LOG_ERROR = new sd_rpc_log_severity_t("SD_RPC_LOG_ERROR");
  public final static sd_rpc_log_severity_t SD_RPC_LOG_FATAL = new sd_rpc_log_severity_t("SD_RPC_LOG_FATAL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static sd_rpc_log_severity_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + sd_rpc_log_severity_t.class + " with value " + swigValue);
  }

  private sd_rpc_log_severity_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private sd_rpc_log_severity_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private sd_rpc_log_severity_t(String swigName, sd_rpc_log_severity_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static sd_rpc_log_severity_t[] swigValues = { SD_RPC_LOG_TRACE, SD_RPC_LOG_DEBUG, SD_RPC_LOG_INFO, SD_RPC_LOG_WARNING, SD_RPC_LOG_ERROR, SD_RPC_LOG_FATAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
