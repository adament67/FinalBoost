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
public class ClientServiceStopActivity extends BaseActivity {

    Button serviceStopButton;
    TextView headerCancelText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_service_stop);
        setHeading("End Service");
        backClick();



        headerCancelText=(TextView)findViewById(R.id.headerCancelText);
        headerCancelText.setOnClickListener(this);
        headerCancelText.setVisibility(View.VISIBLE);
        serviceStopButton=(Button)findViewById(R.id.serviceStopButton);
        serviceStopButton.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.serviceStopButton:
                goToActivity(ServiceSummaryActivity.class,null);
                break;

            case R.id.headerCancelText:
                finishActivity();
                break;
        }
    }



}
