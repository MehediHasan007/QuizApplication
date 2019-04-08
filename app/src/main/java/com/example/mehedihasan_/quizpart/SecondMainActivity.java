package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondMainActivity extends AppCompatActivity implements View.OnClickListener{

    DatabaseHelper databaseHelper;


    EditText nameId,passwordId,emailId;
    Button regButton,loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        getSupportActionBar().setTitle("Registration and Login");

        databaseHelper = new DatabaseHelper(this);
        SQLiteDatabase db = databaseHelper.getWritableDatabase();

        nameId = (EditText) findViewById(R.id.textnameId);
        passwordId = (EditText) findViewById(R.id.textpasswordId);
        emailId = (EditText) findViewById(R.id.textemailId);

        regButton = (Button) findViewById(R.id.regButtonId);
        loginButton = (Button) findViewById(R.id.loginButtonId);

        regButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String email = emailId.getText().toString().trim();

        if(nameId.length()==0){
            nameId.setError("Enter Name");
        }else if(passwordId.length()==0){
            passwordId.setError("Enter Password");
        }else if(!email.matches( "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" )){
            emailId.setError("Enter Valid email");
        } else {

            String name = nameId.getText().toString();
            String pass = passwordId.getText().toString();



            if (v.getId() == R.id.regButtonId) {
                long rowId = databaseHelper.insertData(name, pass, email);
                if (rowId == -1) {
                    Toast.makeText(getApplicationContext(), "Registration Unsuccessfull ", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Registration " + rowId + "is successfully ", Toast.LENGTH_SHORT).show();
                }

            }

        }

        if(v.getId()==R.id.loginButtonId){
            Intent intent = new Intent(SecondMainActivity.this,LoginPart.class);
            startActivity(intent);
        }

    }
}

