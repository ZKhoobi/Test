package com.example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by z.khoobi on 14/09/2016.
 */
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return name.equals(country.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public Country(String name) {
        this.name = name;
    }
    public  Country(){}

    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    @OneToMany(mappedBy = "country")
    Set<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @NotNull
    String name;
}
