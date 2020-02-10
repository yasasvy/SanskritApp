package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SeventeenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth);
        getSupportActionBar().setTitle(R.string.temple_seventeen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
