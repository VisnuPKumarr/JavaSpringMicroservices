package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;

@SpringBootApplication
public class ConfigProfilesServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConfigProfilesServiceApplication.class, args);
	}
	
	@Autowired
	private ServerProperties serverProperties;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(serverProperties);
	}
	
	

}
