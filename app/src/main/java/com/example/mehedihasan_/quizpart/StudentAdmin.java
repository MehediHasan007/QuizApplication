package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentAdmin extends AppCompatActivity implements View.OnClickListener {

    private Button adminButton,studentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_admin);
        getSupportActionBar().setTitle("Student and Admin");

        adminButton = (Button) findViewById(R.id.adminButtonID);
        studentButton = (Button) findViewById(R.id.studentButtonID);
        adminButton.setOnClickListener(this);
        studentButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.getId()==R.id.adminButtonID){
            Intent intent = new Intent(StudentAdmin.this,Admin.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.studentButtonID){
            Intent intent = new Intent(StudentAdmin.this,SecondMainActivity.class);
            startActivity(intent);
        }

    }
}
