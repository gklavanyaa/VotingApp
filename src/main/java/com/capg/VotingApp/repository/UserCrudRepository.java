package com.capg.VotingApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.VotingApp.db.User;

public interface UserCrudRepository extends CrudRepository<User, String> {

	User findByUserId(String userId);
	
}
