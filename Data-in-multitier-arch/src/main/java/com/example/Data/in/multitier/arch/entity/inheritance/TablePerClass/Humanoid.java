//package com.example.Data.in.multitier.arch.entity.inheritance.TablePerClass;
//
//import jakarta.persistence.*;
//
///*
//Creates a table for the parent class and each subclass.
//The subclass tables have all fields from the parent class as well as fields unique to their class.
// Supports polymorphic queries by UNIONing subclass tables,
//but does not require any UNION to access superclass fields on non-polymorphic queries.
//* */
//@Entity()
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//public class Humanoid {
//
//    @Id
//    @GeneratedValue
//    private long id;
//
//}
