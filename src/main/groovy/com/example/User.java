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

    String pass;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
}