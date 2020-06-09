/*package com.xworkz.appzone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "create_group")
public class CreateGroupEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int gid;
	@Column(name = "group_name")
	private String groupName;

	public static final Logger logger = LoggerFactory.getLogger(CreateGroupEntity.class);

	public CreateGroupEntity() {
		logger.info(this.getClass().getSimpleName() + " \t created");
	}

	
	public CreateGroupEntity(String groupName) {
		this.groupName = groupName;
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
		return "CreateGroupEntity [gid=" + gid + ", groupName=" + groupName + "]";
	}

}
*/