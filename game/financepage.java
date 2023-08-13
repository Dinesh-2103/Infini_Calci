package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class financepage extends AppCompatActivity {
    private ImageButton CI;
    private ImageButton SI;
    private ImageButton percentage;
    private ImageButton Emi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_financepage);
        CI = findViewById(R.id.CI);
        SI= findViewById(R.id.SI);
        Emi= findViewById(R.id.Emi);
        percentage=findViewById(R.id.percentage);

        CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(financepage.this,CI.class);
                startActivity(intent);
            }
        });

        SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(financepage.this,SI.class);
                startActivity(intent);
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(financepage.this,percentage_cal.class);
                startActivity(intent);
            }
        });

        Emi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(financepage.this,EMI.class);
                startActivity(intent);
            }
        });










    }

}