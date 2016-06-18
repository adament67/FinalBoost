package com.trivialworks.boost;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import constant.BaseActivity;

public class HelperRegisterActivity extends BaseActivity {

    Button acceptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_register);
        setHeading("Register");
        backClick();

        acceptButton=(Button)findViewById(R.id.acceptButton);
        acceptButton.setOnClickListener(this);

        addTab(0);
    }





    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.acceptButton:
                goToActivity(HelperBackgroundCheck.class,null);
                break;
        }
    }
}
