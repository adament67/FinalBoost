package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class CaptureIddentityPicActivity extends BaseActivity {

    Button sendPicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_iddentity_pic);

        setHeading("Drive License");
        backClick();

        sendPicButton=(Button)findViewById(R.id.sendPicButton);
        sendPicButton.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.sendPicButton:
                 gotoActivityWithfinish(ThankYouHelperActivity.class,null);
                break;
        }
    }

}
