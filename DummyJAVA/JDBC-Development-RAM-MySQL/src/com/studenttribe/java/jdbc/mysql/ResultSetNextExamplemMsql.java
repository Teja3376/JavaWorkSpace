 


//mysql>create table employee(no integer,ename varchar(20),sal float(8,2));
//mysql> insert into employee values(101,'raj1',10000);

package com.studenttribe.java.jdbc.mysql;
import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNextExamplemMsql {
  public static void main(String[] args) {
     Connection conn = null;
      String url = "jdbc:mysql://localhost:3306/";
      String dbName = "tribe";
      String driverName = "com.mysql.jdbc.Driver";
      String userName = "root";
      String password = "root";
      try{
        Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
        conn = DriverManager.getConnection(url+dbName, userName, password);
        try{
          Statement stmt = conn.createStatement();                
          ResultSet rs=stmt.executeQuery("Select * from student");
              while(rs.next()){
        	 System.out.println("Student No :" + rs.getInt(1));
             System.out.println("Student Name :" + rs.getString("sname"));
        	    	System.out.println("Student age :"+rs.getInt(3));
          }         }
        catch(SQLException s){
          System.out.println(s);
        }
        conn.close();
      }
      catch (Exception e){
        e.printStackTrace();
      }  }}

