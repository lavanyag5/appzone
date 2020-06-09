package com.xworkz.appzone.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "user_login")
public class LoginEntity implements Serializable {

	@Id
	@Column(name = "user_id")
	private int id;
	@Column(name = "user_name")
	private String username;
	@Column(name = "user_password")
	private String password;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_status")
	private String userStatus;
	@Column(name = "user_group")
	private String userGroup;

	private static final Logger logger = LoggerFactory.getLogger(LoginEntity.class);

	public LoginEntity() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserActive(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", userStatus=" + userStatus + ", userGroup=" + userGroup + "]";
	}

	

}
