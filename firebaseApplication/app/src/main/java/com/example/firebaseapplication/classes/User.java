package com.example.firebaseapplication.classes;

public class User {
    private String user;
    private String password;
    private String email;
    private MeetoNote meeto;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MeetoNote getMeeto() {
        return meeto;
    }

    public void setMeeto(MeetoNote meeto) {
        this.meeto = meeto;
    }

    public User(String user, String password, String email, MeetoNote meeto) {
        this.user = user;
        this.password = password;
        this.email = email;
        this.meeto = meeto;
    }
}
