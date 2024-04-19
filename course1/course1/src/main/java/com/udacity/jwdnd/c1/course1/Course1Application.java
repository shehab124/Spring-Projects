package com.udacity.jwdnd.c1.course1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.sql.SQLOutput;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class Course1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Course1Application.class, args);
	}

	@Primary
	@Bean
	public String message()
	{
		System.out.println("message bean created!");
		return "Hello, Spring!";
	}

	@Bean
	public String ayy()
	{
		return "AYYYYYYY";
	}

	@Bean
	public int callHabal(MessageService messageService)
	{
		System.out.println(messageService.getAyy());
		return 1;
	}

//	@Bean
//	public String uppercaseMessage(MessageService messageService)
//	{
//		System.out.println("uppercaseMessage bean created!");
//		return messageService.uppercase();
//	}
//
//	@Bean String lowercaseMessage(MessageService messageService)
//	{
//		System.out.println("lowercaseMessage bean created!");
//		return messageService.lowercase();
//	}


}
