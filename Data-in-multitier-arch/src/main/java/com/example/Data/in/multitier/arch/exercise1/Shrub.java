package com.example.Data.in.multitier.arch.exercise1;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "shrub")
public class Shrub extends Plant{

    private Long height;
    private Long width;

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
