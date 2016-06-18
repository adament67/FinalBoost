package com.trivialworks.boost;

import android.os.Bundle;
import android.support.annotation.Nullable;

import constant.BaseActivity;

/**
 * Created by adament on 24/5/16.
 */
public class ClientPaymentDetails extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_client_payment_details);
        setHeading("Client Details");
        backClick();

    }
}
