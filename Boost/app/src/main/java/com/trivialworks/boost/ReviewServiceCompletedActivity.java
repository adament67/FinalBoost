package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import constant.BaseActivity;

public class ReviewServiceCompletedActivity extends BaseActivity {

    TextView headerCancelTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_service_completed);
        setHeading("Review");
        backClick();

        headerCancelTextView=(TextView)findViewById(R.id.headerCancelText);
        headerCancelTextView.setOnClickListener(this);
        headerCancelTextView.setText("Done");
        headerCancelTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){

            case R.id.headerCancelText:
                goToActivity(ThankYouActivity.class,null);
                break;


        }
    }
}
