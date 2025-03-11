//mysql>create table Info1(name varchar(20),no integer,sal float(8,2));

package com.studenttribe.java.jdbc.mysql;
import java.sql.*;
public class PreparedStatementEx1 
{ 	public static void main(String[] args)throws Exception  {
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "studenttribedb";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";	 
			Class.forName(driver);
			conn = DriverManager.getConnection(url+dbName,userName,password);
			
			String query="insert into Info1 values(?,?,?)";	
			   
			//Step1 :  Get PreparedStatement 
			PreparedStatement pstmt=conn.prepareStatement(query);
			
			//Step2 :  Set parameters
			pstmt.setString(1,"Ravi");
			pstmt.setInt(2,30);
			pstmt.setDouble(3,5500.00);
			//Step3 : execute the query
			int i=pstmt.executeUpdate();
			System.out.println("Record inserted count :"+i);
		   	//Execute query once again
			pstmt.setString(1,"Raju");
			pstmt.setInt(2,5000);
			pstmt.setDouble(3,5000.66);
			i=pstmt.executeUpdate(); 			
			System.out.println("Query executed for the second time count :"+i);				
	}}  