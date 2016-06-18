package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class NoteActivity extends BaseActivity {

    Button scheduleNowButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        setHeading("Note");
        backClick();

        scheduleNowButton=(Button)findViewById(R.id.scheduleNowButton);
        scheduleNowButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.scheduleNowButton:

                goToActivity(PaymentInfoActivity.class, null);

                break;

        }
    }

}
