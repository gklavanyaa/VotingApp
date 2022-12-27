package com.capg.VotingApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.VotingApp.dto.UserDetailsDTO;
import com.capg.VotingApp.service.api.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("user/count")
	public long getUsersCount() {
		System.out.println("Getting the number users present in the DB...");
		long count = userService.getUserCount();
		return count;
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable(name = "userId") String userId) {
		System.out.println("Getting the user details for " + userId);
		ResponseEntity<?> response = null;
		UserDetailsDTO userDetailsDTO = userService.getUserById(userId);
		response = ResponseEntity.ok().body(userDetailsDTO);
		System.out.println(userDetailsDTO);
		return response;
	}

	@PostMapping(value = "/user")
	public boolean addUser(@RequestBody UserDetailsDTO userDetailsDTO) {
		boolean result = userService.addUser(userDetailsDTO);
		return result;
	}
}
