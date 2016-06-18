package com.trivialworks.boost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import constant.BaseActivity;

public class ThankYouActivity extends BaseActivity {

    TextView headerCancelTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        setHeading("Thank You");
        backClick();

        headerCancelTextView=(TextView)findViewById(R.id.headerCancelText);
        headerCancelTextView.setOnClickListener(this);
        headerCancelTextView.setText("History");
        headerCancelTextView.setVisibility(View.VISIBLE);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.headerCancelText:

                goToActivity(HistoryActivity.class,null);

                break;

        }
    }

}
