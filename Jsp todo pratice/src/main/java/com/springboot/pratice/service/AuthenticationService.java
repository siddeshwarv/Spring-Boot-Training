package com.springboot.pratice.service;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
	
	public boolean authenticate(String username,String password) {
		boolean isValidUser = username.equalsIgnoreCase("siddeshwar");
		boolean isValidPassword = password.equalsIgnoreCase("password");
		return isValidUser && isValidPassword;
	}
}
