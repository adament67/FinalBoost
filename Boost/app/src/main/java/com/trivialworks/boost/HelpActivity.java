package com.trivialworks.boost;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import constant.BaseActivity;

/**
 * Created by adament on 24/5/16.
 */
public class HelpActivity extends BaseActivity {


    TextView yesTextView,taskTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setHeading("Help");
        backClick();
        addTab(0);
        yesTextView=(TextView)findViewById(R.id.yesTextView);
        yesTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.yesTextView:
                goToActivity(CallClientMapActivity.class,null);
        }
    }

}
