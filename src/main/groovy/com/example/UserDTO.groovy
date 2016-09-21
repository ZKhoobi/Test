package com.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by z.khoobi on 19/09/2016.
 */
class UserDTO {

    public UserDTO(User u)
    {
        this.name=u.name
        this.pass=u.pass
        this.id=u.id
        this.roles=u.roleSet.collect{it.name}
        this.country=u.country.name
    }
    String name
    String pass

    public UserDTO(String name, String pass, String country, List<String> roles) {
        this.name = name;
        this.pass = pass;
        this.roles = roles;
        this.country = country;
    }
    public UserDTO(){}

    int id;
    List<String> roles;
    String country;
}
