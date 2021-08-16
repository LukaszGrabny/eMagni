package com.polsl;

import android.app.Application;
import android.content.Context;

public class eMagni extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        eMagni.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return eMagni.context;
    }
}
