package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PorcActivity extends AppCompatActivity {

    Button porc1;
    Button porc2;
    Button porc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porc);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        porc1 = findViewById(R.id.porc1);
        porc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(23);
            }
        });
        porc2 = findViewById(R.id.porc2);
        porc2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globalVariable.setSuma(24);
            }
        });
        porc3 = findViewById(R.id.porc3);
        porc3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                globalVariable.setSuma(25);
            }
        });
    }
}