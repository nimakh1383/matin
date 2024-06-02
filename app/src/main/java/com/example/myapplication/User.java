package com.example.myapplication;
public class User {
    private String uid;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;

    public User() {}

    public User(String uid, String email, String password, String name, String phoneNumber) {
        this.uid = uid;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public User(String displayName, String email) {
        this.name = displayName;
        this.email = email;
    }

    // getters and setters

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}