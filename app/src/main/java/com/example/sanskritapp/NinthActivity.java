package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        getSupportActionBar().setTitle(R.string.temple_nine);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
