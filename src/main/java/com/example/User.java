package com.example;

/**
 * Created by z.khoobi on 05/09/2016.
 */
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public User() {
    }

    String name;
    String pass;

}
