package com.example.sprtingbootfirstwebapplication.servieces;

import org.springframework.stereotype.Component;

@Component
public class LoginServiece {
	public boolean validateuser(String user,String pass) {
		if(user.equalsIgnoreCase("varun")&&pass.equalsIgnoreCase("varun"))
			return true;
		else 
			return false;
	}
}
