package com.example.Data.in.multitier.arch.entity.compositeKey.idClass;



import java.io.Serializable;
import java.util.Objects;

public class PersonPk implements Serializable {

    private int height;
    private String color;

    @Override
    public int hashCode() {
        return Objects.hash(height, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)  return true;
        if(obj == null || obj.getClass() != getClass())
            return false;

         PersonPk personPk = (PersonPk) obj;
         return personPk.height == this.height && personPk.color.equals(this.color);
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
