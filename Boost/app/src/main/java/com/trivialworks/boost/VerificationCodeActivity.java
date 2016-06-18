package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class VerificationCodeActivity extends BaseActivity {

    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
        setHeading("Verification Code");

        nextButton=(Button)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);

        backClick();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.nextButton:

                goToActivity(RequestAddCreditCardActivity.class,null);

                break;


        }
    }


}
