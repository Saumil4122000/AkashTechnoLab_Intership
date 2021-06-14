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
    EditText edittext;
    Button button;
    private static final int REQUEST_PHONE_CALL = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button = findViewById(R.id.button);
            edittext = findViewById(R.id.editText);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg)
                {
                    String phone_number = edittext.getText().toString();
                    Intent phone_intent = new Intent(Intent.ACTION_CALL);
                    phone_intent.setData(Uri.parse("tel:" + phone_number));
                    if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(phone_intent);
                    }

                }
            });
        }
}