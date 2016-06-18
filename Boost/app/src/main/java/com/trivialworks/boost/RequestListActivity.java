package com.trivialworks.boost;

import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import constant.BaseActivity;

public class RequestListActivity extends BaseActivity {


//html text

    private final String htmlText = "<body><p>Awesome you are all set to start your first help request by tapping the " +
            "<img src=\"small_plus_icon_html.jpg\">" +" button on the top right corner of the screen."+
            "</body>";





    TextView addRequest;
    ImageView headerAddButton,pluIconImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_list);
        backClick();
        setHeading("Request");

        pluIconImage=(ImageView)findViewById(R.id.pluIconImage);

        pluIconImage.setOnClickListener(this);
        addRequest=(TextView)findViewById(R.id.addRequest);

       // addRequest.setText("Awesome you are all set to start your first help request by tapping the button on the top right corner of the screen");


        addRequest.setText(Html.fromHtml(htmlText, new ImageGetter(), null));



        //addRequest.setText(Html.fromHtml("<p>Awesome you are all set to start your first help request by tapping the<img src=\"/home/dilip/dilip/Projects/Boost/app/src/main/res/raw/plus_icon_blue.png\">button on the top right corner of the screen</p>"/*getString(R.string.add_request_html))*/));
        //Log.v("IMAGE HTML", Html.fromHtml("<p>Awesome you are all set to start your first help request by tapping the<img src=\"/home/dilip/dilip/Projects/Boost/app/src/main/res/raw/plus_icon_blue.png\">button on the top right corner of the screen</p>").toString() );

        headerAddButton=(ImageView)findViewById(R.id.headerAddButton);
        headerAddButton.setVisibility(View.VISIBLE);
        headerAddButton.setOnClickListener(this);
        addTab(1);
    }






    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.pluIconImage:

                goToActivity(AddAddressActivity.class,null);

                break;

            case R.id.headerAddButton:

                finishActivity();

                break;


        }
    }












}