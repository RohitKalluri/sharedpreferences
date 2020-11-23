package com.example.firstlabapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertDataActivity extends AppCompatActivity {

    EditText t1,t2,t3;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        t1 = (EditText)findViewById(R.id.etName);
        t2 = (EditText)findViewById(R.id.etMail);
        t3 = (EditText)findViewById(R.id.etMobile);


        save = (Button)findViewById(R.id.btnSave);
    }
    public void addRecord(View view)
    {
        MyDataBaseManager mngr=new MyDataBaseManager(this);
        String res = mngr.addRecord(t1.getText().toString(),t2.getText().toString(),t3.getText().toString());

        Toast.makeText(getApplicationContext(),res+"Thank You", Toast.LENGTH_LONG).show();

        t1.setText("");
        t2.setText("");
        t3.setText("");


    }
}