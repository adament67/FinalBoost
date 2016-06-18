package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

public class ServiceRecordsActivity extends BaseActivity {

    TextView headerCancelTextView;
    Button rateServiceButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_records);
        setHeading("Service Records");
        backClick();

        headerCancelTextView=(TextView)findViewById(R.id.headerCancelText);
        headerCancelTextView.setOnClickListener(this);
        rateServiceButton=(Button)findViewById(R.id.rateServiceButton);
        rateServiceButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){

            case R.id.headerCancelText:
                finishActivity();
                break;

            case R.id.rateServiceButton:
                goToActivity(ReviewServiceCompletedActivity.class,null);
                break;
        }
    }
}
