package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class AccountActivity extends BaseActivity {

    Button editInfoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        setHeading("Account");
        backClick();

        editInfoButton=(Button)findViewById(R.id.editInfoButton);
        editInfoButton.setOnClickListener(this);

        addTab(2);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.editInfoButton:
                goToActivity(PaymentInfoAccountActivity.class,null);
        }
    }
}
