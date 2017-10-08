
import { NativeModules } from 'react-native';

const { RNXendit } = NativeModules;

export default {
      startScan: function () {
        RNXendit.startScan();
      },
  };
