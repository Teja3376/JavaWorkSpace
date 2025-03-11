package com.studenttribe.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) {
		System.out.println("hello world");
	}
}
