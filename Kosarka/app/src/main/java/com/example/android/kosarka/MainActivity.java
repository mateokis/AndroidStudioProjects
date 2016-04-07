package com.example.android.kosarka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rezultatDomaci(1);
    }
    /**
     * prikazuje rezultat domaćih.
     */
    public void rezultatDomaci(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    public void plustridomaci(View view) {
        int rezultat = 3;
        rezultatDomaci(rezultat);
    }
    public void plusdvadomaci(View view) {
        int rezultat = 2;
        rezultatDomaci(rezultat);
    }
    public void slobodnobacanjedomaci(View view) {
        int rezultat = 1;
        rezultatDomaci(rezultat);
}
}
