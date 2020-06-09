/*package com.xworkz.appzone.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Controller;

@Controller
@Table(name = "manage_group")
public class ManageGroupEntity implements Serializable {

	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	private int id;
	private String emails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "ManageGroupEntity [id=" + id + ", emails=" + emails + "]";
	}

}
*/