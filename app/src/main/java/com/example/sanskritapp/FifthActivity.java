package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        getSupportActionBar().setTitle(R.string.temple_five);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
