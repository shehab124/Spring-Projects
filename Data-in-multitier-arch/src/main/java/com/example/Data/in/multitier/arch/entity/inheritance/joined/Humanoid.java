package com.example.Data.in.multitier.arch.entity.inheritance.joined;

import com.example.Data.in.multitier.arch.entity.inheritance.SingleTable.OutfitEx5;
import jakarta.persistence.*;

import java.util.List;

/*
Creates a table for the parent class and each subclass.
The subclass tables only have fields unique to their class.
Supports polymorphic queries by UNIONing subclass tables.
Uses the least space of the solutions that allow Not Null columns.
* */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Humanoid {

    @Id
    @GeneratedValue
    private int Id;

    @OneToMany(mappedBy = "humanoid")
    List<OutfitEx5> outfits;

}
