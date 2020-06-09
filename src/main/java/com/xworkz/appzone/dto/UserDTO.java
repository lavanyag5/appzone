package com.xworkz.appzone.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDTO {

	public static final Logger logger = LoggerFactory.getLogger(UserDTO.class);

	public UserDTO() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + "]";
	}

}
