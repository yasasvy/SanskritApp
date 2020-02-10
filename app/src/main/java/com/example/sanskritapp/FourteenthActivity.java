package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FourteenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth);
        getSupportActionBar().setTitle(R.string.temple_fourteen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
