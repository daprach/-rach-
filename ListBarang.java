package com.example.uasrks_ariyankt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListBarang extends AppCompatActivity {
    protected Cursor cursor;
    Button beli;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_barang);

        beli = (Button) findViewById(R.id.beli);

        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ListBarang.this, Pembayaran.class);
                startActivity(inte);
            }
        });

    }
}