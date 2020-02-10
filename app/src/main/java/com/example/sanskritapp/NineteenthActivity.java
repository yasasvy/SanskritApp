package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NineteenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteenth);
        getSupportActionBar().setTitle(R.string.temple_nineteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
