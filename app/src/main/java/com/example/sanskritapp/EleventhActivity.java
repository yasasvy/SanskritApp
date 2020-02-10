package com.example.sanskritapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class EleventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        getSupportActionBar().setTitle(R.string.temple_eleven);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
