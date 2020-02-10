package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SixteenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteenth);
        getSupportActionBar().setTitle(R.string.temple_sixteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
