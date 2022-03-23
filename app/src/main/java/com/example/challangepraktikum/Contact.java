package com.example.challangepraktikum;

public class Contact {
    private int profile;
    private String name, email;

    public Contact(int profile, String name, String email) {
        this.profile = profile;
        this.name = name;
        this.email = email;
    }

    public int getProfile() {
        return profile;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
