package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMR extends AppCompatActivity {

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_bmr);

        OnCLick();
    }

    EditText height,weight,age;
    Button btn;
    TextView bmrw,bmrm;

    public  void OnCLick()
    {
        height=(EditText)findViewById(R.id.height);
        weight=(EditText)findViewById(R.id.weight);
        age=(EditText)findViewById(R.id.age);
        btn=(Button)findViewById(R.id.btn);
        bmrm=(TextView)findViewById(R.id.bmrm);
        bmrw=(TextView)findViewById(R.id.bmrw);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                double a =Integer.parseInt(height.getText().toString());
                double b=Integer.parseInt(weight.getText().toString());
                double c=Integer.parseInt(age.getText().toString());
                double male;
                double female;
                male= 66+(6.3*(b*2.2))+(12.9*(a/2.54))-(6.8*c);
                female= 655+(4.3*(b*2.2))+(4.7*(a/2.54))-(4.7*c);

                bmrm.setText("BMI for Male:"+String.valueOf(male));
                bmrw.setText("BMI for Female:"+String.valueOf(female));

            }
        });
    }
}
