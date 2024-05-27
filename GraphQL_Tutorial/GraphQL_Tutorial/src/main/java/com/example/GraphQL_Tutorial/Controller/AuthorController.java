package com.example.GraphQL_Tutorial.Controller;

import com.example.GraphQL_Tutorial.Repository.AuthorRepository;
import com.example.GraphQL_Tutorial.Repository.BookRepository;
import com.example.GraphQL_Tutorial.Entity.Author;
import com.example.GraphQL_Tutorial.Entity.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public AuthorController(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    Iterable<Author> authors()
    {
        return authorRepository.findAll();
    }

    @QueryMapping
    Optional<Author> authorById(@Argument Long id)
    {
        return authorRepository.findById(id);
    }

    @MutationMapping
    Book addBook(@Argument BookInput book){
        Author author = authorRepository.findById(book.authorId()).orElseThrow(() -> new IllegalArgumentException("Author not found"));
        Book b = new Book(book.title, book.publisher, author);
        return bookRepository.save(b);
    }

    record BookInput(String title, String publisher, Long authorId) {}

}

