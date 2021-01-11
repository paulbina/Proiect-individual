package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PesteActivity extends AppCompatActivity {

    Button peste1;
    Button peste2;
    Button peste3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peste);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        peste1 = findViewById(R.id.peste1);
        peste1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(20);
            }
        });
        peste2 = findViewById(R.id.peste2);
        peste2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(21);
            }
        });
        peste3 = findViewById(R.id.peste3);
        peste3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(22);
            }
        });
    }
}