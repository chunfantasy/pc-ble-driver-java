@FunctionalInterface
public interface CallBackFunction3<adapter_t, sd_rpc_log_severity_t, string> {
    void apply(adapter_t one, sd_rpc_log_severity_t two, string three);
}
