package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class RequestPricingActivity extends BaseActivity {

    Button agreeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_pricing);

        setHeading("Pricing");
        backClick();

        agreeButton=(Button)findViewById(R.id.agreeButton);
        agreeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.agreeButton:

                       goToActivity(NoteActivity.class,null);
                      
                       break;
        }
    }
}
