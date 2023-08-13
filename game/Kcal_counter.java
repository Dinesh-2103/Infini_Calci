package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kcal_counter extends AppCompatActivity {

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_kcal_counter);

        OnCLick();
    }

    EditText height,weight,age;
    Button btn;
    TextView KcalM,Kcalw;

    public  void OnCLick()
    {
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        age=(EditText)findViewById(R.id.age);
        btn=(Button)findViewById(R.id.btn);
        KcalM=(TextView)findViewById(R.id.KcalM);
        Kcalw=(TextView)findViewById(R.id.KcalW);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                double a =Integer.parseInt(height.getText().toString());
                double b=Integer.parseInt(weight.getText().toString());
                double c=Integer.parseInt(age.getText().toString());
                double male;
                double female;
                male= 665+(13.8*b)+(5*a)/(6.8*c);
                female= 655.1+(9.6*a)+(1.9*b)/(4.7*c);

                KcalM.setText("BMI for Male:"+String.valueOf(male));
                Kcalw.setText("BMI for Female:"+String.valueOf(female));

            }
        });
    }
}
