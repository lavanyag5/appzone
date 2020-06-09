package com.xworkz.appzone.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "user_login")
public class LoginDTO implements Serializable {

	private String username;
	private String password;
	private String userGroup;
	private String email;
	private String userStatus;
	private static final Logger logger = LoggerFactory.getLogger(LoginDTO.class);

	public LoginDTO() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

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

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + ", userGroup=" + userGroup + ", email="
				+ email + ", userStatus=" + userStatus + "]";
	}

}
