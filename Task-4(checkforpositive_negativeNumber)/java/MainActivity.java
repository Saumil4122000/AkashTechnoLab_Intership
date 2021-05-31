package com.example.checkfornumbertype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkForPositiveNumber();
            }
        });
    }

    private void checkForPositiveNumber() {
        ed1=findViewById(R.id.edt1);
        int number=Integer.parseInt(ed1.getText().toString());
        if (number==0){
            Toast.makeText(getApplicationContext(),"You entered zero",Toast.LENGTH_LONG).show();
        }
        else if(number>0){
            Toast.makeText(getApplicationContext(),number+" is positive",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),number+" is negative",Toast.LENGTH_LONG).show();
        }
    }
}