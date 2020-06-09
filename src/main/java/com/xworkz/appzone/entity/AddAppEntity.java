/*package com.xworkz.appzone.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "add_app")
public class AddAppEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appId;
	private String aliasName;
	private boolean isActive;
	private String description;
	private String groupMail;
	private boolean isCloud;

	public static final Logger logger = LoggerFactory.getLogger(AddAppEntity.class);

	public AddAppEntity() {
		logger.info(this.getClass().getSimpleName() + "\t Created");
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupMail() {
		return groupMail;
	}

	public void setGroupMail(String groupMail) {
		this.groupMail = groupMail;
	}

	public boolean isCloud() {
		return isCloud;
	}

	public void setCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}

	@Override
	public String toString() {
		return "AddAppEntity [appId=" + appId + ", aliasName=" + aliasName + ", isActive=" + isActive + ", description="
				+ description + ", groupMail=" + groupMail + ", isCloud=" + isCloud + "]";
	}

}
*/