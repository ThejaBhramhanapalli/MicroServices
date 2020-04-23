package com.bank.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		System.out.print("Using Run Method Command line runner" );
		
	}

}
