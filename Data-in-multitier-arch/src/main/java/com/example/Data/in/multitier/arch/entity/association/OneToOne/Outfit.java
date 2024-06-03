package com.example.Data.in.multitier.arch.entity.association.OneToOne;

import jakarta.persistence.*;

@Entity
public class Outfit {

    @Id
    @GeneratedValue
    private long id;

    private String top;
    private String bottom;

    @OneToOne
    @JoinColumn(name = "human_id")
    Human human;

    public Outfit() {
    }

    public Outfit(long id, String top, String bottom) {
        this.id = id;
        this.top = top;
        this.bottom = bottom;
    }
}
