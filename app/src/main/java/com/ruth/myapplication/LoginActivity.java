package com.ruth.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import com.ruth.myapplication.R;
        import com.ruth.myapplication.ContainerActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent= new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
