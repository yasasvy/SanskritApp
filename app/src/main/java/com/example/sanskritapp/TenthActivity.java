package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        getSupportActionBar().setTitle(R.string.temple_ten);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
