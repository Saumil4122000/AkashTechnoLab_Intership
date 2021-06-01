package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        TextView tv1,tv2,tv3,tv4,tv5,tv6;

        tv1=findViewById(R.id.name);
        tv2=findViewById(R.id.gender);
        tv3=findViewById(R.id.hobby);
        tv4=findViewById(R.id.email);
        tv5=findViewById(R.id.phone);
        tv6=findViewById(R.id.password);
        String name=getIntent().getStringExtra("name");
        String email=getIntent().getStringExtra("email");
        String phone=getIntent().getStringExtra("phone");
        String password=getIntent().getStringExtra("password");
        String gender=getIntent().getStringExtra("gender");
       String  hobby= (String) getIntent().getCharSequenceExtra("hobby");

        tv1.setText(name);
        tv2.setText(gender);
       tv3.setText(hobby);
        tv4.setText(email);
        tv5.setText(phone);
        tv6.setText(password);

    }
}