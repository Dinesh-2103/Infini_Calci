package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CI extends AppCompatActivity {

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ci);

        OnCLick();
    }

    EditText princ,interest,time;
    Button btn;
    TextView txt1;

    public  void OnCLick()
    {
        princ=(EditText)findViewById(R.id.princ);
        interest=(EditText)findViewById(R.id.interest);
        time=(EditText)findViewById(R.id.time);
        btn=(Button)findViewById(R.id.btn);
        txt1=(TextView)findViewById(R.id.txt1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                float a=Integer.parseInt(princ.getText().toString());
                float b=Integer.parseInt(interest.getText().toString());
                double c=Integer.parseInt(time.getText().toString());
                double d;
                d= a* (Math.pow((1+b/100),c));


                txt1.setText(String.valueOf(d));


            }
        });
    }
}
