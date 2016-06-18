package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

public class BillingInfoActivity extends BaseActivity {

    Button saveButton;
    TextView headerCancelTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_info);
        setHeading("Billing Info");
        backClick();
        headerCancelTextView=(TextView)findViewById(R.id.headerCancelText) ;
        headerCancelTextView.setOnClickListener(this);
        headerCancelTextView.setVisibility(View.VISIBLE);

        saveButton=(Button)findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.saveButton:
                goToActivity(CardInfoActivity.class,null);
                      break;
            case R.id.headerCancelText:
                    finishActivity();
                     break;
        }
    }


}
