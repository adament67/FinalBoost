package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import constant.BaseActivity;

public class AddAddressActivity extends BaseActivity {

    TextView headerCancelText,currentLocationTextView,mobileContactTextView,enterAddressTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
        setHeading("Address");
        backClick();
        headerCancelText=(TextView)findViewById(R.id.headerCancelText);
        headerCancelText.setVisibility(View.VISIBLE);
        headerCancelText.setOnClickListener(this);

        currentLocationTextView=(TextView)findViewById(R.id.currentLocationTextView);
        currentLocationTextView.setOnClickListener(this);
        mobileContactTextView=(TextView)findViewById(R.id.mobileContactTextView);
        mobileContactTextView.setOnClickListener(this);
        enterAddressTextView=(TextView)findViewById(R.id.enterAddressTextView);
        enterAddressTextView.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.headerCancelText:

                goToActivity(RequestCancelActivity.class,null);

                break;

            case R.id.currentLocationTextView:

//                goToActivity(LocationActivity.class,null);

                break;

            case R.id.mobileContactTextView:


                break;

            case R.id.enterAddressTextView:

                goToActivity(EnterAddressActivity.class,null);

                break;


        }
    }
}
