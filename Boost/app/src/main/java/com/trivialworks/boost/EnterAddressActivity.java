package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class EnterAddressActivity extends BaseActivity {

    Button startRequestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_address);
        setHeading("Enter An Address");
        backClick();
        startRequestButton=(Button)findViewById(R.id.startRequestButton);
        startRequestButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.startRequestButton:

                goToActivity(RequestPricingActivity.class,null);

                break;

        }
    }
}
