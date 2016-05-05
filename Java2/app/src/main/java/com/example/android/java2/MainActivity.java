package com.example.android.java2;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.java2.R;

import java.text.NumberFormat;
/**
 * metoda koja prikazuje naruđbu naručene kave.
 */
public class MainActivity extends ActionBarActivity {
    int kolicina = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * metoda se poziva pritiskom na dugme.
     */
    public void submitOrders(View view) {

        int cijena = racunanjeCijene();
        String porukaCijene = "Cijena: " + cijena + "kn";
        displayMassage(porukaCijene);

    }

    /**
     * metoda koja prikazuje količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
    /**
     * metoda koja prikazuje cijenu na ekranu.
     */



    private int racunanjeCijene() {
        int cijena = kolicina*6;
        return cijena;
    }

    /**
     * Računanje cijene naruđbe .
     *
     * @param kolicina je broj naručenih kava
     */


    private void displayMassage(String massage) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(massage);
    }

    /**
     * metoda za dugme plus.
     */
    public void increment(View view) {
        kolicina = kolicina + 1;
        display(kolicina);
    }

    /**
     * metoda za dugme minus.
     */
    public void decrement(View view) {
        kolicina = kolicina - 1;
        display(kolicina);
    }

}