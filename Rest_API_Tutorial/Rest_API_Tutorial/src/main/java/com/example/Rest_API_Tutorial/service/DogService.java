package com.example.Rest_API_Tutorial.service;

import com.example.Rest_API_Tutorial.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> getAllDogs();

    List<String> getAllBreeds();

    String getDogBreedById(Long id);

    List<String> getAllDogNames();
}
