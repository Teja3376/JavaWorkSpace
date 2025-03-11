package com.studenttribe.corejava.layers.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studenttribe.corejava.layers.beans.BookBean;

public class BookDAO {
	int i;
	public int addBook(BookBean bookBean) throws ClassNotFoundException {
		
		System.out.println("Book DAO Layer");
		System.out.println("BookID :"+bookBean.getBookId());
		System.out.println("BookTitle:"+bookBean.getTitle());
		System.out.println("Book Price :"+bookBean.getPrice());
		
		
		Connection connection = null;
	      String url = "jdbc:mysql://localhost:3306/kanidb";
//	      String dbName = "kanidb";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "root";
	      try{
	        Class.forName(driverName); // Calculation cal=new Calculation();
	        connection = DriverManager.getConnection(url, userName, password);
	        
	        String query="insert into book values(?,?,?,?)";
	        
	       PreparedStatement pstmt=connection.prepareStatement(query);
	        pstmt.setInt(1, bookBean.getBookId()); //100
	        pstmt.setString(2,bookBean.getTitle()); //java
	        pstmt.setDouble(3,bookBean.getPrice()); //250
	        pstmt.setString(4, bookBean.getGrade()); //c
	        
	         i= pstmt.executeUpdate();
	        
	      }
	      catch(SQLException e) {
	    	  System.out.println(e);
	      }
		return i;
	}
		
		
		
		
	
}