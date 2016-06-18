package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class HelperBGDisclosureActivity extends BaseActivity {

    Button continueBGDisclosureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_bgdisclosure);
        setHeading("Background Check Disclosure");
        backClick();

        continueBGDisclosureButton=(Button)findViewById(R.id.continueBGDisclosureButton);
        continueBGDisclosureButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);

    switch (v.getId()){

        case R.id.continueBGDisclosureButton:
            goToActivity(CaptureIddentityPicActivity.class,null);
            break;
    }
    }
}
