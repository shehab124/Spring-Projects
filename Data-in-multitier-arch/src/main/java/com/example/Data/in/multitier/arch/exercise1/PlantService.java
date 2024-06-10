package com.example.Data.in.multitier.arch.exercise1;

import org.springframework.stereotype.Service;

@Service
public class PlantService {

    public Plant getPlantByName(String name)
    {
        return new Plant();
    }

}