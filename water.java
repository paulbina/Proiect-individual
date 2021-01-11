package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class water extends AppCompatActivity {

    Button apa1;
    Button apa2;
    Button apa3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        apa1 = findViewById(R.id.water1);
        apa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(4);
            }
        });
        apa2 = findViewById(R.id.water2);
        apa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(4);
            }
        });
        apa3 = findViewById(R.id.water3);
        apa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(8);
            }
        });
    }
}