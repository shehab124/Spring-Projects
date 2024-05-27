package com.example.GraphQL_Tutorial.Repository;

import com.example.GraphQL_Tutorial.Entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}