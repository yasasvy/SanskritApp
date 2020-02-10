package com.example.sanskritapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void nextPage1(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void nextPage2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void nextPage3(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void nextPage4(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void nextPage5(View view) {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void nextPage6(View view) {
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void nextPage7(View view) {
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }

    public void nextPage8(View view) {
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }

    public void nextPage9(View view) {
        Intent intent = new Intent(this, NinthActivity.class);
        startActivity(intent);
    }

    public void nextPage10(View view) {
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }

    public void nextPage11(View view) {
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }

    public void nextPage12(View view) {
        Intent intent = new Intent(this, TwelthActivity.class);
        startActivity(intent);
    }

    public void nextPage13(View view) {
        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }

    public void nextPage14(View view) {
        Intent intent = new Intent(this, FourteenthActivity.class);
        startActivity(intent);
    }

    public void nextPage15(View view) {
        Intent intent = new Intent(this, FifteenthActivity.class);
        startActivity(intent);
    }

    public void nextPage16(View view) {
        Intent intent = new Intent(this, SixteenthActivity.class);
        startActivity(intent);
    }

    public void nextPage17(View view) {
        Intent intent = new Intent(this, SeventeenthActivity.class);
        startActivity(intent);
    }

    public void nextPage18(View view) {
        Intent intent = new Intent(this, EighteenthActivity.class);
        startActivity(intent);
    }

    public void nextPage19(View view) {
        Intent intent = new Intent(this, NineteenthActivity.class);
        startActivity(intent);
    }

}
