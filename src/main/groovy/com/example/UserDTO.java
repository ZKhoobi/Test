//package com.example;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
///**
// * Created by z.khoobi on 19/09/2016.
// */
//public class UserDTO {
//
//    public UserDTO(User u)
//    {
//        this.name=u.getName();
//        this.pass=u.getPass();
//        this.id=u.getId();
//        this.roles=new ArrayList<>();
//        for (Role r:u.getRoleSet()
//             ) {
//            this.roles.add(r.getName());
//        }
//        this.country=u.country.getName();
//    }
//    String name;
//    String pass;
//
//    public UserDTO(String name, String pass, String country, List<String> roles) {
//        this.name = name;
//        this.pass = pass;
//        this.roles = roles;
//        this.country = country;
//    }
//    public UserDTO(){}
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPass() {
//        return pass;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public List<String> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<String> roles) {
//        this.roles = roles;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    int id;
//    List<String> roles;
//    String country;
//}
