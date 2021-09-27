package com.ruth.myapplication.view.;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ruth.myapplication.view.ContainerActivity;
import com.ruth.myapplication.view.LoginActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityLogin);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, containerActivity.class);
        startActivity(intent);
    }
}