package com.example.Data.in.multitier.arch.entity.compositeKey.embeddableId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import org.hibernate.annotations.Nationalized;

@Entity(name = "person_example")
public class Person {

    @EmbeddedId
    PersonPK id;

    @Nationalized
    private String name;

    private int age;

    @Column(name = "composer", length = 512)
    private String favoriteComposer;

    public Person() {
    }

    public Person(PersonPK id, String name, int age, String favoriteComposer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.favoriteComposer = favoriteComposer;
    }

    public PersonPK getId() {
        return id;
    }

    public void setId(PersonPK id) {
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

    public String getFavoriteComposer() {
        return favoriteComposer;
    }

    public void setFavoriteComposer(String favoriteComposer) {
        this.favoriteComposer = favoriteComposer;
    }
}
