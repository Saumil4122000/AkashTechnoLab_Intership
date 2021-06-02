package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.concurrent.ExecutorCompletionService;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Thread thread=new Thread(){
          @Override
          public void run() {
              try {
                  music=MediaPlayer.create(MainActivity.this,R.raw.alarm);
                  music.start();
                  sleep(3000);
              }
              catch (Exception e){
                  e.printStackTrace();
              }
              finally {
                  Intent i=new Intent(getApplicationContext(),WelcomwScreen.class);
                  startActivity(i);
              }
          }
      };
       thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        music.stop();

    }
}