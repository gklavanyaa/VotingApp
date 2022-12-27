package com.capg.VotingApp.dto;

import com.capg.VotingApp.db.User;

import lombok.ToString;

@ToString(includeFieldNames = true)
public class UserDetailsDTO {
	public String firstName;
	public String lastName;
	public String emailId;
	public String phoneNumber;

	
	public UserDetailsDTO() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User constructUser(String firstName, String lastName, String emailId, String phoneNumber) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(emailId);
		user.setPhoneNumber(phoneNumber);
		return user;
	}

	public UserDetailsDTO(User user) {
		super();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.emailId = user.getEmail();
		this.phoneNumber = user.getPhoneNumber();
	}


	
}
