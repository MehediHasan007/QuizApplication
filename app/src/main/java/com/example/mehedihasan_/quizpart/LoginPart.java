package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPart extends AppCompatActivity implements View.OnClickListener{

    DatabaseHelper databaseHelper;

    EditText emailid,passid;
    Button loginButton;
    Cursor cursor;

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_part);
        getSupportActionBar().setTitle("Login");

        databaseHelper = new DatabaseHelper(this);
        db = databaseHelper.getWritableDatabase();

        emailid = (EditText) findViewById(R.id.emailId);
        passid = (EditText) findViewById(R.id.passwordId);
        loginButton = (Button) findViewById(R.id.loginButtonId);

        loginButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String email = emailid.getText().toString();
        String pass = passid.getText().toString();

        cursor = db.rawQuery(" SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.EMAIL + " =? AND " + DatabaseHelper.PASSWORD + "=?",new String[]{email,pass});
        if(cursor != null){
            if(cursor.getCount()>0){
                cursor.moveToNext();
                Toast.makeText(getApplicationContext(),"Login successfull ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginPart.this,StartingScreenActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(getApplicationContext(),"Error ",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
