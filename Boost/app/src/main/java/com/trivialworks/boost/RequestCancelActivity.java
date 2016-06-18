package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import constant.BaseActivity;

public class RequestCancelActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_cancel);
        setHeading("Request Cancelled");
        backClick();
    }
}
