package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Admin extends AppCompatActivity {

    private EditText adminName, adminPassword;
    private Button loginButton;
    private TextView textView;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().setTitle("Admin Login");

        adminName = (EditText) findViewById(R.id.adminNameId);
        adminPassword = (EditText) findViewById(R.id.adminPasswordId);
        loginButton = (Button) findViewById(R.id.loginButtonId);
        textView = (TextView) findViewById(R.id.attemptsId);
        textView.setText("Number of attempts remaining:3");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String adminname = adminName.getText().toString();
                String adminpassword = adminPassword.getText().toString();
                if(adminname.equals("admin") && adminpassword.equals("1234")){

                    Intent intent = new Intent(Admin.this,MainActivity.class);
                    startActivity(intent);
                }else {
                    counter--;
                    textView.setText("Number of attempts remaining: "+counter);
                    if(counter==0){
                        loginButton.setEnabled(false);
                    }
                }

            }
        });
    }
}

