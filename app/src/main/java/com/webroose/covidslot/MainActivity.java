package com.webroose.covidslot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openHomeScreen();
    }

    void openHomeScreen() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(
                    intent
            );
            finish();
        }, 2000);
    }


}