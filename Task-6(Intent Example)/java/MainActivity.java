package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;
    CheckBox pizza,coffee,burger,tea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerButton();
    }

    private void addListenerButton() {
        radioGroup = findViewById(R.id.groupradio);
        button = findViewById(R.id.submit);
        StringBuilder hobby=new StringBuilder();
        EditText edt1=findViewById(R.id.name);
        EditText ed2=findViewById(R.id.email);
        EditText ed3=findViewById(R.id.phone);
        EditText ed4=findViewById(R.id.psw);
        pizza = findViewById(R.id.checkBox);
        coffee = findViewById(R.id.checkBox2);
        burger = findViewById(R.id.checkBox3);
        tea=findViewById(R.id.checkBox4);
        button.setOnClickListener(v -> {
            int selectedID = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(selectedID);
            String gender= radioButton.getText().toString();
            String name=edt1.getText().toString();
            String email=ed2.getText().toString();
            String phone=ed3.getText().toString();
            String password=ed4.getText().toString();
            if (pizza.isChecked()) {
                hobby.append("\nPizza ");

            }
            if (coffee.isChecked()) {
                hobby.append("\nCoffe ");

            }
            if (burger.isChecked()) {
                hobby.append("\nBurger ");
            }
            if (tea.isChecked()) {
                hobby.append("\nTea ");
            }

//            Log.v("Details Of order",name+"\n"+email+"\n"+phone+"\n"+password+"\n"+gender+"\n"+hobby);

            Intent intent = new Intent(MainActivity.this,DetailsPage.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("phone", phone);
            intent.putExtra("password", password);
            intent.putExtra("gender", gender);
            intent.putExtra("hobby", (CharSequence) hobby);

            startActivity(intent);


//         Toast.makeText(getApplicationContext(),name+"\n"+email+"\n"+phone+"\n"+password+"\n"+gender+"\n"+hobby,Toast.LENGTH_LONG).show();
        });
    }
}