package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

public class CallAcceptedActivity extends BaseActivity {

    TextView headerCancelTextView;
    Button helperArrivedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_accepted);
        setHeading("Accepted");
        backClick();
        headerCancelTextView=(TextView)findViewById(R.id.headerCancelText);
        headerCancelTextView.setOnClickListener(this);
        headerCancelTextView.setVisibility(View.VISIBLE);
        helperArrivedButton=(Button)findViewById(R.id.helperArrivedButton);
        helperArrivedButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){

            case R.id.headerCancelText:
                finishActivity();
                break;

            case R.id.helperArrivedButton:
                goToActivity(ServiceRecordsActivity.class,null);
                break;
        }
    }
}
