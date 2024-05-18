package com.example.Rest_API_Tutorial.controller;

import com.example.Rest_API_Tutorial.entity.Dog;
import com.example.Rest_API_Tutorial.repository.DogRepository;
import com.example.Rest_API_Tutorial.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DogController {

    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService)
    {
        this.dogService = dogService;
    }

    @GetMapping("/dog")
    public ResponseEntity<List<Dog>> getAllDogs()
    {
        List<Dog> list = dogService.getAllDogs();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/breeds")
    public ResponseEntity<List<String>> getAllBreeds()
    {
        List<String> list = dogService.getAllBreeds();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/breed/{id}")
    public ResponseEntity<String> getDogBreed(@PathVariable(name = "id") Long id)
    {
        return new ResponseEntity<String>(dogService.getDogBreedById(id), HttpStatus.OK);
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getNames()
    {
        return new ResponseEntity<>(new ArrayList<>(dogService.getAllDogNames()), HttpStatus.OK);
    }

}
