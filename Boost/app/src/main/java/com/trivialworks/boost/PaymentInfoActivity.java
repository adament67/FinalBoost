package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

public class PaymentInfoActivity extends BaseActivity {

    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_info);
        setHeading("Payment Info");
        backClick();

        saveButton=(Button)findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.saveButton:

                goToActivity(ConfirmRequestActivity.class,null);

                break;

        }
    }

}
