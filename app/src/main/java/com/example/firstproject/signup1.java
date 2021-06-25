package com.example.firstproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup1 extends AppCompatActivity {
    TextView output1;
    EditText username_1,password_1,email,phone_no;
    Button s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);
        output1=findViewById(R.id.output);
        username_1=findViewById(R.id.u_name);
        password_1=findViewById(R.id.Pass1);
        email=findViewById(R.id.mail_id);
        phone_no=findViewById(R.id.phone_no);
        s=findViewById(R.id.sign);
    }


    public void onClick(View v) {
        String name1=username_1.getText().toString(),Password1=password_1.getText().toString(),p=phone_no.getText().toString(),e=email.getText().toString();
        output1.setText(name1+Password1+p+e);
        Toast.makeText(signup1.this,name1+"\n"+Password1+"\n"+p+"\n"+e, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),signup1.class);
        startActivity(intent);
    }
}