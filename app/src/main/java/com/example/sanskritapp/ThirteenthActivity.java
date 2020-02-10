package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ThirteenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);
        getSupportActionBar().setTitle(R.string.temple_thirteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
