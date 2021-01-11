package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PuiActivity extends AppCompatActivity {

    Button pui1;
    Button pui2;
    Button pui3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pui);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        pui1 = findViewById(R.id.pui1);
        pui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(26);
            }
        });
        pui2 = findViewById(R.id.pui2);
        pui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(27);
            }
        });
        pui3 = findViewById(R.id.pui3);
        pui3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(28);
            }
        });
    }
}