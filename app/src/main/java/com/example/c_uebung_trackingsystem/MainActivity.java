package com.example.c_uebung_trackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
//Intent
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Kommentar Pilger
        //Ende
        final ListView trackinglist = (ListView)findViewById(R.id.listView);

        

    }
}
