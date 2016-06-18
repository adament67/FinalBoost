package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import constant.BaseActivity;

public class CardInfoActivity extends BaseActivity {

    TextView headerCancelTextView;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_info);
        setHeading("Card Info");
        backClick();
        headerCancelTextView=(TextView)findViewById(R.id.headerCancelText) ;
        headerCancelTextView.setOnClickListener(this);
        headerCancelTextView.setVisibility(View.VISIBLE);
        saveButton=(Button)findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);

        addTab(2);
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);

        switch (v.getId()){

            case R.id.saveButton:
            //   goToActivity(RequestAddCreditCardActivity.class,null);

            case R.id.headerCancelText:
               // goToActivity(RequestAddCreditCardActivity.class,null);
        }
    }
}
