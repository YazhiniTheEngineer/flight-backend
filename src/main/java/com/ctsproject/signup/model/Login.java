package com.ctsproject.signup.model;

import org.springframework.stereotype.Component;

@Component
public class Login {

	private String emailId;
	private String password;
	
	public Login() {}
	
	public Login(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
