package com.example.Data.in.multitier.arch.entity.inheritance.SingleTable;

import jakarta.persistence.Entity;
import org.hibernate.annotations.Nationalized;

@Entity
public class PersonEx5 extends Humanoid {

    @Nationalized
    private String name;
    private int age;

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
