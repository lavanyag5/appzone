package com.xworkz.appzone.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroupDTO {

	private int groupId;
	private String groupName;

	public static final Logger logger = LoggerFactory.getLogger(GroupDTO.class);

	public GroupDTO() {

	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
