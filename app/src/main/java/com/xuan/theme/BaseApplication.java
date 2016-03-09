package com.xuan.theme;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatDelegate;

/**
 * @author xuanyouwu
 * @email xuanyouwu@163.com
 * @time 2016-03-09 09:44
 */
public class BaseApplication extends Application {

    public static SharedPreferences sp;
    public static final String THEMID = "themId";

    @Override
    public void onCreate() {
        super.onCreate();
        sp = getSharedPreferences("sp", Context.MODE_PRIVATE);
        if (sp.getInt(THEMID, 1) == 2) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
