package com.example.Data.in.multitier.arch.exercise1;

import jakarta.persistence.*;

@Entity
@Table(name = "flower")
public class Flower extends Plant {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
