package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	public void dopost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello User");
		response.setContentType("text/html");
   	 	PrintWriter out = response.getWriter();
   	 	String username = request.getParameter("username");
   	 	String password = request.getParameter("password");
   	 	out.println("<html>");
   	 	out.println("<head>");
   	 	out.println("<title>Hello</title>");
   	 	out.println("</head>");
   	 	out.println("<body>");
   	 	out.println("<h1> Username: " +username+"</h1>");
   	 	out.println("<h3> password: " +password+"</h3>");
	 	out.println("</body");
	 	out.println("</html");
	}
}
