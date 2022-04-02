package com.example.challangepraktikum.datasources;

import com.example.challangepraktikum.R;
import com.example.challangepraktikum.models.Contact;

import java.util.ArrayList;

public class ContactData {
    private final ArrayList<Contact> contact = new ArrayList<>();
    public ContactData() {
        contact.add(new Contact(R.drawable.ayaka, "Kamisato Ayaka",
                "ayaka20@gmail.com"));
        contact.add(new Contact(R.drawable.hu_tao, "Hu Tao",
                "hutao12@gmail.com"));
        contact.add(new Contact(R.drawable.qiqi, "Qiqi",
                "qiqi44@gmail.com"));
        contact.add(new Contact(R.drawable.kokomi, "Sangonomiya Kokomi",
                "kokomis@gmail.com"));
        contact.add(new Contact(R.drawable.raiden, "Raiden Shogun",
                "shogun@gmail.com"));

    }

    public ArrayList<Contact> getContact() {
        return contact;
    }
}
