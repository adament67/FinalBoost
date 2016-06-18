package com.trivialworks.boost;

import android.os.Bundle;
import android.os.Handler;

import constant.BaseActivity;

/**
 * Created by adament on 23/5/16.
 */
public class SplashScreenActivity extends BaseActivity {

    int SPLASH_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                gotoActivityWithfinish(CreateAccountFirstActivity.class,null);
            }
        },SPLASH_TIME);
    }
}
