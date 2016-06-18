package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

public class CallClientMapActivity extends BaseActivity {

    Button scheduleNowButton;
    TextView headerCancelText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_client_map);
        setHeading("Note");
        backClick();
        headerCancelText=(TextView)findViewById(R.id.headerCancelText);
        headerCancelText.setOnClickListener(this);
        headerCancelText.setVisibility(View.VISIBLE);
        scheduleNowButton=(Button)findViewById(R.id.scheduleNowButton);
        scheduleNowButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.scheduleNowButton:
                goToActivity(ClientServiceStartActivity.class,null);
                break;

            case R.id.headerCancelText:
                finishActivity();
                break;
        }
    }
}
