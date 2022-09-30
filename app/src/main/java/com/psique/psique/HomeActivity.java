package com.psique.psique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button StartRoutine=findViewById(R.id.btn_StartRoutine);
        StartRoutine.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, HomeActivity2.class));
    }
}