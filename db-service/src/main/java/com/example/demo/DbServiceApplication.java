package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}
	
	@Autowired
	private BookRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(DbServiceApplication.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("DB APPLICATION STARTED");
		
		repository.save(new Book("Java"));
		repository.save(new Book("Python"));
		repository.save(new Book("JavaScipt"));
		repository.save(new Book("NodeJS"));
		repository.save(new Book("React"));
		repository.save(new Book("OJET"));
		repository.save(new Book("C/C++"));
		
	}
	
	

}
