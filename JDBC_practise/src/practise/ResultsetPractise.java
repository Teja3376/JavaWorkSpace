package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetPractise {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "jdbctasks";
		String driver = "mysql.cj.jdbc.driver";
		String username = "root";
		String password = "root";
		try {
			Class.forName(dbname);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(url+dbname,username,password);
			String query = "Select * from practise1";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Pno"+rs.getInt(1));
				System.out.println("Pname"+rs.getString("pname"));
				System.out.println("pprice"+rs.getInt(3));
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
}
