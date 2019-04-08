package com.example.mehedihasan_.quizpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button cpuButton,motherboardButton,ramButton,romButton,powerButton,videocardButton,hardwareButton,softwareButton,
            harddriveButton,cardreaderButton,monitorButton,keyboardButton,mouseButton,printerButton,modemButton,routerButton,
            firewallButton,speakerButton,opticalButton,externalButton,memoryButton,cacheButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().setTitle("Computer Hard. & Sof. info");

        cpuButton = (Button) findViewById(R.id.cpuButtonId);
        motherboardButton = (Button) findViewById(R.id.motherboardButtonId);
        ramButton = (Button) findViewById(R.id.ramButtonId);
        romButton = (Button) findViewById(R.id.romButtonId);
        powerButton = (Button) findViewById(R.id.powerButtonId);
        videocardButton = (Button) findViewById(R.id.videocardButtonId);
        hardwareButton = (Button) findViewById(R.id.hardwareButtonId);
        softwareButton = (Button) findViewById(R.id.softwareButtonId);
        harddriveButton = (Button) findViewById(R.id.harddriveButtonId);
        cardreaderButton = (Button) findViewById(R.id.cardreaderButtonId);
        monitorButton = (Button) findViewById(R.id.monitorButtonId);
        keyboardButton = (Button) findViewById(R.id.keyboardButtonId);
        mouseButton = (Button) findViewById(R.id.mouseButtonId);
        printerButton = (Button) findViewById(R.id.printerButtonId);
        modemButton = (Button) findViewById(R.id.modemButtonId);
        routerButton = (Button) findViewById(R.id.routerButtonId);
        firewallButton = (Button) findViewById(R.id.firewallButtonId);
        speakerButton = (Button) findViewById(R.id.speakerButtonId);
        opticalButton = (Button) findViewById(R.id.opticalButtonId);
        externalButton = (Button) findViewById(R.id.externalButtonId);
        memoryButton = (Button) findViewById(R.id.memoryButtonId);
        cacheButton = (Button) findViewById(R.id.cacheButtonId);

        cpuButton.setOnClickListener(this);
        motherboardButton.setOnClickListener(this);
        ramButton.setOnClickListener(this);
        romButton.setOnClickListener(this);
        powerButton.setOnClickListener(this);
        videocardButton.setOnClickListener(this);
        hardwareButton.setOnClickListener(this);
        softwareButton.setOnClickListener(this);
        harddriveButton.setOnClickListener(this);
        cardreaderButton.setOnClickListener(this);
        monitorButton.setOnClickListener(this);
        keyboardButton.setOnClickListener(this);
        mouseButton.setOnClickListener(this);
        printerButton.setOnClickListener(this);
        modemButton.setOnClickListener(this);
        routerButton.setOnClickListener(this);
        firewallButton.setOnClickListener(this);
        speakerButton.setOnClickListener(this);
        opticalButton.setOnClickListener(this);
        externalButton.setOnClickListener(this);
        memoryButton.setOnClickListener(this);
        cacheButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.cpuButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","cpu");
            startActivity(intent);
        }
        if(v.getId() == R.id.motherboardButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","motherboard");
            startActivity(intent);
        }
        if(v.getId() == R.id.ramButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","ram");
            startActivity(intent);
        }
        if(v.getId() == R.id.romButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","rom");
            startActivity(intent);
        }
        if(v.getId() == R.id.powerButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","power");
            startActivity(intent);
        }if(v.getId() == R.id.videocardButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","videocard");
            startActivity(intent);
        }
        if(v.getId() == R.id.hardwareButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","hardware");
            startActivity(intent);
        }
        if(v.getId() == R.id.softwareButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","software");
            startActivity(intent);
        }
        if(v.getId() == R.id.harddriveButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","harddrive");
            startActivity(intent);
        }
        if(v.getId() == R.id.cardreaderButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","cardreader");
            startActivity(intent);
        }
        if(v.getId() == R.id.monitorButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","monitor");
            startActivity(intent);
        }
        if(v.getId() == R.id.keyboardButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","keyboard");
            startActivity(intent);
        }
        if(v.getId() == R.id.mouseButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","mouse");
            startActivity(intent);
        }
        if(v.getId() == R.id.printerButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","printer");
            startActivity(intent);
        }
        if(v.getId() == R.id.modemButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","modem");
            startActivity(intent);
        }
        if(v.getId() == R.id.routerButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","router");
            startActivity(intent);
        }
        if(v.getId() == R.id.firewallButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","firewall");
            startActivity(intent);
        }
        if(v.getId() == R.id.speakerButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","speaker");
            startActivity(intent);
        }
        if(v.getId() == R.id.opticalButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","optical");
            startActivity(intent);
        }
        if(v.getId() == R.id.externalButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","external");
            startActivity(intent);
        }
        if(v.getId() == R.id.memoryButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","memory");
            startActivity(intent);
        }
        if(v.getId() == R.id.cacheButtonId){
            intent = new Intent(InfoActivity.this,InfoDetailsActivity.class);
            intent.putExtra("name","cache");
            startActivity(intent);
        }
    }
}
