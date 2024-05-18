package com.example.Rest_API_Tutorial.repository;

import com.example.Rest_API_Tutorial.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

     @Query("select d.breed from Dog as d")
    public List<String>  getAllBreeds();

     @Query("select d.breed from Dog as d where d.id = ?1")
    public String getBreedById(Long id);

     @Query("select d.name from Dog as d")
    public List<String> getAllNames();

}
