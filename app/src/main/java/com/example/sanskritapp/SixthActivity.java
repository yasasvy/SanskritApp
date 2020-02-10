package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        getSupportActionBar().setTitle(R.string.temple_six);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
