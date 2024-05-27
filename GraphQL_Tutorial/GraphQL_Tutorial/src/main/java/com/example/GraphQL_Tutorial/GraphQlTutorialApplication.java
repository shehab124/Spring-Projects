package com.example.GraphQL_Tutorial;

import com.example.GraphQL_Tutorial.Repository.AuthorRepository;
import com.example.GraphQL_Tutorial.Repository.BookRepository;
import com.example.GraphQL_Tutorial.Entity.Author;
import com.example.GraphQL_Tutorial.Entity.Book;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphQlTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlTutorialApplication.class, args);
	}


	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository)
	{
		return args -> {
			Author josh = authorRepository.save(new Author(null, "josh"));
			Author mark = authorRepository.save(new Author(null, "Mark"));

			bookRepository.saveAll(List.of(
					new Book(null, "Reactive spring", "hamo", josh),
					new Book(null, "Reactive spring", "hamo", mark)
			));
		};
	}
}
