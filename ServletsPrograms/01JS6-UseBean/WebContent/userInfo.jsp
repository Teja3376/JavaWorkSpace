<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.User" %>

<html>
    <head>
        <title>User Info</title>
    </head>
    <body>
        <!-- Create and initialize the User bean -->
        <jsp:useBean id="user" class="com.example.User" scope="session" />
        
        <!-- Set properties (optional) -->
        <jsp:setProperty name="user" property="name" value="Ramesh" />
        <jsp:setProperty name="user" property="age" value="30" />
        
        <!-- Display properties of the User bean -->
        <h2>User Information</h2>
        <p>Name: <jsp:getProperty name="user" property="name" /></p>
        <p>Age: <jsp:getProperty name="user" property="age" /></p>
    </body>
</html>
