package com.xworkz.appzone.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManageRoleDTO {

	private String groupName;
	private String userName;
	private String role;

	public static final Logger logger = LoggerFactory.getLogger(ManageRoleDTO.class);

	public ManageRoleDTO() {
		logger.info(this.getClass().getSimpleName() + " \t Created");
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "ManageRoleDTO [groupName=" + groupName + ", userName=" + userName + ", role=" + role + "]";
	}

}
