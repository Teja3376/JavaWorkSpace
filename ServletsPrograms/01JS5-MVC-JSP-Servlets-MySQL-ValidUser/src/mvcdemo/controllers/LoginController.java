package mvcdemo.controllers;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcdemo.model.Authenticator;
import mvcdemo.model.User;

//import sun.text.normalizer.ICUBinary.Authenticate;

public class LoginController extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		   User userBean=new User();
		        userBean.setUsername(username);
		        userBean.setPassword(password);
		RequestDispatcher rd = null;

		Authenticator authenticator = new Authenticator();
		boolean result = authenticator.authenticate(userBean);
		System.out.println("Result .... :"+result);
		if(result) {
		//if (result.equals("true")) {
			rd = request.getRequestDispatcher("/success.jsp");
			User user = new User(username, password);
			request.setAttribute("user", user);
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}

}