package com.example.challangepraktikum.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;

import com.example.challangepraktikum.databinding.LoginBinding;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginBinding binding = LoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(view -> {
            String email =
                    binding.editTextTextEmailAddress.getText().toString();
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Email tidak valid", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(this, ContactActivity.class);
            intent.putExtra("EMAIL", email);
            startActivity(intent);
        });
    }
}