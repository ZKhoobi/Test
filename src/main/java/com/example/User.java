package com.example;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by z.khoobi on 12/09/2016.
 */
@Entity
@Table(name="\"User\"")
public class User {
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public User(){}

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH})
    Country country;
    @NotNull
    String name;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
    Set<Role> roleSet;

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
