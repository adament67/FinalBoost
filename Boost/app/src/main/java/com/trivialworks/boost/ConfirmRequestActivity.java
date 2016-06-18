package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import constant.BaseActivity;

public class ConfirmRequestActivity extends BaseActivity {

    TextView headerCancelText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_request);
        setHeading("Confirm");
        backClick();
        headerCancelText=(TextView)findViewById(R.id.headerCancelText);
        headerCancelText.setText("Done");
        headerCancelText.setVisibility(View.VISIBLE);
        headerCancelText.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.headerCancelText:

                goToActivity(CallAcceptedActivity.class,null);

                break;


        }
    }

}
