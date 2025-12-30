package com.DOA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	public static Connection getConnection() throws Exception {
		
		Connection con =null;
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		          con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Parmeshwar1@");
		  } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		return con;
		
		
	}
    

}
