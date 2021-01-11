package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlegerePersoanaActivity extends AppCompatActivity {
    private Button buton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alegere_persoana);

        buton = findViewById(R.id.BackToMeniu);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitate2();
            }
        });

        GlobalVariable globalVariable= (GlobalVariable) getApplicationContext();

        TextView suma = findViewById(R.id.Suma);

        suma.setText(globalVariable.getSuma());
    }

    public void openActivitate2() {
        Intent intent = new Intent(this, Activitate2.class);
        startActivity(intent);
    }
}
