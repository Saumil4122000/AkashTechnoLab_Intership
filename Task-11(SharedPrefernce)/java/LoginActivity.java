package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    Button login,register;
    public static final String main_key="my_pref";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email=findViewById(R.id.email);
        password=findViewById(R.id.psw);

        login=findViewById(R.id.login);
        register=findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=email.getText().toString();
                String psw=password.getText().toString();
                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);

                String userName1=preferences.getString(email_key,"");
                String psw1=preferences.getString(password_key,"");

                if (userName.equals(userName1) && psw.equals(psw1)){
                    Intent i=new Intent(getApplicationContext(),DisplayActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Invalid credential",Toast.LENGTH_LONG).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegistrtationActivity.class);
                startActivity(i);
            }
        });
    }
}