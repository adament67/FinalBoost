package com.trivialworks.boost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;

import constant.BaseActivity;

/**
 * Created by dilip on 8/6/16.
 */
public class LoginActivity extends BaseActivity {

    //header linear layout to set background
    LinearLayout headerLinLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

    }
}
