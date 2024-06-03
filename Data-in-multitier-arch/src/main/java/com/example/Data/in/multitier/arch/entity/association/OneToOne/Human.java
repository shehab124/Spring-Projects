package com.example.Data.in.multitier.arch.entity.association.OneToOne;

import jakarta.persistence.*;

@Entity
public class Human {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int age;

    @OneToOne(mappedBy = "human")
    Outfit outfit;

    public Human() {
    }

    public Human(long id, String name, int age) {
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
