package com.capg.VotingApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("home")
	public String home() {
		System.out.println("Call is made to the home method...");
		return "Successfully executed !!!";
	}

	@GetMapping("/health")
	public ResponseEntity<?> getHealthCheck() {
		return ResponseEntity.ok().build();
	}

}
