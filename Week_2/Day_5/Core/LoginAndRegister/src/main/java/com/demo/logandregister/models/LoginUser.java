package com.demo.logandregister.models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginUser {
	@Email
	@NotEmpty(message="must be not empty")
	private String email;
	
	@Size(min=8,message="password must be at least 8 charecters")
	private String password;
	
	public LoginUser() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
