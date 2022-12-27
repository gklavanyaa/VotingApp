package com.capg.VotingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotingAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting the Voting Application service ...");
		SpringApplication.run(VotingAppApplication.class, args);
	}

}
