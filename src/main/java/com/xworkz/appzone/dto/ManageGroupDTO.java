package com.xworkz.appzone.dto;

public class ManageGroupDTO {

	private int gid;
	private String emails;

	public ManageGroupDTO() {
		System.out.println(this.getClass().getSimpleName() + "\t Created...");
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "ManageGroupDTO [gid=" + gid + ", emails=" + emails + "]";
	}

}
