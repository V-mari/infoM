package com.ruth.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    showToolBar(getString(R.string.Title_crear_cuenta), true);

    }
    public void showToolBar(String titulo, Boolean botonSubir){
        Toolbar toolbar = findViewById(R.id.toolbar);


        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);

    }
}
