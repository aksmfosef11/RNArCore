package com.reactlibrary;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class ArCoreModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public ArCoreModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ArCore";
    }

    @ReactMethod
    public void sampleMethod() {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, AugmentedFacesActivity.class);
        context.startActivity(intent);
    }
}
