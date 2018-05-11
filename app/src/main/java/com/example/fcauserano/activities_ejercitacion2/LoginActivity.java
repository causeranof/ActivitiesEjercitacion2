package com.example.fcauserano.activities_ejercitacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public static final String CLAVE_USERNAME = "claveUsername";
    private TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.usernameRecibido);

        Bundle bundle = getIntent().getExtras();
        username.setText("¡Welcome " + bundle.getString(CLAVE_USERNAME) + "!");

    }
}
