package com.example.GraphQL_Tutorial.Repository;

import com.example.GraphQL_Tutorial.Entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
