package com.example.challangepraktikum.controllers;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.challangepraktikum.R;
public class EmailActivity extends AppCompatActivity {
    Button button_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_contact);
        Intent intent = getIntent();
        button_email = findViewById(R.id.callButton);
        button_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"someonegmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Genshin SENDING EMAIL");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello!");
                emailIntent.setType("message/rfc822");
                startActivity(emailIntent);
            }
        });
    }
}

