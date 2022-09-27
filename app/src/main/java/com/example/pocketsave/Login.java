package com.example.pocketsave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void redirigirHome (View view){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
    public void redirigirRegister (View view){
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }
}