package com.studenttribe.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void dopost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException  {
		PrintWriter out=response.getWriter();
		out.println("Welcome to HttpServlet");
		
			String uname=request.getParameter("uname");
		   String password=request.getParameter("password");
		out.println("User Name :"+uname);
		out.println("Password :"+password);
		System.out.println("Welcome to Http Servlet");
	}
}
