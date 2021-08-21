package com.jslee.myrxandroid;

import android.app.Application;

import com.jslee.myrxandroid.volley.LocalVolley;


public class myRxAndroid extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        LocalVolley.init(getApplicationContext());
    }
}
