package com.example.GraphQL_Tutorial.Repository;

import com.example.GraphQL_Tutorial.Entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select d.id from Dog d where d.breed = :breed")
    Optional<Long> findDogByBreed(String breed);

}
