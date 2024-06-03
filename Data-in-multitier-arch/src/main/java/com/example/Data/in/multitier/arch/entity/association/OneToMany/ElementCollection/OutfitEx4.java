package com.example.Data.in.multitier.arch.entity.association.OneToMany.ElementCollection;

import jakarta.persistence.*;

@Embeddable
public class OutfitEx4 {

    private String top;
    private String bottom;

    public OutfitEx4() {
    }

    public OutfitEx4(String top, String bottom) {
        this.top = top;
        this.bottom = bottom;
    }
}
