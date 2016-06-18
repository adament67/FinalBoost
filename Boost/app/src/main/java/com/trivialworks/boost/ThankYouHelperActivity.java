package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import constant.BaseActivity;

public class ThankYouHelperActivity extends BaseActivity {

    Button doneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you_helper);
        setHeading("Thank You");
        backClick();

        doneButton=(Button)findViewById(R.id.doneButton);
        doneButton.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.doneButton:
                goToActivity(HelpActivity.class,null);
                break;
        }
    }


}
