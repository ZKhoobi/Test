//package com.example
//
//import javax.persistence.CascadeType
//import javax.persistence.Column
//import javax.persistence.Entity
//import javax.persistence.FetchType
//import javax.persistence.GeneratedValue
//import javax.persistence.GenerationType
//import javax.persistence.Id
//import javax.persistence.ManyToMany
//import javax.persistence.ManyToOne
//import javax.persistence.Table
//
///**
// * Created by z.khoobi on 19/09/2016.
// */
//@Entity
//@Table(name="\"User\"")
//class User {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    int id
//    String name
//    @Column(name="pass")
//    String pass
//    @ManyToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH])
//    Country country
//    @ManyToMany(cascade = [CascadeType.PERSIST, CascadeType.REFRESH],fetch = FetchType.LAZY)
//    Set<Role> roleSet
//
//    def String format(format, value)
//    {
//        String.format(format, value)
//    }
//
//    def initOrder(strAsCSV)
//    {
//        def(name, pass, country, roles) = strAsCSV.tokenize("|")*.trim()
//
//        this.name=name
//        this.pass=pass
//     //   this.id=id
//        this.country=country
//        this.roleSet=roles
//
//        return this
//    }
//
//    def String toString()
//    {
//        //preparing the output in a fixed width format via format() method defined above
//        def output = String.format("%-15s", name) + " | "   +
//                String.format("%-10s", pass) + " | " + String.format("%-8s", id) + " | " +
//                String.format("%-8s", country) + " | " + String.format("%-12s", roleSet) + " | "
//
//        output
//    }
//}