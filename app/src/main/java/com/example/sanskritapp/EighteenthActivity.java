package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class EighteenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth);
        getSupportActionBar().setTitle(R.string.temple_eighteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
