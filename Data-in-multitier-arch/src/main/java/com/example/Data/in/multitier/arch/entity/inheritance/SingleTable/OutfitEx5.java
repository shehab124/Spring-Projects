package com.example.Data.in.multitier.arch.entity.inheritance.SingleTable;

import jakarta.persistence.*;

@Entity
public class OutfitEx5 {

    @Id
    @GeneratedValue
    private long id;

    private String top;
    private String bottom;

    @ManyToOne
    @JoinColumn(name = "humanoid_id")
    private Humanoid humanoid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }
}
