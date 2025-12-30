package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.DOA.UserService;
import com.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    String username = req.getParameter("username");
		    String email = req.getParameter("email");
	        String password = req.getParameter("password");
	           
	        
	         boolean result =UserService.saveUser( new User(username,email ,password));
	         
	         resp.setContentType("text/HTML");
	         
	         PrintWriter out = resp.getWriter();
	           
	         
	         if (result ) {
	        	 
	        	 out.print("<h1>regisatrtion sucessfull</h1>");
	        	 out.print("<h1>"+username+  "</h1>");
	        	 out.print("<h1>"+email+  "</h1>");
	         }
	         else {
	        	 out.print("<h1>regisatrtion failed</h1>");
	         }
	         
			}
    
	
	
}
