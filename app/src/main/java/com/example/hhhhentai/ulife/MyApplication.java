package com.example.hhhhentai.ulife;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;

import org.xutils.x;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
        }
    }

}
