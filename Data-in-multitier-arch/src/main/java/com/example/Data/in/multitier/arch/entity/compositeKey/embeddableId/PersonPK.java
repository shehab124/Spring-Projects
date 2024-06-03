package com.example.Data.in.multitier.arch.entity.compositeKey.embeddableId;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PersonPK implements Serializable {

    private int height;
    private String color;

    @Override
    public int hashCode() {
        return Objects.hash(height, color);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        PersonPK personPK = (PersonPK) obj;
        return this.height == ((PersonPK) obj).height && this.color.equals(((PersonPK) obj).color);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
