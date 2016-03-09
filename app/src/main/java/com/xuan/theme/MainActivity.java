package com.xuan.theme;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author xuanyouwu
 * @email xuanyouwu@163.com
 * @time 2016-03-09 09:44
 */
public class MainActivity extends AppCompatActivity {

    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int uiMode = getResources().getConfiguration().uiMode;
        int dayNightUiMode = uiMode & Configuration.UI_MODE_NIGHT_MASK;

        tv_1 = (TextView) findViewById(R.id.tv_1);
        if (dayNightUiMode == Configuration.UI_MODE_NIGHT_NO) {
            tv_1.setText("日间模式");
        } else if (dayNightUiMode == Configuration.UI_MODE_NIGHT_YES) {
            tv_1.setText("夜间模式");
        }
    }

    public void changeTheme(View v) {
        int uiMode = getResources().getConfiguration().uiMode;
        int dayNightUiMode = uiMode & Configuration.UI_MODE_NIGHT_MASK;
        try {
            if (dayNightUiMode == Configuration.UI_MODE_NIGHT_NO) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                BaseApplication.sp.edit().putInt(BaseApplication.THEMID, AppCompatDelegate.MODE_NIGHT_YES).commit();
                recreate();
                overridePendingTransition(0, 0);
            } else {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                BaseApplication.sp.edit().putInt(BaseApplication.THEMID, AppCompatDelegate.MODE_NIGHT_NO).commit();
                recreate();
                overridePendingTransition(0, 0);
            }
        } catch (Exception e) {
            Toast.makeText(this, "异常:" + e, Toast.LENGTH_SHORT).show();
        }

    }


}
