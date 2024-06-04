package com.example.Data.in.multitier.arch.entity.inheritance.MappedSuperClass;

import jakarta.persistence.MappedSuperclass;

/*
This is selected by using the @MappedSuperclass annotation on the parent class instead of @Entity.
It creates a table per class just like TABLE_PER_CLASS,
 but there is no superclass table. It does not support polymorphic queries,
but never requires UNIONS to query subclasses.
* */
@MappedSuperclass
public class Humanoid {



}
