package com.example.squareofnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
                squareOfNumber();
            }
        });
    }

    private void squareOfNumber() {
        EditText edt1=findViewById(R.id.edt1);
        EditText edt2=findViewById(R.id.edt2);
        TextView textView=findViewById(R.id.textview);
        int num1=Integer.parseInt(edt1.getText().toString());
        Log.v("SQAREOFNUMBER","Answer "+num1*num1);

        String s=Integer.toString(num1*num1);
        if(num1>10){
            Toast.makeText(getApplicationContext(),"Please Enter Number between 1 to 10",Toast.LENGTH_LONG).show();
        }
        else{
            textView.setVisibility(View.VISIBLE);
            edt2.setVisibility(View.VISIBLE);
            edt2.setText(s);
        }

    }
}