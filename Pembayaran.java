package com.example.uasrks_ariyankt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pembayaran extends AppCompatActivity {
    protected Cursor cursor;
    Button bayar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        bayar = (Button) findViewById(R.id.bayar);

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(Pembayaran.this, PembayaranSukses.class);
                startActivity(inte);
            }
        });

    }
}