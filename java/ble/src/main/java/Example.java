import org.omg.CORBA.portable.Delegate;

/**
 * Created by chun on 10/9/17.
 */
public class Example {
    static {
        try {
            System.out.println("Loading library");
            System.loadLibrary("pc_ble_driver_sd_api_v5");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load. See the chapter on Dynamic Linking Problems in the SWIG Java documentation for help.\n" + e);
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        System.out.println("lalal");
        physical_layer_t phy = pc_ble_driver_sd_api_v5.sd_rpc_physical_layer_create_uart("/dev/cu.usbmodem1411", 115200, sd_rpc_flow_control_t.SD_RPC_FLOW_CONTROL_NONE, sd_rpc_parity_t.SD_RPC_PARITY_NONE);
        data_link_layer_t data_link_layer = pc_ble_driver_sd_api_v5.sd_rpc_data_link_layer_create_bt_three_wire(phy, 100);
        transport_layer_t transport_layer = pc_ble_driver_sd_api_v5.sd_rpc_transport_layer_create(data_link_layer, 100);
        adapter_t m_adapter = pc_ble_driver_sd_api_v5.sd_rpc_adapter_create(transport_layer);
        System.out.println(m_adapter);
        CallBackFunction1<adapter_t, sd_rpc_app_status_t, String> onStatusCallback = (a, b, c) -> System.out.println("function1");
        CallBackFunction2<adapter_t, ble_evt_t> onEventCallback = (adapter, evt) -> System.out.println("function2");

        CallBackFunction3<adapter_t, sd_rpc_log_severity_t, String> onLogCallback = (adapter, severity, message) -> System.out.println("function3");
        long errorCode = pc_ble_driver_sd_api_v5.sd_rpc_log_handler_severity_filter_set(m_adapter, sd_rpc_log_severity_t.SD_RPC_LOG_INFO);
        System.out.println(errorCode);
        errorCode = pc_ble_driver_sd_api_v5.sd_rpc_open(m_adapter, onStatusCallback, onEventCallback, onLogCallback);
//        System.out.println(errorCode);

        while(true){

        }
    }


}
