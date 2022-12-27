package com.capg.VotingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.VotingApp.db.User;
import com.capg.VotingApp.dto.UserDetailsDTO;
import com.capg.VotingApp.repository.UserCrudRepository;
import com.capg.VotingApp.service.api.UserService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

	@Autowired
	private UserCrudRepository userCrudRepository;
	
	@Override
	public long getUserCount() {
		long noOfRows = userCrudRepository.count();
		return noOfRows;
	}

	@Override
	public UserDetailsDTO getUserById(String userId) {
		User user = null;
		UserDetailsDTO userDetailsDTO = null;
		if (userId != null && !userId.isEmpty()) {
		    user = userCrudRepository.findByUserId(userId);
		    if(user != null) {
		    	userDetailsDTO = new UserDetailsDTO(user);
		    }
		}
		System.out.println("User Details : "+ user);
		return userDetailsDTO;
	}

	@Override
	public boolean addUser(UserDetailsDTO userDetailsDTO) {
		User user = new User();
		user.setFirstName(userDetailsDTO.getFirstName());
		user.setLastName(userDetailsDTO.getLastName());
		user.setEmail(userDetailsDTO.getEmailId());
		user.setPhoneNumber(userDetailsDTO.getPhoneNumber());
		userCrudRepository.save(user);
		return true;
	}

}
