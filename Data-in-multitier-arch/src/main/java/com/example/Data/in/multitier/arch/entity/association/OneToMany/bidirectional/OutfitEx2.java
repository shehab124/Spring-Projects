package com.example.Data.in.multitier.arch.entity.association.OneToMany.bidirectional;

import jakarta.persistence.*;

@Entity
public class OutfitEx2 {

    @Id
    @GeneratedValue
    private long id;

    private String top;
    private String bottom;

    @ManyToOne
    @JoinColumn(name = "personId")
    PersonEx2 personEx2;

    public OutfitEx2() {
    }

    public OutfitEx2(long id, String top, String bottom) {
        this.id = id;
        this.top = top;
        this.bottom = bottom;
    }
}
