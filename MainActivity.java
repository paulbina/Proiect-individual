package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText text;
    int variabila;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ToMeniu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitate2();
            }
        });

        final GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();
        globalVariable.setSuma(0);
    }
    public void openActivitate2() {
        Intent intent = new Intent (this, Activitate2.class);
        startActivity(intent);
        }


}