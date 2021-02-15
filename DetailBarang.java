package com.example.uasrks_ariyankt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailBarang extends AppCompatActivity {
    protected Cursor cursor;
    Button tbk;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);

        tbk = (Button) findViewById(R.id.tbk);

        tbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(DetailBarang.this, ListBarang.class);
                startActivity(inte);
            }
        });

    }
}