package com.example.challangepraktikum.controllers;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challangepraktikum.adapters.ContactAdapter;
import com.example.challangepraktikum.R;
import com.example.challangepraktikum.datasources.ContactData;
import com.example.challangepraktikum.models.Contact;
import com.example.challangepraktikum.databinding.ContactBinding;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactBinding binding = ContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.welcomeTextView.setOnClickListener(view -> {
            // Buat nerima intent dari page loginn
        });

        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ContactAdapter(
                this,
                new ContactData().getContact()
        ));
    }
}
