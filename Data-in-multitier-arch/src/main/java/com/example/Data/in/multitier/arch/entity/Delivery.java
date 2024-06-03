package com.example.Data.in.multitier.arch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    @Column(name = "address_full", length = 500)
    private String address;

    private LocalDateTime deliveryDateTime;

    private boolean isCompleted;

    public Delivery() {
    }

    public Delivery(Long id, String name, String address, LocalDateTime deliveryDateTime, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.deliveryDateTime = deliveryDateTime;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDeliveryDateTime() {
        return deliveryDateTime;
    }

    public void setDeliveryDateTime(LocalDateTime deliveryDateTime) {
        this.deliveryDateTime = deliveryDateTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
