package com.example.Data.in.multitier.arch.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    PlantRepository plantRepository;

    public Long save(Plant plant)
    {
        return plantRepository.save(plant).getId();
    }

    public Boolean isDelivered(Long plantId)
    {
        return plantRepository.isDelivered(plantId);
    }

    public List<Plant> plantsCheaperThan(BigDecimal price)
    {
        return plantRepository.findByPriceLessThan(price);
    }

}