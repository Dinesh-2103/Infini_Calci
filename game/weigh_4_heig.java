package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weigh_4_heig extends AppCompatActivity {

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_weigh4_heig);

        OnCLick();
    }

    EditText height;
    Button btn;
    TextView Wm;

    public  void OnCLick()
    {
        height=(EditText)findViewById(R.id.height);

        btn=(Button)findViewById(R.id.btn);
        Wm=(TextView)findViewById(R.id.Wm);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View v) {
                double a =Integer.parseInt(height.getText().toString());
                double inch=a/2.54;
                double male;
                male=5.4*inch-228.7;
                double Mres= male/2.205;


                Wm.setText("Average Weight for Height:"+String.valueOf(Mres));

            }
        });
    }
}
