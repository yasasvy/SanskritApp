package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().setTitle(R.string.temple_one);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
