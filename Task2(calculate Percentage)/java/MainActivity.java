package com.example.calculatepercentage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                average();
            }
        });
    }

    private void average() {
        EditText ed1,ed2,ed3,ed4,ed5;
        ed1=findViewById(R.id.edt1);
        ed2=findViewById(R.id.edt2);
        ed3=findViewById(R.id.edt3);
        ed4=findViewById(R.id.edt4);
        ed5=findViewById(R.id.edt5);

        int num1=Integer.parseInt(ed1.getText().toString());
        int num2=Integer.parseInt(ed2.getText().toString());
        int num3=Integer.parseInt(ed3.getText().toString());
        int num4=Integer.parseInt(ed4.getText().toString());
        int num5=Integer.parseInt(ed5.getText().toString());

        float average=(num1+num2+num3+num4+num5)/(float)5;

        Toast.makeText(getApplicationContext(),"Average: "+average,Toast.LENGTH_LONG).show();
    }
}