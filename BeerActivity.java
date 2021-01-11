package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class BeerActivity extends AppCompatActivity {

    Button bere1;
    Button bere2;
    Button bere3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        bere1 = findViewById(R.id.beer1);
        bere1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(10);
            }
        });

        bere2 = findViewById(R.id.beer2);
        bere2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(11);
            }
        });

        bere3 = findViewById(R.id.beer3);
        bere3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globalVariable.setSuma(12);
            }
        });


    }
}