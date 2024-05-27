package com.example.GraphQL_Tutorial.Controller;

import com.example.GraphQL_Tutorial.Entity.Dog;
import com.example.GraphQL_Tutorial.Exception.DogNotFoundException;
import com.example.GraphQL_Tutorial.Repository.DogRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class DogController {

    private DogRepository dogRepository;

    public DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @QueryMapping
    public Iterable<Dog> findDogs()
    {
        return dogRepository.findAll();
    }

    @QueryMapping
    public Optional<Dog> findDogById(@Argument Long id)
    {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if(optionalDog.isPresent())
        {
            return Optional.of(optionalDog.get());
        }
        else
            throw new DogNotFoundException("Dog not found", id);
    }

    @MutationMapping
    public Dog addDog(@Argument DogInput dog)
    {
        Dog d = new Dog(dog.name, dog.breed, dog.origin);
        return dogRepository.save(d);
    }

    @MutationMapping
    public Dog updateDogName(@Argument String newName,@Argument Long id) throws Exception {
        Optional<Dog> optionalDog = dogRepository.findById(id);

        if(optionalDog.isPresent())
        {
            Dog dog = optionalDog.get();
            dog.setName(newName);
            dogRepository.save(dog);
            return dog;
        }
        else
        {
            throw new DogNotFoundException("Id not found", id);
        }

    }

    @MutationMapping
    public boolean deleteDogBreed(@Argument String breed)
    {
        Optional<Long> id = dogRepository.findDogByBreed(breed);
        if(id.isPresent())
        {
            dogRepository.deleteById(id.get());
            return true;
        }
        else
        {
            throw new DogNotFoundException("Dog not found", breed);
        }
    }

    private record DogInput(String name, String breed, String origin) {}

}
