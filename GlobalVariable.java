package com.paulbina.restaurant;

import android.app.Application;

public class GlobalVariable extends Application {

    public int suma;

    public String getSuma() {
        String s = String.valueOf(this.suma);
        return s;
    }

    public void setSuma(int suma) {
        this.suma += suma;
    }
}
