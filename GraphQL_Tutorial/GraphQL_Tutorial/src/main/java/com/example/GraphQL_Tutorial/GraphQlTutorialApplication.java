package com.example.GraphQL_Tutorial;

import com.example.GraphQL_Tutorial.Repository.AuthorRepository;
import com.example.GraphQL_Tutorial.Repository.BookRepository;
import com.example.GraphQL_Tutorial.Entity.Author;
import com.example.GraphQL_Tutorial.Entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class GraphQlTutorialApplication {

	private static final Logger log = LoggerFactory.getLogger(GraphQlTutorialApplication.class);

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

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}

	@Bean
	public ApplicationRunner runner(RestTemplate restTemplate) throws Exception
	{
		return args -> {
			Joke joke = restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", Joke.class);

			System.out.println(joke.toString());
		};
	}


}
