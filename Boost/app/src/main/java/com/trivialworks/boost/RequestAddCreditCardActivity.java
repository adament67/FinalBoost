package com.trivialworks.boost;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import constant.BaseActivity;

public class RequestAddCreditCardActivity extends BaseActivity {

    Button addCardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_add_credit_card);
        setHeading("Request");
        backClick();

        addCardButton=(Button)findViewById(R.id.addCardButton);
        addCardButton.setOnClickListener(this);

        addTab(1);
    }






    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.addCardButton:

                goToActivity(RequestListActivity.class,null);

                break;


        }
    }
}
