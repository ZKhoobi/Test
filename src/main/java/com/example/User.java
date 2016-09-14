package com.example;

import javax.persistence.*;

/**
 * Created by z.khoobi on 12/09/2016.
 */
@Entity
@Table(name="\"User\"")
public class User {
    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public User(){}
    String name;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String pass;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
}
