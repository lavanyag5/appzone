package com.xworkz.appzone.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateGroupDTO {

	private int gid;
	private String groupName;

	public static final Logger logger = LoggerFactory.getLogger(CreateGroupDTO.class);

	public CreateGroupDTO() {
		logger.info(this.getClass().getSimpleName() + " \t Created");
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "CreateGroupDTO [gid=" + gid + ", groupName=" + groupName + "]";
	}

}
