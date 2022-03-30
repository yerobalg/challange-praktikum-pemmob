package com.example.challangepraktikum.datasources;

import com.example.challangepraktikum.R;
import com.example.challangepraktikum.models.Contact;

import java.util.ArrayList;

public class ContactData {
    private ArrayList<Contact> contact;
    public ContactData() {
        contact.add(new Contact(R.drawable.ayaka, "Kamisato Ayaka",
                "ayaka20@gmail.com"));
        contact.add(new Contact(R.drawable.hu_tao, "Hu Tao",
                "hutao12@protonmail.com"));
        contact.add(new Contact(R.drawable.qiqi, "Qiqi",
                "qiqi44@yahoo.com"));
        contact.add(new Contact(R.drawable.kokomi, "Sangonomiya Kokomi",
                "s_kokomi49@rocketmail.com"));
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }
}
