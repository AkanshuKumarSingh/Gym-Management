package com.aks.gymmanagementapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Tools.setSystemBarLight(PaymentActivity.this);
        Tools.setSystemBarColor(PaymentActivity.this, R.color.colorPrimaryDark);
    }
}