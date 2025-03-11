//SQL> create table register(username varchar2(20),password varchar2(20));
//SQL> insert into register values('ramkumar','ramkumar');
package mvcdemo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Authenticator {

	public static boolean authenticate(User userBean) {
		
		 Connection connection = null;
 	    String driver = "com.mysql.jdbc.Driver";
 	    String url = "jdbc:mysql://localhost:3306/mydb";
 		String userName = "root"; 
 		String password = "root";
		 boolean st =false;
	        	 
	    		try{
	    		Class.forName(driver).newInstance();
	    		connection = DriverManager.getConnection(url,userName,password); 	    
	    	    		
	    		 
	         PreparedStatement ps =connection.prepareStatement
	                             ("select * from register where username=? and password=?");
	         ps.setString(1, userBean.getUsername());
	         ps.setString(2, userBean.getPassword());
	         ResultSet rs =ps.executeQuery();
	         st = rs.next();
	        
	         
	         
	      }catch(Exception e)
	      {
	          e.printStackTrace();
	      }
	         return st;                 
	  }   
		
}
		
		
	/*	
		if (("ramkumar".equalsIgnoreCase(userBean.getUsername()))
				&& ("ramkumar".equals(userBean.getPassword()))) {
			return "success";
		} else {
			return "failure";
		}
	}
}*/