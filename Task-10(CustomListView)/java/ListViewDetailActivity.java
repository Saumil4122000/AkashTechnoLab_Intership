package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewDetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_detail);
        imageView=findViewById(R.id.ivimage);
        textView=findViewById(R.id.tvnamedetail);
        Intent intent=getIntent();
        int image=intent.getIntExtra("image",R.drawable.img1);
        imageView.setImageResource(image);
        String name=intent.getStringExtra("name");
        textView.setText(name);
    }
}