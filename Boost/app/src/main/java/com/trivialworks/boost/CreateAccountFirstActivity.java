package com.trivialworks.boost;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class CreateAccountFirstActivity extends BaseActivity {

    Button createAccountRedirectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_first);

        createAccountRedirectButton=(Button)findViewById(R.id.createAccountRedirectButton);
        createAccountRedirectButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.createAccountRedirectButton:

                goToActivity(CreateAccountActivity.class,null);

                break;


        }
    }


}
