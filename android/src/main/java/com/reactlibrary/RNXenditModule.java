
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNXenditModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNXenditModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNXendit";
  }

  @ReactMethod
  public void startScan() {
    return "start scan Xendit..";
  }
}
