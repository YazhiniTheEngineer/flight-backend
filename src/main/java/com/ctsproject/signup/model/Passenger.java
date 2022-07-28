package com.ctsproject.signup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	private long phnNo;
	private String password;
	
	public Passenger() {}
	
	public Passenger(long id, String firstName, String lastName, String emailId, long phnNo,String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
