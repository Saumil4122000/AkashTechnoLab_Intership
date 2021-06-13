package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    public static final String main_key="my_pref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String contact_key="contactkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tv1=findViewById(R.id.name);
//        tv2.findViewById(R.id.password);
        tv3=findViewById(R.id.email);
        tv4=findViewById(R.id.phone);

        SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);

        String userName=preferences.getString(name_key,"");
        String psw=preferences.getString(password_key,"");
        String email=preferences.getString(email_key,"");
        String phone=preferences.getString(contact_key,"");

        tv1.setText(userName);
//        tv2.setText(psw);
        tv3.setText(email);
        tv4.setText(phone);
    }
}