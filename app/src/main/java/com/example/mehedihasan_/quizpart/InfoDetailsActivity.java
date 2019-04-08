package com.example.mehedihasan_.quizpart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoDetailsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_details);
        getSupportActionBar().setTitle("Computer Hard. & Sof. info");


        imageView = (ImageView) findViewById(R.id.imageViewId);
        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String itemName = bundle.getString("name");
            showDetails(itemName);
        }

    }

    void showDetails(String itemName){
        if(itemName.equals("cpu")){
            imageView.setImageResource(R.drawable.cpu);
            textView.setText(R.string.cpu_text);
        }
        if(itemName.equals("motherboard")){
            imageView.setImageResource(R.drawable.motherboard);
            textView.setText(R.string.motherboard_text);
        }
        if(itemName.equals("ram")){
            imageView.setImageResource(R.drawable.ram);
            textView.setText(R.string.ram_text);
        }
        if(itemName.equals("rom")){
            imageView.setImageResource(R.drawable.rom);
            textView.setText(R.string.rom_text);
        }
        if(itemName.equals("power")){
            imageView.setImageResource(R.drawable.power);
            textView.setText(R.string.power_text);
        }
        if(itemName.equals("videocard")){
            imageView.setImageResource(R.drawable.videocard);
            textView.setText(R.string.videocard_text);
        }
        if(itemName.equals("hardware")){
            imageView.setImageResource(R.drawable.hardware);
            textView.setText(R.string.hardware_text);
        }
        if(itemName.equals("software")){
            imageView.setImageResource(R.drawable.software);
            textView.setText(R.string.software_text);
        }
        if(itemName.equals("harddrive")){
            imageView.setImageResource(R.drawable.harddrive);
            textView.setText(R.string.harddrive_text);
        }
        if(itemName.equals("cardreader")){
            imageView.setImageResource(R.drawable.cardreader);
            textView.setText(R.string.cardreader_text);
        }
        if(itemName.equals("monitor")){
            imageView.setImageResource(R.drawable.monitor);
            textView.setText(R.string.monitor_text);
        }
        if(itemName.equals("keyboard")){
            imageView.setImageResource(R.drawable.keyboard);
            textView.setText(R.string.keyboard_text);
        }
        if(itemName.equals("mouse")){
            imageView.setImageResource(R.drawable.mouse);
            textView.setText(R.string.mouse_text);
        }
        if(itemName.equals("printer")){
            imageView.setImageResource(R.drawable.printer);
            textView.setText(R.string.printer_text);
        }
        if(itemName.equals("modem")){
            imageView.setImageResource(R.drawable.modem);
            textView.setText(R.string.modem_text);
        }
        if(itemName.equals("router")){
            imageView.setImageResource(R.drawable.router);
            textView.setText(R.string.router_text);
        }
        if(itemName.equals("firewall")){
            imageView.setImageResource(R.drawable.firewall);
            textView.setText(R.string.firewall_text);
        }
        if(itemName.equals("speaker")){
            imageView.setImageResource(R.drawable.speaker);
            textView.setText(R.string.speaker_text);
        }
        if(itemName.equals("optical")){
            imageView.setImageResource(R.drawable.opticaldrive);
            textView.setText(R.string.optical_text);
        }
        if(itemName.equals("external")){
            imageView.setImageResource(R.drawable.externaldrive);
            textView.setText(R.string.external_text);
        }
        if(itemName.equals("memory")){
            imageView.setImageResource(R.drawable.memory);
            textView.setText(R.string.memory_text);
        }
        if(itemName.equals("cache")){
            imageView.setImageResource(R.drawable.cache_memory);
            textView.setText(R.string.cache_text);
        }
    }
}
