package com.que.animationusinglottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class animationTwo extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_two);
        bt = findViewById(R.id.button);

        bt.setOnClickListener(v ->{
            Intent n = new Intent(getApplicationContext(), ANItHREE.class);
            startActivity(n);
        });
    }
}