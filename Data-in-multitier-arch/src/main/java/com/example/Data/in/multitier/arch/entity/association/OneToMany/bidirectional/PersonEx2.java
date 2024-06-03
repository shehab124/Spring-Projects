package com.example.Data.in.multitier.arch.entity.association.OneToMany.bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class PersonEx2 {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int age;

    @OneToMany(mappedBy = "personEx2")
    List<OutfitEx2> outfitEx2;

    public PersonEx2() {
    }

    public PersonEx2(long id, String name, int age) {
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
