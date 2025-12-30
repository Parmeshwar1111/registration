package com.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.User;

public class UserService {
 
	public static boolean saveUser( User user) {
		
		 String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
		 
		 try (Connection conn=Connect.getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql)){
			 

	         ps.setString(1, user.getUsername());
	         ps.setString(2, user.getEmail());
	         ps.setString(3, user.getPassword());
			 int row= ps.executeUpdate();
			 return row >0;
		 }
	 catch (Exception e) {
		e.printStackTrace();
    }
		return false;
		
		
	}
	 
}

