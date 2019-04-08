package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button infoButton;
    private Button quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");

        infoButton = (Button) findViewById(R.id.infoButtonId);
        quizButton = (Button) findViewById(R.id.quizButtonId);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,InfoActivity.class);
                startActivity(intent);
            }
        });
        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,StudentAdmin.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.aboutusId){
            Intent intent = new Intent(Home.this,About.class);
            startActivity(intent);
            return true;
        }if(id==R.id.shareId){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "Quiz on Computer Hardware & Software info. app";
            String body = "This is a learning type app. From this app we can easily learn Computer Hardware & Software part.\n" +
                    "com.example.mehedihasan_.quizoncomputerhardwaresoftware";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share With"));

            return super.onOptionsItemSelected(item);
        }if(id==R.id.feedbackId){
            Intent intent = new Intent(Home.this,Feedback.class);
            startActivity(intent);

            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
