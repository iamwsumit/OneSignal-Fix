package com.sumit1334.onesignalfix;

import android.util.Log;

import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;

public final class OneSignalFix extends AndroidNonvisibleComponent implements Component {
    public OneSignalFix(ComponentContainer container) {
        super(container.$form());
        Log.i("OneSignal Fix", "Extension is Initialised");
    }
}