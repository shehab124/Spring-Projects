package com.example.Data.in.multitier.arch.exercise1;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDateTime;
import java.util.List;

@NamedQueries({
        @NamedQuery(
                name = "Delivery.findByName",
                query = "select d from delivery d where d.name = :name"
        ),
        @NamedQuery(
                name = "Delivery.getBill",
                query = "select new com.example.Data.in.multitier.arch.exercise1.RecipientAndPrice(d.name, SUM(p.price)) " +
                        "from Delivery d " +
                        "JOIN d.plants p " +
                        "WHERE d.id = :deliveryId " +
                        "GROUP BY d.name"
        )
})
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

    private boolean isCompleted = false;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Plant> plants;

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

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
