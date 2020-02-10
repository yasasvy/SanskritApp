package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FifteenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteenth);
        getSupportActionBar().setTitle(R.string.temple_fifteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
