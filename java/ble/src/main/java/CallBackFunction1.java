@FunctionalInterface
public interface CallBackFunction1<adapter_t, sd_rpc_app_status_t, string> {
    public void apply(adapter_t one, sd_rpc_app_status_t two, string three);
}