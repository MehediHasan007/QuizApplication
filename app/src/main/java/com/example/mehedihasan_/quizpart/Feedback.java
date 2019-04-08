package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity implements View.OnClickListener{

    private Button sendButton, clearButton;
    private EditText name, feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setTitle("Feedback");

        sendButton = (Button) findViewById(R.id.sendButtonId);
        clearButton = (Button) findViewById(R.id.clearButtonId);

        name = (EditText) findViewById(R.id.nameId);
        feedback = (EditText) findViewById(R.id.feedbackId);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }
    public void onClick(View v) {

        try {
            if (v.getId() == R.id.sendButtonId) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mehedihasancste@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from app");
                intent.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\n Message: " + feedback);
                startActivity(Intent.createChooser(intent, "Feedback With"));

            }else if (v.getId() == R.id.clearButtonId) {
                name.setText("");
                feedback.setText("");
            }

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception: "+e,Toast.LENGTH_SHORT).show();
        }


    }
}
