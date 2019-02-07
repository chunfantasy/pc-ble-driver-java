/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public interface pc_ble_driver_sd_api_v5Constants {
  public final static int BLE_SVC_BASE = 0x60;
  public final static int BLE_RESERVED_SVC_BASE = 0x6C;
  public final static int BLE_GAP_SVC_BASE = 0x70;
  public final static int BLE_GATTC_SVC_BASE = 0x90;
  public final static int BLE_GATTS_SVC_BASE = 0xA0;
  public final static int BLE_L2CAP_SVC_BASE = 0xB0;
  public final static int BLE_EVT_BASE = 0x01;
  public final static int BLE_GAP_EVT_BASE = 0x10;
  public final static int BLE_GATTC_EVT_BASE = 0x30;
  public final static int BLE_GATTS_EVT_BASE = 0x50;
  public final static int BLE_L2CAP_EVT_BASE = 0x70;
  public final static int BLE_OPT_BASE = 0x01;
  public final static int BLE_GAP_OPT_BASE = 0x20;
  public final static int BLE_GATTC_OPT_BASE = 0x40;
  public final static int BLE_GATTS_OPT_BASE = 0x60;
  public final static int BLE_L2CAP_OPT_BASE = 0x80;
  public final static int BLE_GAP_CFG_BASE = 0x80;
  public final static int BLE_GATT_CFG_BASE = 0x80;
  public final static int BLE_GATTS_CFG_BASE = 0x80;
  public final static int BLE_CFG_BASE = 0x80;
  public final static int BLE_CONN_CFG_BASE = 0x80;
  public final static int BLE_EVT_PTR_ALIGNMENT = 4;
  public final static int BLE_USER_MEM_TYPE_INVALID = 0x00;
  public final static int BLE_USER_MEM_TYPE_GATTS_QUEUED_WRITES = 0x01;
  public final static int BLE_UUID_VS_COUNT_DEFAULT = 10;
  public final static int BLE_UUID_VS_COUNT_MAX = 254;
  public final static int BLE_CONN_CFG_TAG_DEFAULT = 0;
  public final static int BLE_GAP_ROLE_INVALID = 0x0;
  public final static int BLE_GAP_ROLE_PERIPH = 0x1;
  public final static int BLE_GAP_ROLE_CENTRAL = 0x2;
  public final static int BLE_GAP_TIMEOUT_SRC_ADVERTISING = 0x00;
  public final static int BLE_GAP_TIMEOUT_SRC_SCAN = 0x01;
  public final static int BLE_GAP_TIMEOUT_SRC_CONN = 0x02;
  public final static int BLE_GAP_TIMEOUT_SRC_AUTH_PAYLOAD = 0x03;
  public final static int BLE_GAP_ADDR_TYPE_PUBLIC = 0x00;
  public final static int BLE_GAP_ADDR_TYPE_RANDOM_STATIC = 0x01;
  public final static int BLE_GAP_ADDR_TYPE_RANDOM_PRIVATE_RESOLVABLE = 0x02;
  public final static int BLE_GAP_ADDR_TYPE_RANDOM_PRIVATE_NON_RESOLVABLE = 0x03;
  public final static int BLE_GAP_DEFAULT_PRIVATE_ADDR_CYCLE_INTERVAL_S = (900);
  public final static int BLE_GAP_MAX_PRIVATE_ADDR_CYCLE_INTERVAL_S = (41400);
  public final static int BLE_GAP_ADDR_LEN = (6);
  public final static int BLE_GAP_PRIVACY_MODE_OFF = 0x00;
  public final static int BLE_GAP_PRIVACY_MODE_DEVICE_PRIVACY = 0x01;
  public final static int BLE_GAP_PRIVACY_MODE_NETWORK_PRIVACY = 0x02;
  public final static int BLE_GAP_AD_TYPE_FLAGS = 0x01;
  public final static int BLE_GAP_AD_TYPE_16BIT_SERVICE_UUID_MORE_AVAILABLE = 0x02;
  public final static int BLE_GAP_AD_TYPE_16BIT_SERVICE_UUID_COMPLETE = 0x03;
  public final static int BLE_GAP_AD_TYPE_32BIT_SERVICE_UUID_MORE_AVAILABLE = 0x04;
  public final static int BLE_GAP_AD_TYPE_32BIT_SERVICE_UUID_COMPLETE = 0x05;
  public final static int BLE_GAP_AD_TYPE_128BIT_SERVICE_UUID_MORE_AVAILABLE = 0x06;
  public final static int BLE_GAP_AD_TYPE_128BIT_SERVICE_UUID_COMPLETE = 0x07;
  public final static int BLE_GAP_AD_TYPE_SHORT_LOCAL_NAME = 0x08;
  public final static int BLE_GAP_AD_TYPE_COMPLETE_LOCAL_NAME = 0x09;
  public final static int BLE_GAP_AD_TYPE_TX_POWER_LEVEL = 0x0A;
  public final static int BLE_GAP_AD_TYPE_CLASS_OF_DEVICE = 0x0D;
  public final static int BLE_GAP_AD_TYPE_SIMPLE_PAIRING_HASH_C = 0x0E;
  public final static int BLE_GAP_AD_TYPE_SIMPLE_PAIRING_RANDOMIZER_R = 0x0F;
  public final static int BLE_GAP_AD_TYPE_SECURITY_MANAGER_TK_VALUE = 0x10;
  public final static int BLE_GAP_AD_TYPE_SECURITY_MANAGER_OOB_FLAGS = 0x11;
  public final static int BLE_GAP_AD_TYPE_SLAVE_CONNECTION_INTERVAL_RANGE = 0x12;
  public final static int BLE_GAP_AD_TYPE_SOLICITED_SERVICE_UUIDS_16BIT = 0x14;
  public final static int BLE_GAP_AD_TYPE_SOLICITED_SERVICE_UUIDS_128BIT = 0x15;
  public final static int BLE_GAP_AD_TYPE_SERVICE_DATA = 0x16;
  public final static int BLE_GAP_AD_TYPE_PUBLIC_TARGET_ADDRESS = 0x17;
  public final static int BLE_GAP_AD_TYPE_RANDOM_TARGET_ADDRESS = 0x18;
  public final static int BLE_GAP_AD_TYPE_APPEARANCE = 0x19;
  public final static int BLE_GAP_AD_TYPE_ADVERTISING_INTERVAL = 0x1A;
  public final static int BLE_GAP_AD_TYPE_LE_BLUETOOTH_DEVICE_ADDRESS = 0x1B;
  public final static int BLE_GAP_AD_TYPE_LE_ROLE = 0x1C;
  public final static int BLE_GAP_AD_TYPE_SIMPLE_PAIRING_HASH_C256 = 0x1D;
  public final static int BLE_GAP_AD_TYPE_SIMPLE_PAIRING_RANDOMIZER_R256 = 0x1E;
  public final static int BLE_GAP_AD_TYPE_SERVICE_DATA_32BIT_UUID = 0x20;
  public final static int BLE_GAP_AD_TYPE_SERVICE_DATA_128BIT_UUID = 0x21;
  public final static int BLE_GAP_AD_TYPE_LESC_CONFIRMATION_VALUE = 0x22;
  public final static int BLE_GAP_AD_TYPE_LESC_RANDOM_VALUE = 0x23;
  public final static int BLE_GAP_AD_TYPE_URI = 0x24;
  public final static int BLE_GAP_AD_TYPE_3D_INFORMATION_DATA = 0x3D;
  public final static int BLE_GAP_AD_TYPE_MANUFACTURER_SPECIFIC_DATA = 0xFF;
  public final static int BLE_GAP_ADV_FLAG_LE_LIMITED_DISC_MODE = (0x01);
  public final static int BLE_GAP_ADV_FLAG_LE_GENERAL_DISC_MODE = (0x02);
  public final static int BLE_GAP_ADV_FLAG_BR_EDR_NOT_SUPPORTED = (0x04);
  public final static int BLE_GAP_ADV_FLAG_LE_BR_EDR_CONTROLLER = (0x08);
  public final static int BLE_GAP_ADV_FLAG_LE_BR_EDR_HOST = (0x10);
  public final static int BLE_GAP_ADV_FLAGS_LE_ONLY_LIMITED_DISC_MODE = ((0x01)|(0x04));
  public final static int BLE_GAP_ADV_FLAGS_LE_ONLY_GENERAL_DISC_MODE = ((0x02)|(0x04));
  public final static int BLE_GAP_ADV_INTERVAL_MIN = 0x0020;
  public final static int BLE_GAP_ADV_INTERVAL_MAX = 0x4000;
  public final static int BLE_GAP_SCAN_INTERVAL_MIN = 0x0004;
  public final static int BLE_GAP_SCAN_INTERVAL_MAX = 0x4000;
  public final static int BLE_GAP_SCAN_WINDOW_MIN = 0x0004;
  public final static int BLE_GAP_SCAN_WINDOW_MAX = 0x4000;
  public final static int BLE_GAP_SCAN_TIMEOUT_MIN = 0x0001;
  public final static int BLE_GAP_SCAN_TIMEOUT_MAX = 0xFFFF;
  public final static int BLE_GAP_ADV_MAX_SIZE = (31);
  public final static int BLE_GAP_ADV_TYPE_ADV_IND = 0x00;
  public final static int BLE_GAP_ADV_TYPE_ADV_DIRECT_IND = 0x01;
  public final static int BLE_GAP_ADV_TYPE_ADV_SCAN_IND = 0x02;
  public final static int BLE_GAP_ADV_TYPE_ADV_NONCONN_IND = 0x03;
  public final static int BLE_GAP_ADV_FP_ANY = 0x00;
  public final static int BLE_GAP_ADV_FP_FILTER_SCANREQ = 0x01;
  public final static int BLE_GAP_ADV_FP_FILTER_CONNREQ = 0x02;
  public final static int BLE_GAP_ADV_FP_FILTER_BOTH = 0x03;
  public final static int BLE_GAP_ADV_TIMEOUT_LIMITED_MAX = (180);
  public final static int BLE_GAP_ADV_TIMEOUT_GENERAL_UNLIMITED = (0);
  public final static int BLE_GAP_DISC_MODE_NOT_DISCOVERABLE = 0x00;
  public final static int BLE_GAP_DISC_MODE_LIMITED = 0x01;
  public final static int BLE_GAP_DISC_MODE_GENERAL = 0x02;
  public final static int BLE_GAP_IO_CAPS_DISPLAY_ONLY = 0x00;
  public final static int BLE_GAP_IO_CAPS_DISPLAY_YESNO = 0x01;
  public final static int BLE_GAP_IO_CAPS_KEYBOARD_ONLY = 0x02;
  public final static int BLE_GAP_IO_CAPS_NONE = 0x03;
  public final static int BLE_GAP_IO_CAPS_KEYBOARD_DISPLAY = 0x04;
  public final static int BLE_GAP_AUTH_KEY_TYPE_NONE = 0x00;
  public final static int BLE_GAP_AUTH_KEY_TYPE_PASSKEY = 0x01;
  public final static int BLE_GAP_AUTH_KEY_TYPE_OOB = 0x02;
  public final static int BLE_GAP_KP_NOT_TYPE_PASSKEY_START = 0x00;
  public final static int BLE_GAP_KP_NOT_TYPE_PASSKEY_DIGIT_IN = 0x01;
  public final static int BLE_GAP_KP_NOT_TYPE_PASSKEY_DIGIT_OUT = 0x02;
  public final static int BLE_GAP_KP_NOT_TYPE_PASSKEY_CLEAR = 0x03;
  public final static int BLE_GAP_KP_NOT_TYPE_PASSKEY_END = 0x04;
  public final static int BLE_GAP_SEC_STATUS_SUCCESS = 0x00;
  public final static int BLE_GAP_SEC_STATUS_TIMEOUT = 0x01;
  public final static int BLE_GAP_SEC_STATUS_PDU_INVALID = 0x02;
  public final static int BLE_GAP_SEC_STATUS_RFU_RANGE1_BEGIN = 0x03;
  public final static int BLE_GAP_SEC_STATUS_RFU_RANGE1_END = 0x80;
  public final static int BLE_GAP_SEC_STATUS_PASSKEY_ENTRY_FAILED = 0x81;
  public final static int BLE_GAP_SEC_STATUS_OOB_NOT_AVAILABLE = 0x82;
  public final static int BLE_GAP_SEC_STATUS_AUTH_REQ = 0x83;
  public final static int BLE_GAP_SEC_STATUS_CONFIRM_VALUE = 0x84;
  public final static int BLE_GAP_SEC_STATUS_PAIRING_NOT_SUPP = 0x85;
  public final static int BLE_GAP_SEC_STATUS_ENC_KEY_SIZE = 0x86;
  public final static int BLE_GAP_SEC_STATUS_SMP_CMD_UNSUPPORTED = 0x87;
  public final static int BLE_GAP_SEC_STATUS_UNSPECIFIED = 0x88;
  public final static int BLE_GAP_SEC_STATUS_REPEATED_ATTEMPTS = 0x89;
  public final static int BLE_GAP_SEC_STATUS_INVALID_PARAMS = 0x8A;
  public final static int BLE_GAP_SEC_STATUS_DHKEY_FAILURE = 0x8B;
  public final static int BLE_GAP_SEC_STATUS_NUM_COMP_FAILURE = 0x8C;
  public final static int BLE_GAP_SEC_STATUS_BR_EDR_IN_PROG = 0x8D;
  public final static int BLE_GAP_SEC_STATUS_X_TRANS_KEY_DISALLOWED = 0x8E;
  public final static int BLE_GAP_SEC_STATUS_RFU_RANGE2_BEGIN = 0x8F;
  public final static int BLE_GAP_SEC_STATUS_RFU_RANGE2_END = 0xFF;
  public final static int BLE_GAP_SEC_STATUS_SOURCE_LOCAL = 0x00;
  public final static int BLE_GAP_SEC_STATUS_SOURCE_REMOTE = 0x01;
  public final static int BLE_GAP_CP_MIN_CONN_INTVL_NONE = 0xFFFF;
  public final static int BLE_GAP_CP_MIN_CONN_INTVL_MIN = 0x0006;
  public final static int BLE_GAP_CP_MIN_CONN_INTVL_MAX = 0x0C80;
  public final static int BLE_GAP_CP_MAX_CONN_INTVL_NONE = 0xFFFF;
  public final static int BLE_GAP_CP_MAX_CONN_INTVL_MIN = 0x0006;
  public final static int BLE_GAP_CP_MAX_CONN_INTVL_MAX = 0x0C80;
  public final static int BLE_GAP_CP_SLAVE_LATENCY_MAX = 0x01F3;
  public final static int BLE_GAP_CP_CONN_SUP_TIMEOUT_NONE = 0xFFFF;
  public final static int BLE_GAP_CP_CONN_SUP_TIMEOUT_MIN = 0x000A;
  public final static int BLE_GAP_CP_CONN_SUP_TIMEOUT_MAX = 0x0C80;
  public final static String BLE_GAP_DEVNAME_DEFAULT = "nRF5x";
  public final static int BLE_GAP_DEVNAME_DEFAULT_LEN = 31;
  public final static int BLE_GAP_DEVNAME_MAX_LEN = 248;
  public final static int BLE_GAP_RSSI_THRESHOLD_INVALID = 0xFF;
  public final static int BLE_GAP_PHY_AUTO = 0x00;
  public final static int BLE_GAP_PHY_1MBPS = 0x01;
  public final static int BLE_GAP_PHY_2MBPS = 0x02;
  public final static int BLE_GAP_PHY_CODED = 0x04;
  public final static int BLE_GAP_SEC_RAND_LEN = 8;
  public final static int BLE_GAP_SEC_KEY_LEN = 16;
  public final static int BLE_GAP_LESC_P256_PK_LEN = 64;
  public final static int BLE_GAP_LESC_DHKEY_LEN = 32;
  public final static int BLE_GAP_PASSKEY_LEN = 6;
  public final static int BLE_GAP_WHITELIST_ADDR_MAX_COUNT = (8);
  public final static int BLE_GAP_DEVICE_IDENTITIES_MAX_COUNT = (8);
  public final static int BLE_GAP_CONN_COUNT_DEFAULT = (1);
  public final static int BLE_GAP_EVENT_LENGTH_MIN = (2);
  public final static int BLE_GAP_EVENT_LENGTH_DEFAULT = (3);
  public final static int BLE_GAP_ROLE_COUNT_PERIPH_DEFAULT = (1);
  public final static int BLE_GAP_ROLE_COUNT_CENTRAL_DEFAULT = (3);
  public final static int BLE_GAP_ROLE_COUNT_CENTRAL_SEC_DEFAULT = (1);
  public final static int BLE_GAP_ROLE_COUNT_COMBINED_MAX = (20);
  public final static int BLE_GAP_DATA_LENGTH_AUTO = 0;
  public final static int BLE_GAP_AUTH_PAYLOAD_TIMEOUT_MAX = (48000);
  public final static int BLE_GAP_AUTH_PAYLOAD_TIMEOUT_MIN = (1);
  public final static int BLE_GAP_SEC_MODE = 0x00;
  public final static int BLE_GATT_ATT_MTU_DEFAULT = 23;
  public final static int BLE_GATT_HANDLE_INVALID = 0x0000;
  public final static int BLE_GATT_HANDLE_START = 0x0001;
  public final static int BLE_GATT_HANDLE_END = 0xFFFF;
  public final static int BLE_GATT_TIMEOUT_SRC_PROTOCOL = 0x00;
  public final static int BLE_GATT_OP_INVALID = 0x00;
  public final static int BLE_GATT_OP_WRITE_REQ = 0x01;
  public final static int BLE_GATT_OP_WRITE_CMD = 0x02;
  public final static int BLE_GATT_OP_SIGN_WRITE_CMD = 0x03;
  public final static int BLE_GATT_OP_PREP_WRITE_REQ = 0x04;
  public final static int BLE_GATT_OP_EXEC_WRITE_REQ = 0x05;
  public final static int BLE_GATT_EXEC_WRITE_FLAG_PREPARED_CANCEL = 0x00;
  public final static int BLE_GATT_EXEC_WRITE_FLAG_PREPARED_WRITE = 0x01;
  public final static int BLE_GATT_HVX_INVALID = 0x00;
  public final static int BLE_GATT_HVX_NOTIFICATION = 0x01;
  public final static int BLE_GATT_HVX_INDICATION = 0x02;
  public final static int BLE_GATT_STATUS_SUCCESS = 0x0000;
  public final static int BLE_GATT_STATUS_UNKNOWN = 0x0001;
  public final static int BLE_GATT_STATUS_ATTERR_INVALID = 0x0100;
  public final static int BLE_GATT_STATUS_ATTERR_INVALID_HANDLE = 0x0101;
  public final static int BLE_GATT_STATUS_ATTERR_READ_NOT_PERMITTED = 0x0102;
  public final static int BLE_GATT_STATUS_ATTERR_WRITE_NOT_PERMITTED = 0x0103;
  public final static int BLE_GATT_STATUS_ATTERR_INVALID_PDU = 0x0104;
  public final static int BLE_GATT_STATUS_ATTERR_INSUF_AUTHENTICATION = 0x0105;
  public final static int BLE_GATT_STATUS_ATTERR_REQUEST_NOT_SUPPORTED = 0x0106;
  public final static int BLE_GATT_STATUS_ATTERR_INVALID_OFFSET = 0x0107;
  public final static int BLE_GATT_STATUS_ATTERR_INSUF_AUTHORIZATION = 0x0108;
  public final static int BLE_GATT_STATUS_ATTERR_PREPARE_QUEUE_FULL = 0x0109;
  public final static int BLE_GATT_STATUS_ATTERR_ATTRIBUTE_NOT_FOUND = 0x010A;
  public final static int BLE_GATT_STATUS_ATTERR_ATTRIBUTE_NOT_LONG = 0x010B;
  public final static int BLE_GATT_STATUS_ATTERR_INSUF_ENC_KEY_SIZE = 0x010C;
  public final static int BLE_GATT_STATUS_ATTERR_INVALID_ATT_VAL_LENGTH = 0x010D;
  public final static int BLE_GATT_STATUS_ATTERR_UNLIKELY_ERROR = 0x010E;
  public final static int BLE_GATT_STATUS_ATTERR_INSUF_ENCRYPTION = 0x010F;
  public final static int BLE_GATT_STATUS_ATTERR_UNSUPPORTED_GROUP_TYPE = 0x0110;
  public final static int BLE_GATT_STATUS_ATTERR_INSUF_RESOURCES = 0x0111;
  public final static int BLE_GATT_STATUS_ATTERR_RFU_RANGE1_BEGIN = 0x0112;
  public final static int BLE_GATT_STATUS_ATTERR_RFU_RANGE1_END = 0x017F;
  public final static int BLE_GATT_STATUS_ATTERR_APP_BEGIN = 0x0180;
  public final static int BLE_GATT_STATUS_ATTERR_APP_END = 0x019F;
  public final static int BLE_GATT_STATUS_ATTERR_RFU_RANGE2_BEGIN = 0x01A0;
  public final static int BLE_GATT_STATUS_ATTERR_RFU_RANGE2_END = 0x01DF;
  public final static int BLE_GATT_STATUS_ATTERR_RFU_RANGE3_BEGIN = 0x01E0;
  public final static int BLE_GATT_STATUS_ATTERR_RFU_RANGE3_END = 0x01FC;
  public final static int BLE_GATT_STATUS_ATTERR_CPS_CCCD_CONFIG_ERROR = 0x01FD;
  public final static int BLE_GATT_STATUS_ATTERR_CPS_PROC_ALR_IN_PROG = 0x01FE;
  public final static int BLE_GATT_STATUS_ATTERR_CPS_OUT_OF_RANGE = 0x01FF;
  public final static int BLE_GATT_CPF_FORMAT_RFU = 0x00;
  public final static int BLE_GATT_CPF_FORMAT_BOOLEAN = 0x01;
  public final static int BLE_GATT_CPF_FORMAT_2BIT = 0x02;
  public final static int BLE_GATT_CPF_FORMAT_NIBBLE = 0x03;
  public final static int BLE_GATT_CPF_FORMAT_UINT8 = 0x04;
  public final static int BLE_GATT_CPF_FORMAT_UINT12 = 0x05;
  public final static int BLE_GATT_CPF_FORMAT_UINT16 = 0x06;
  public final static int BLE_GATT_CPF_FORMAT_UINT24 = 0x07;
  public final static int BLE_GATT_CPF_FORMAT_UINT32 = 0x08;
  public final static int BLE_GATT_CPF_FORMAT_UINT48 = 0x09;
  public final static int BLE_GATT_CPF_FORMAT_UINT64 = 0x0A;
  public final static int BLE_GATT_CPF_FORMAT_UINT128 = 0x0B;
  public final static int BLE_GATT_CPF_FORMAT_SINT8 = 0x0C;
  public final static int BLE_GATT_CPF_FORMAT_SINT12 = 0x0D;
  public final static int BLE_GATT_CPF_FORMAT_SINT16 = 0x0E;
  public final static int BLE_GATT_CPF_FORMAT_SINT24 = 0x0F;
  public final static int BLE_GATT_CPF_FORMAT_SINT32 = 0x10;
  public final static int BLE_GATT_CPF_FORMAT_SINT48 = 0x11;
  public final static int BLE_GATT_CPF_FORMAT_SINT64 = 0x12;
  public final static int BLE_GATT_CPF_FORMAT_SINT128 = 0x13;
  public final static int BLE_GATT_CPF_FORMAT_FLOAT32 = 0x14;
  public final static int BLE_GATT_CPF_FORMAT_FLOAT64 = 0x15;
  public final static int BLE_GATT_CPF_FORMAT_SFLOAT = 0x16;
  public final static int BLE_GATT_CPF_FORMAT_FLOAT = 0x17;
  public final static int BLE_GATT_CPF_FORMAT_DUINT16 = 0x18;
  public final static int BLE_GATT_CPF_FORMAT_UTF8S = 0x19;
  public final static int BLE_GATT_CPF_FORMAT_UTF16S = 0x1A;
  public final static int BLE_GATT_CPF_FORMAT_STRUCT = 0x1B;
  public final static int BLE_GATT_CPF_NAMESPACE_BTSIG = 0x01;
  public final static int BLE_GATT_CPF_NAMESPACE_DESCRIPTION_UNKNOWN = 0x0000;
  public final static int BLE_GATTS_FIX_ATTR_LEN_MAX = (510);
  public final static int BLE_GATTS_VAR_ATTR_LEN_MAX = (512);
  public final static int BLE_GATTS_SRVC_TYPE_INVALID = 0x00;
  public final static int BLE_GATTS_SRVC_TYPE_PRIMARY = 0x01;
  public final static int BLE_GATTS_SRVC_TYPE_SECONDARY = 0x02;
  public final static int BLE_GATTS_ATTR_TYPE_INVALID = 0x00;
  public final static int BLE_GATTS_ATTR_TYPE_PRIM_SRVC_DECL = 0x01;
  public final static int BLE_GATTS_ATTR_TYPE_SEC_SRVC_DECL = 0x02;
  public final static int BLE_GATTS_ATTR_TYPE_INC_DECL = 0x03;
  public final static int BLE_GATTS_ATTR_TYPE_CHAR_DECL = 0x04;
  public final static int BLE_GATTS_ATTR_TYPE_CHAR_VAL = 0x05;
  public final static int BLE_GATTS_ATTR_TYPE_DESC = 0x06;
  public final static int BLE_GATTS_ATTR_TYPE_OTHER = 0x07;
  public final static int BLE_GATTS_OP_INVALID = 0x00;
  public final static int BLE_GATTS_OP_WRITE_REQ = 0x01;
  public final static int BLE_GATTS_OP_WRITE_CMD = 0x02;
  public final static int BLE_GATTS_OP_SIGN_WRITE_CMD = 0x03;
  public final static int BLE_GATTS_OP_PREP_WRITE_REQ = 0x04;
  public final static int BLE_GATTS_OP_EXEC_WRITE_REQ_CANCEL = 0x05;
  public final static int BLE_GATTS_OP_EXEC_WRITE_REQ_NOW = 0x06;
  public final static int BLE_GATTS_VLOC_INVALID = 0x00;
  public final static int BLE_GATTS_VLOC_STACK = 0x01;
  public final static int BLE_GATTS_VLOC_USER = 0x02;
  public final static int BLE_GATTS_AUTHORIZE_TYPE_INVALID = 0x00;
  public final static int BLE_GATTS_AUTHORIZE_TYPE_READ = 0x01;
  public final static int BLE_GATTS_AUTHORIZE_TYPE_WRITE = 0x02;
  public final static int BLE_GATTS_SYS_ATTR_FLAG_SYS_SRVCS = (1 << 0);
  public final static int BLE_GATTS_SYS_ATTR_FLAG_USR_SRVCS = (1 << 1);
  public final static int BLE_GATTS_SERVICE_CHANGED_DEFAULT = (1);
  public final static int BLE_GATTS_ATTR_TAB_SIZE_MIN = (248);
  public final static int BLE_GATTS_ATTR_TAB_SIZE_DEFAULT = (1408);
  public final static int BLE_GATTS_HVN_TX_QUEUE_SIZE_DEFAULT = 1;
  public final static int BLE_GATTC_ATTR_INFO_FORMAT_16BIT = 1;
  public final static int BLE_GATTC_ATTR_INFO_FORMAT_128BIT = 2;
  public final static int BLE_GATTC_WRITE_CMD_TX_QUEUE_SIZE_DEFAULT = 1;
  public final static int BLE_HCI_STATUS_CODE_SUCCESS = 0x00;
  public final static int BLE_HCI_STATUS_CODE_UNKNOWN_BTLE_COMMAND = 0x01;
  public final static int BLE_HCI_STATUS_CODE_UNKNOWN_CONNECTION_IDENTIFIER = 0x02;
  public final static int BLE_HCI_AUTHENTICATION_FAILURE = 0x05;
  public final static int BLE_HCI_STATUS_CODE_PIN_OR_KEY_MISSING = 0x06;
  public final static int BLE_HCI_MEMORY_CAPACITY_EXCEEDED = 0x07;
  public final static int BLE_HCI_CONNECTION_TIMEOUT = 0x08;
  public final static int BLE_HCI_STATUS_CODE_COMMAND_DISALLOWED = 0x0C;
  public final static int BLE_HCI_STATUS_CODE_INVALID_BTLE_COMMAND_PARAMETERS = 0x12;
  public final static int BLE_HCI_REMOTE_USER_TERMINATED_CONNECTION = 0x13;
  public final static int BLE_HCI_REMOTE_DEV_TERMINATION_DUE_TO_LOW_RESOURCES = 0x14;
  public final static int BLE_HCI_REMOTE_DEV_TERMINATION_DUE_TO_POWER_OFF = 0x15;
  public final static int BLE_HCI_LOCAL_HOST_TERMINATED_CONNECTION = 0x16;
  public final static int BLE_HCI_UNSUPPORTED_REMOTE_FEATURE = 0x1A;
  public final static int BLE_HCI_STATUS_CODE_INVALID_LMP_PARAMETERS = 0x1E;
  public final static int BLE_HCI_STATUS_CODE_UNSPECIFIED_ERROR = 0x1F;
  public final static int BLE_HCI_STATUS_CODE_LMP_RESPONSE_TIMEOUT = 0x22;
  public final static int BLE_HCI_STATUS_CODE_LMP_ERROR_TRANSACTION_COLLISION = 0x23;
  public final static int BLE_HCI_STATUS_CODE_LMP_PDU_NOT_ALLOWED = 0x24;
  public final static int BLE_HCI_INSTANT_PASSED = 0x28;
  public final static int BLE_HCI_PAIRING_WITH_UNIT_KEY_UNSUPPORTED = 0x29;
  public final static int BLE_HCI_DIFFERENT_TRANSACTION_COLLISION = 0x2A;
  public final static int BLE_HCI_PARAMETER_OUT_OF_MANDATORY_RANGE = 0x30;
  public final static int BLE_HCI_CONTROLLER_BUSY = 0x3A;
  public final static int BLE_HCI_CONN_INTERVAL_UNACCEPTABLE = 0x3B;
  public final static int BLE_HCI_DIRECTED_ADVERTISER_TIMEOUT = 0x3C;
  public final static int BLE_HCI_CONN_TERMINATED_DUE_TO_MIC_FAILURE = 0x3D;
  public final static int BLE_HCI_CONN_FAILED_TO_BE_ESTABLISHED = 0x3E;
  public final static int BLE_L2CAP_CH_COUNT_MAX = (64);
  public final static int BLE_L2CAP_MTU_MIN = (23);
  public final static int BLE_L2CAP_MPS_MIN = (23);
  public final static int BLE_L2CAP_CID_INVALID = (0x0000);
  public final static int BLE_L2CAP_CREDITS_DEFAULT = (1);
  public final static int BLE_L2CAP_CH_SETUP_REFUSED_SRC_LOCAL = (0x01);
  public final static int BLE_L2CAP_CH_SETUP_REFUSED_SRC_REMOTE = (0x02);
  public final static int BLE_L2CAP_CH_STATUS_CODE_SUCCESS = (0x0000);
  public final static int BLE_L2CAP_CH_STATUS_CODE_LE_PSM_NOT_SUPPORTED = (0x0002);
  public final static int BLE_L2CAP_CH_STATUS_CODE_NO_RESOURCES = (0x0004);
  public final static int BLE_L2CAP_CH_STATUS_CODE_INSUFF_AUTHENTICATION = (0x0005);
  public final static int BLE_L2CAP_CH_STATUS_CODE_INSUFF_AUTHORIZATION = (0x0006);
  public final static int BLE_L2CAP_CH_STATUS_CODE_INSUFF_ENC_KEY_SIZE = (0x0007);
  public final static int BLE_L2CAP_CH_STATUS_CODE_INSUFF_ENC = (0x0008);
  public final static int BLE_L2CAP_CH_STATUS_CODE_INVALID_SCID = (0x0009);
  public final static int BLE_L2CAP_CH_STATUS_CODE_SCID_ALLOCATED = (0x000A);
  public final static int BLE_L2CAP_CH_STATUS_CODE_UNACCEPTABLE_PARAMS = (0x000B);
  public final static int BLE_L2CAP_CH_STATUS_CODE_NOT_UNDERSTOOD = (0x8000);
  public final static int BLE_L2CAP_CH_STATUS_CODE_TIMEOUT = (0xC000);
  public final static int BLE_CONN_HANDLE_INVALID = 0xFFFF;
  public final static int BLE_CONN_HANDLE_ALL = 0xFFFE;
  public final static int BLE_UUID_UNKNOWN = 0x0000;
  public final static int BLE_UUID_SERVICE_PRIMARY = 0x2800;
  public final static int BLE_UUID_SERVICE_SECONDARY = 0x2801;
  public final static int BLE_UUID_SERVICE_INCLUDE = 0x2802;
  public final static int BLE_UUID_CHARACTERISTIC = 0x2803;
  public final static int BLE_UUID_DESCRIPTOR_CHAR_EXT_PROP = 0x2900;
  public final static int BLE_UUID_DESCRIPTOR_CHAR_USER_DESC = 0x2901;
  public final static int BLE_UUID_DESCRIPTOR_CLIENT_CHAR_CONFIG = 0x2902;
  public final static int BLE_UUID_DESCRIPTOR_SERVER_CHAR_CONFIG = 0x2903;
  public final static int BLE_UUID_DESCRIPTOR_CHAR_PRESENTATION_FORMAT = 0x2904;
  public final static int BLE_UUID_DESCRIPTOR_CHAR_AGGREGATE_FORMAT = 0x2905;
  public final static int BLE_UUID_GATT = 0x1801;
  public final static int BLE_UUID_GATT_CHARACTERISTIC_SERVICE_CHANGED = 0x2A05;
  public final static int BLE_UUID_GAP = 0x1800;
  public final static int BLE_UUID_GAP_CHARACTERISTIC_DEVICE_NAME = 0x2A00;
  public final static int BLE_UUID_GAP_CHARACTERISTIC_APPEARANCE = 0x2A01;
  public final static int BLE_UUID_GAP_CHARACTERISTIC_RECONN_ADDR = 0x2A03;
  public final static int BLE_UUID_GAP_CHARACTERISTIC_PPCP = 0x2A04;
  public final static int BLE_UUID_GAP_CHARACTERISTIC_CAR = 0x2AA6;
  public final static int BLE_UUID_GAP_CHARACTERISTIC_RPA_ONLY = 0x2AC9;
  public final static int BLE_UUID_TYPE_UNKNOWN = 0x00;
  public final static int BLE_UUID_TYPE_BLE = 0x01;
  public final static int BLE_UUID_TYPE_VENDOR_BEGIN = 0x02;
  public final static int BLE_APPEARANCE_UNKNOWN = 0;
  public final static int BLE_APPEARANCE_GENERIC_PHONE = 64;
  public final static int BLE_APPEARANCE_GENERIC_COMPUTER = 128;
  public final static int BLE_APPEARANCE_GENERIC_WATCH = 192;
  public final static int BLE_APPEARANCE_WATCH_SPORTS_WATCH = 193;
  public final static int BLE_APPEARANCE_GENERIC_CLOCK = 256;
  public final static int BLE_APPEARANCE_GENERIC_DISPLAY = 320;
  public final static int BLE_APPEARANCE_GENERIC_REMOTE_CONTROL = 384;
  public final static int BLE_APPEARANCE_GENERIC_EYE_GLASSES = 448;
  public final static int BLE_APPEARANCE_GENERIC_TAG = 512;
  public final static int BLE_APPEARANCE_GENERIC_KEYRING = 576;
  public final static int BLE_APPEARANCE_GENERIC_MEDIA_PLAYER = 640;
  public final static int BLE_APPEARANCE_GENERIC_BARCODE_SCANNER = 704;
  public final static int BLE_APPEARANCE_GENERIC_THERMOMETER = 768;
  public final static int BLE_APPEARANCE_THERMOMETER_EAR = 769;
  public final static int BLE_APPEARANCE_GENERIC_HEART_RATE_SENSOR = 832;
  public final static int BLE_APPEARANCE_HEART_RATE_SENSOR_HEART_RATE_BELT = 833;
  public final static int BLE_APPEARANCE_GENERIC_BLOOD_PRESSURE = 896;
  public final static int BLE_APPEARANCE_BLOOD_PRESSURE_ARM = 897;
  public final static int BLE_APPEARANCE_BLOOD_PRESSURE_WRIST = 898;
  public final static int BLE_APPEARANCE_GENERIC_HID = 960;
  public final static int BLE_APPEARANCE_HID_KEYBOARD = 961;
  public final static int BLE_APPEARANCE_HID_MOUSE = 962;
  public final static int BLE_APPEARANCE_HID_JOYSTICK = 963;
  public final static int BLE_APPEARANCE_HID_GAMEPAD = 964;
  public final static int BLE_APPEARANCE_HID_DIGITIZERSUBTYPE = 965;
  public final static int BLE_APPEARANCE_HID_CARD_READER = 966;
  public final static int BLE_APPEARANCE_HID_DIGITAL_PEN = 967;
  public final static int BLE_APPEARANCE_HID_BARCODE = 968;
  public final static int BLE_APPEARANCE_GENERIC_GLUCOSE_METER = 1024;
  public final static int BLE_APPEARANCE_GENERIC_RUNNING_WALKING_SENSOR = 1088;
  public final static int BLE_APPEARANCE_RUNNING_WALKING_SENSOR_IN_SHOE = 1089;
  public final static int BLE_APPEARANCE_RUNNING_WALKING_SENSOR_ON_SHOE = 1090;
  public final static int BLE_APPEARANCE_RUNNING_WALKING_SENSOR_ON_HIP = 1091;
  public final static int BLE_APPEARANCE_GENERIC_CYCLING = 1152;
  public final static int BLE_APPEARANCE_CYCLING_CYCLING_COMPUTER = 1153;
  public final static int BLE_APPEARANCE_CYCLING_SPEED_SENSOR = 1154;
  public final static int BLE_APPEARANCE_CYCLING_CADENCE_SENSOR = 1155;
  public final static int BLE_APPEARANCE_CYCLING_POWER_SENSOR = 1156;
  public final static int BLE_APPEARANCE_CYCLING_SPEED_CADENCE_SENSOR = 1157;
  public final static int BLE_APPEARANCE_GENERIC_PULSE_OXIMETER = 3136;
  public final static int BLE_APPEARANCE_PULSE_OXIMETER_FINGERTIP = 3137;
  public final static int BLE_APPEARANCE_PULSE_OXIMETER_WRIST_WORN = 3138;
  public final static int BLE_APPEARANCE_GENERIC_WEIGHT_SCALE = 3200;
  public final static int BLE_APPEARANCE_GENERIC_OUTDOOR_SPORTS_ACT = 5184;
  public final static int BLE_APPEARANCE_OUTDOOR_SPORTS_ACT_LOC_DISP = 5185;
  public final static int BLE_APPEARANCE_OUTDOOR_SPORTS_ACT_LOC_AND_NAV_DISP = 5186;
  public final static int BLE_APPEARANCE_OUTDOOR_SPORTS_ACT_LOC_POD = 5187;
  public final static int BLE_APPEARANCE_OUTDOOR_SPORTS_ACT_LOC_AND_NAV_POD = 5188;
  public final static int NRF_ERROR_BASE_NUM = (0x0);
  public final static int NRF_ERROR_SDM_BASE_NUM = (0x1000);
  public final static int NRF_ERROR_SOC_BASE_NUM = (0x2000);
  public final static int NRF_ERROR_STK_BASE_NUM = (0x3000);
  public final static int NRF_SUCCESS = ((0x0) +0);
  public final static int NRF_ERROR_SVC_HANDLER_MISSING = ((0x0) +1);
  public final static int NRF_ERROR_SOFTDEVICE_NOT_ENABLED = ((0x0) +2);
  public final static int NRF_ERROR_INTERNAL = ((0x0) +3);
  public final static int NRF_ERROR_NO_MEM = ((0x0) +4);
  public final static int NRF_ERROR_NOT_FOUND = ((0x0) +5);
  public final static int NRF_ERROR_NOT_SUPPORTED = ((0x0) +6);
  public final static int NRF_ERROR_INVALID_PARAM = ((0x0) +7);
  public final static int NRF_ERROR_INVALID_STATE = ((0x0) +8);
  public final static int NRF_ERROR_INVALID_LENGTH = ((0x0) +9);
  public final static int NRF_ERROR_INVALID_FLAGS = ((0x0) +10);
  public final static int NRF_ERROR_INVALID_DATA = ((0x0) +11);
  public final static int NRF_ERROR_DATA_SIZE = ((0x0) +12);
  public final static int NRF_ERROR_TIMEOUT = ((0x0) +13);
  public final static int NRF_ERROR_NULL = ((0x0) +14);
  public final static int NRF_ERROR_FORBIDDEN = ((0x0) +15);
  public final static int NRF_ERROR_INVALID_ADDR = ((0x0) +16);
  public final static int NRF_ERROR_BUSY = ((0x0) +17);
  public final static int NRF_ERROR_CONN_COUNT = ((0x0) +18);
  public final static int NRF_ERROR_RESOURCES = ((0x0) +19);
  public final static int SD_RPC_MAXPATHLEN = 512;
}