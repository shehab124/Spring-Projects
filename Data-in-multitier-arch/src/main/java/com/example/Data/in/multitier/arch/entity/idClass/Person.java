package com.example.Data.in.multitier.arch.entity.idClass;

import com.example.Data.in.multitier.arch.entity.embeddableId.PersonPK;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(PersonPk.class)
public class Person {

    @Id
    private int height;
    @Id
    private String color;

    public PersonPk getId()
    {
        PersonPk id = new PersonPk();
        id.setColor(color);
        id.setHeight(height);
        return id;
    }

    public void setId(PersonPK id)
    {
        this.color = id.getColor();
        this.height = id.getHeight();
    }
}
