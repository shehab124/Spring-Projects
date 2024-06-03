package com.example.Data.in.multitier.arch.entity.association.OneToMany.unidirectional;

import jakarta.persistence.*;

@Entity
public class OutfitEx3 {

    @Id
    @GeneratedValue
    private long id;

    private String top;
    private String bottom;

    public OutfitEx3() {
    }

    public OutfitEx3(long id, String top, String bottom) {
        this.id = id;
        this.top = top;
        this.bottom = bottom;
    }
}
