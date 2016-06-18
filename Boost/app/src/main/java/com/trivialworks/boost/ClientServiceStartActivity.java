package com.trivialworks.boost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

/**
 * Created by adament on 24/5/16.
 */
public class ClientServiceStartActivity extends BaseActivity {

    Button serviceStartButton;
    TextView headerCancelText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_service_start);

        setHeading("Start Service");
        backClick();
        headerCancelText=(TextView)findViewById(R.id.headerCancelText);
        headerCancelText.setOnClickListener(this);
        headerCancelText.setVisibility(View.VISIBLE);
        serviceStartButton=(Button)findViewById(R.id.serviceStartButton);
        serviceStartButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.serviceStartButton:
                goToActivity(ClientServiceStopActivity.class,null);
                break;

            case R.id.headerCancelText:
                finishActivity();
                break;
        }
    }
}
