package com.que.animationusinglottie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    bt = findViewById(R.id.button);
    bt.setOnClickListener(v ->{
        Intent n = new Intent(getApplicationContext(), animationTwo.class);
        startActivity(n);

    });
    }
}