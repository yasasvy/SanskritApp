package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        getSupportActionBar().setTitle(R.string.temple_seven);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
