package com.capg.VotingApp.service.api;

import org.springframework.stereotype.Service;

import com.capg.VotingApp.db.User;
import com.capg.VotingApp.dto.UserDetailsDTO;

@Service
public interface UserService {

	long getUserCount();
	
	UserDetailsDTO getUserById(String userId);
	
	boolean addUser(UserDetailsDTO userDetailsDTO);
}
