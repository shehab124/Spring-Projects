package com.example.Rest_API_Tutorial.service;

import com.example.Rest_API_Tutorial.entity.Dog;
import com.example.Rest_API_Tutorial.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    private DogRepository dogRepository;

    @Override
    public List<Dog> getAllDogs()
    {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> getAllBreeds() {
        return dogRepository.getAllBreeds();
    }

    @Override
    public String getDogBreedById(Long id) {
        Optional<String> breed = Optional.ofNullable(dogRepository.getBreedById(id));
        return breed.orElseThrow(DogNotFoundException::new);
    }

    @Override
    public List<String> getAllDogNames() {
        return dogRepository.getAllNames();
    }
}
