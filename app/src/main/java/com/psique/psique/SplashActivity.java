package com.psique.psique;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        motionLogoMark();
        motionLogoType();

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        },6000);
    }

    private void motionLogoType() {
        ImageView svg = findViewById(R.id.logotype);
        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        alpha.setDuration(1000);
        svg.setAnimation(alpha);
    }

    private void motionLogoMark() {
        ImageView svg = findViewById(R.id.imageView);

        AnimationSet as = new AnimationSet(true);
        as.setFillAfter(true);

        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);
        alpha.setDuration(1000);
        as.addAnimation(alpha);

        TranslateAnimation trans = new TranslateAnimation(0, -120, 0, 0);
        trans.setDuration(1000);
        as.addAnimation(trans);
        svg.setAnimation(as);
    }
}