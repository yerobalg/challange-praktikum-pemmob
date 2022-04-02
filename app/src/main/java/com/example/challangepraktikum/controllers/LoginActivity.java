package com.example.challangepraktikum.controllers;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import com.example.challangepraktikum.R;

public class LoginActivity extends AppCompatActivity {
    private EditText et_email, et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        et_email =
                findViewById(R.id.editTextTextEmailAddress);
        et_password =
                findViewById(R.id.editTextTextPassword);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String email = et_email.getText().toString();
                String password =
                        et_password.getText().toString();
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Email dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if
                (email.equals("purbageoffrey17@gmail.com") & password.equals("205150707111007")) {
                    Toast.makeText(LoginActivity.this,
                            "Berhasil Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new
                            Intent(LoginActivity.this, ContactActivity.class);
                    intent.putExtra("email_key", email);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
