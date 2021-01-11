package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SodaActivity extends AppCompatActivity {


    Button soda1;
    Button soda2;
    Button soda3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        soda1 = findViewById(R.id.soda1);
        soda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(5);
            }
        });
        soda2 = findViewById(R.id.soda2);
        soda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(6);
            }
        });
        soda3 = findViewById(R.id.soda3);
        soda3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(7);
            }
        });
    }
}