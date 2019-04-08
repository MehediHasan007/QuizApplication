package com.example.mehedihasan_.quizpart;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText question,option1,option2,option3,correctOption;
    private Button saveButton;

    QuizDbHelper quizDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Quiz Input");

        quizDbHelper = new QuizDbHelper(this);
        quizDbHelper.getWritableDatabase();

        question = (EditText) findViewById(R.id.questionId);
        option1 = (EditText) findViewById(R.id.option1Id);
        option2 = (EditText) findViewById(R.id.option2Id);
        option3 = (EditText) findViewById(R.id.option3Id);
        correctOption = (EditText) findViewById(R.id.correctOptionId);

        saveButton = (Button) findViewById(R.id.saveButtonId);
        saveButton.setOnClickListener(this);
    }

    public void onClick(View v) {

        if(question.length()==0){
            question.setError("Enter Question");
        }else if(option1.length()==0){
            option1.setError("Enter Option 1");
        }else if(option2.length()==0){
            option2.setError("Enter Option 2");
        }else if(option3.length()==0){
            option3.setError("Enter Option ");
        }else if(correctOption.length()==0){
            correctOption.setError("Enter Correct Option");
        }else {
            String q = question.getText().toString();
            String op1 = option1.getText().toString();
            String op2 = option2.getText().toString();
            String op3 = option3.getText().toString();
            String crop = correctOption.getText().toString();

            if(v.getId()==R.id.saveButtonId){
                long rowId = quizDbHelper.addQuestion(q,op1,op2,op3,crop);
                if(rowId==-1){
                    Toast.makeText(getApplicationContext()," Unsuccessfull inserted",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(),"Row "+rowId+"is successfully inserted",Toast.LENGTH_SHORT).show();
                }

            }


        }

    }

}
