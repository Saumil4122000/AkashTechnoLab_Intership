package com.example.callactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EdEmail,EdMessage,EdSubject;
    Button button;


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button = findViewById(R.id.button);
            EdEmail = findViewById(R.id.email);
             EdMessage= findViewById(R.id.message);
             EdSubject=findViewById(R.id.subject);
             button=findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg)
                {
                    String to = EdEmail.getText().toString();
                    String Subject = EdSubject.getText().toString();
                    String message = EdMessage.getText().toString();
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_EMAIL,to);
                    i.putExtra(Intent.EXTRA_SUBJECT,Subject);
                    i.putExtra(Intent.EXTRA_TEXT,message);

                    try {
                        startActivity(Intent.createChooser(i,"Send Email :"));
                        finish();
                    }
                    catch (android.content.ActivityNotFoundException e){
                        Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                    }


                }
            });
        }
}