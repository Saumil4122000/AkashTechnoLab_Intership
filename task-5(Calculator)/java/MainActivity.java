package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button op1,op2,op3,op4;
    TextView tv1,tv2;
    EditText ed1,ed2;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1=findViewById(R.id.op1);
        op2=findViewById(R.id.op2);
        op3=findViewById(R.id.op3);
        op4=findViewById(R.id.op4);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);


        ed1=findViewById(R.id.edt1);
        ed2=findViewById(R.id.edt2);


        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addition();
            }
        });

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                substraction();
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplication();
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                division();
            }
        });
    }

    private void division() {
        num1=Integer.parseInt(ed1.getText().toString());
        num2=Integer.parseInt(ed2.getText().toString());
        tv1.setVisibility(View.VISIBLE);
        tv1.setText("Devision is: ");
        tv2.setVisibility(View.VISIBLE);
        try {
            int ans=num1/num2;
            String result=Integer.toString(ans);
            tv2.setText(result);
        }
        catch (ArithmeticException e){
            tv2.setText("Can't be devide by zero");
        }

    }

    private void multiplication() {
        num1=Integer.parseInt(ed1.getText().toString());
        num2=Integer.parseInt(ed2.getText().toString());
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv1.setText("Multiplication is: ");
        int ans=num1*num2;
        String result=Integer.toString(ans);
        tv2.setText(result);
    }

    private void substraction() {
        num1=Integer.parseInt(ed1.getText().toString());
        num2=Integer.parseInt(ed2.getText().toString());
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv1.setText("substraction is: ");
        int ans=num1-num2;
        String result=Integer.toString(ans);
        tv2.setText(result);
    }

    private void addition() {
        num1=Integer.parseInt(ed1.getText().toString());
        num2=Integer.parseInt(ed2.getText().toString());
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv1.setText("addition is: ");
        int ans=num1+num2;
        String result=Integer.toString(ans);
        tv2.setText(result);
    }
}