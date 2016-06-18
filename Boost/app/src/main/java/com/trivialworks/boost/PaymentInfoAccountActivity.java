package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class PaymentInfoAccountActivity extends BaseActivity {

    Button paymentButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_info_account);

        setHeading("Payment Info");
        backClick();

        paymentButton=(Button)findViewById(R.id.paymentButton);
        paymentButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.paymentButton:
                goToActivity(BillingInfoActivity.class,null);
        }
    }
}
