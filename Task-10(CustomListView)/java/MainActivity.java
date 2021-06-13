package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    int images[]={R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6};
    String name[]={"This is Orange","This is lemon","This is Strawberry","This is pineapple","This is kevvi","This is coconut"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),images,name);
        lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),ListViewDetailActivity.class);
                intent.putExtra("image",images[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}