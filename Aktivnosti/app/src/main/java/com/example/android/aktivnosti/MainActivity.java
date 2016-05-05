package com.example.android.aktivnosti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OtvoriDruguAktivnost(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true
                ;
    }

    @Override
    public boolean
    onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.druga_aktivnost) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}