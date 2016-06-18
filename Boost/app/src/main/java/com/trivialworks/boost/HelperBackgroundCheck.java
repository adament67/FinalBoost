package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class HelperBackgroundCheck extends BaseActivity {

    Button continueBGCheckButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_background_check);
        setHeading("Safety & Background Check");
        backClick();

        continueBGCheckButton=(Button)findViewById(R.id.continueBGCheckButton);
        continueBGCheckButton.setOnClickListener(this);

    }





    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.continueBGCheckButton:
                goToActivity(HelperBGDisclosureActivity.class,null);
                break;
        }
    }




}
