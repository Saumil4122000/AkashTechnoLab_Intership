package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrtationActivity extends AppCompatActivity {
    EditText name,email,password,mobile;
    Button login,register;
    public static final String main_key="my_pref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String contact_key="contactkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrtation);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.psw);
        mobile=findViewById(R.id.phone);

        register=findViewById(R.id.register);
        login=findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                String userName=name.getText().toString();
                String userEmail=email.getText().toString();
                String userPhone=mobile.getText().toString();
                String psw=password.getText().toString();

                SharedPreferences.Editor editor=preferences.edit();
                editor.putString(name_key,userName);
                editor.putString(email_key,userEmail);
                editor.putString(contact_key,userPhone);
                editor.putString(password_key,psw);

                editor.commit();

                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}