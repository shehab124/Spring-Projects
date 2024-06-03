package com.example.Data.in.multitier.arch.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(name = "plant")
public class Flower {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String color;

    @Column(precision = 12, scale = 4)
    private BigDecimal price;

}
