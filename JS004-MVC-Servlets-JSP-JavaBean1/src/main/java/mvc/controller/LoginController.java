package mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcdemo.model.Authenticator;
import mvcdemo.model.userBean;

public class LoginController extends HttpServlet {
	//Default Constructor
	LoginController(){
		super();
	}
	public void dopost (HttpServletRequest request, HttpServletResponse response) throws ServletException ,  IOException {
		String username =  request.getParameter("username");
		String password = request.getParameter("password");
		userBean userbean = new userBean();
		Authenticator result = new Authenticator();
		if(result.equals(result)) {
			
		}
	}
}
