package com.example.Data.in.multitier.arch.entity.inheritance.SingleTable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public abstract class Humanoid {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany(mappedBy = "humanoid")
    List<OutfitEx5> outfits;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<OutfitEx5> getOutfits() {
        return outfits;
    }

    public void setOutfits(List<OutfitEx5> outfits) {
        this.outfits = outfits;
    }
}
