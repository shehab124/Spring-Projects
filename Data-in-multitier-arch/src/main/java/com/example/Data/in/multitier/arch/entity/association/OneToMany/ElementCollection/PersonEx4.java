package com.example.Data.in.multitier.arch.entity.association.OneToMany.ElementCollection;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PersonEx4 {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int age;

    @ElementCollection
    private List<OutfitEx4> outfits;

    public PersonEx4() {
    }

    public PersonEx4(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
