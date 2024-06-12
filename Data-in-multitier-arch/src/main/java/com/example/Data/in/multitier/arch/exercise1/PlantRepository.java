package com.example.Data.in.multitier.arch.exercise1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

    @Query("select p from Plant p JOIN Delivery d WHERE p.id = :plantId AND d.isCompleted = true")
    boolean isDelivered(Long plantId);

    List<Plant> findByPriceLessThan(BigDecimal price);
}
