package com.model;

public class User {
	  String username;
	    
	   String  email;
	   String password;
	   public User(String username,  String email ,String password) {
		
		this.username = username;
		
		this.email = email;
		this.password = password;
	}
	   public User() {
	
	}
	   public String getUsername() {
		   return username;
	   }
	   public String getEmail() {
		   return email;
	   }
        
	   public String getPassword() {
		   return password;
	   }
	        
}
