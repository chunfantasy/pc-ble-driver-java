@FunctionalInterface
public interface CallBackFunction2<adapter_t, ble_evt_t> {
    void apply(adapter_t one, ble_evt_t two);
}
