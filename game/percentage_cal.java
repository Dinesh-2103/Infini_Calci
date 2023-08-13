package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class percentage_cal extends AppCompatActivity {

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_percentage_cal);

        OnCLick();
    }

    EditText value;
    Button btn;
    TextView Wm;

    public  void OnCLick()
    {
        value=findViewById(R.id.value);

        btn=findViewById(R.id.btn);
        Wm=findViewById(R.id.Wm);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                double a =Integer.parseInt(value.getText().toString());
                double d;
                d=a/100;



                Wm.setText("Average Weight for Height:"+String.valueOf(d));

            }
        });
    }
}
