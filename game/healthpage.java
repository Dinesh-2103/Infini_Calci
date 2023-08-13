package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class healthpage extends AppCompatActivity {
    private ImageButton bmi,bmr,calorie,heigweigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_healthpage);
        bmi = findViewById(R.id.bmi);
        bmr = findViewById(R.id.bmr );
        calorie=findViewById(R.id.calorie);
        heigweigh=findViewById(R.id.heigweigh);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(healthpage.this,BMI.class);
                startActivity(intent);
            }
        });
        bmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(healthpage.this,BMR.class);
                startActivity(intent);
            }
        });
        calorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(healthpage.this,Kcal_counter.class);
                startActivity(intent);
            }
        });
        heigweigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(healthpage.this,weigh_4_heig.class);
                startActivity(intent);
            }
        });
    }
}