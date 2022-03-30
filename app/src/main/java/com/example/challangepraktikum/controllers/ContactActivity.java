package com.example.challangepraktikum.controllers;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challangepraktikum.adapters.ContactAdapter;
import com.example.challangepraktikum.R;
import com.example.challangepraktikum.models.Contact;
import com.example.challangepraktikum.databinding.ContactBinding;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    private final ArrayList<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactBinding binding = ContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.welcomeTextView.setOnClickListener(view -> {
            // Buat nerima intent dari page login
        });

        addContactData();

        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ContactAdapter(this, contactList));
    }

    private void addContactData() {
        contactList.add(new Contact(R.drawable.ayaka, "Kamisato Ayaka",
                "ayaka20@gmail.com"));
        contactList.add(new Contact(R.drawable.hu_tao, "Hu Tao",
                "hutao12@protonmail.com"));
        contactList.add(new Contact(R.drawable.qiqi, "Qiqi",
                "qiqi44@yahoo.com"));
        contactList.add(new Contact(R.drawable.kokomi, "Sangonomiya Kokomi",
                "s_kokomi49@rocketmail.com"));
    }
}
