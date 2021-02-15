package com.example.uasrks_ariyankt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    protected Cursor cursor;
    Button login, create;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.user_login);
        pass = (EditText) findViewById(R.id.pw_login);
        login = (Button) findViewById(R.id.btn_login_login);
        create = (Button) findViewById(R.id.btn_register_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(Login.this, Toko.class);
                startActivity(inte);
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(Login.this, Register.class);
                startActivity(inte);
            }
        });
    }
}