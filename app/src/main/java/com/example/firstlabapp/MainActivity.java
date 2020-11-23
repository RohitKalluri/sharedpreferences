package com.example.firstlabapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        press=(Button)findViewById(R.id.btn);
    }
    public void press(View view){
        new MyDataBaseManager(this);
        startActivity(new Intent(this,InsertDataActivity.class));
    }
}