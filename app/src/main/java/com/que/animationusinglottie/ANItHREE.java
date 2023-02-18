package com.que.animationusinglottie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class ANItHREE extends AppCompatActivity {

    boolean isCheckedDone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anit_hree);

        final LottieAnimationView lottieAnimationView = findViewById(R.id.checkDone);
        lottieAnimationView.setOnClickListener(v ->{
            if (isCheckedDone){
                lottieAnimationView.setSpeed(1);
                lottieAnimationView.playAnimation();
                isCheckedDone = false;
            } else {
                lottieAnimationView.setSpeed(1);
                lottieAnimationView.playAnimation();
                isCheckedDone = true;
            }
        });
    }
}