package com.paulbina.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activitate2 extends AppCompatActivity{

    private Button button;
    private Button bere;
    private Button pui;
    private Button peste;
    private Button soda;
    private Button mic_dejun;
    private Button water;
    private Button porc;
    private Button paste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate2);

        button = findViewById(R.id.NotaPlata);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlegerePersoana();
            }
        });
        bere = findViewById(R.id.beer);
        bere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBeer();
            }
        });
        water = findViewById(R.id.water);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openWater();}
        });
        soda = findViewById(R.id.soda);
        soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openSoda();}
        });
        pui = findViewById(R.id.pui);
        pui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPui();
            }
        });
        porc = findViewById(R.id.porc);
        porc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPorc();
            }
        });
        peste = findViewById(R.id.peste);
        peste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPeste();
            }
        });
        mic_dejun = findViewById(R.id.mic_dejun);
        mic_dejun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMic_dejun();
            }
        });
        paste = findViewById(R.id.paste);
        paste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPaste();
            }
        });

    }
    public void openAlegerePersoana(){
        Intent intent = new Intent( this, AlegerePersoanaActivity.class);
        startActivity(intent);
    }
    public void openBeer(){
        Intent intent = new Intent(this, BeerActivity.class);
        startActivity(intent);
    }
    public void openWater(){
        Intent intent = new Intent( this, water.class);
        startActivity(intent);
    }
    public void openSoda() {
        Intent intent = new Intent(this, SodaActivity.class);
        startActivity(intent);
    }
    public void openPui() {
        Intent intent = new Intent(this, PuiActivity.class);
        startActivity(intent);
    }
    public void openPorc(){
        Intent intent = new Intent(this, PorcActivity.class);
        startActivity(intent);
    }
    public void openPeste(){
        Intent intent = new Intent(this, PesteActivity.class);
        startActivity(intent);
    }
    public void openMic_dejun(){
        Intent intent = new Intent(this, Mic_dejunActivity.class);
        startActivity(intent);
    }
    public void openPaste(){
        Intent intent = new Intent(this, PasteActivity.class);
        startActivity(intent);
    }
}