package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PasteActivity extends AppCompatActivity {


    Button paste1;
    Button paste2;
    Button paste3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paste);

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        paste1 = findViewById(R.id.paste1);
        paste1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(17);
            }
        });
        paste2 = findViewById(R.id.paste2);
        paste2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(18);
            }
        });
        paste3 = findViewById(R.id.paste3);
        paste3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalVariable.setSuma(19);
            }
        });

        };
}
