package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertSetPractise {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "jdbctasks";
		String driver = "mysql.cj.jdbc.driver";
		String user = "root";
		String password = "root";
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO to-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url+dbname, user, password);
			while(flag) {
				System.out.println("1. Create table \n2. Insert data \n3. Update Data \n4. Show table");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("create table ----------");
					String query = "create table practise( sno int, sname varchar(20), satd int)";
					PreparedStatement pt = conn.prepareStatement(query);
					int i = pt.executeUpdate();
					System.out.println(i);
					break;
					
				case 2:
					System.out.println(" Insert data to the Table --------");
					String query1 = "Insert into practise values(?,?,?)";
					PreparedStatement pt1 = conn.prepareStatement(query1);
					System.out.println("Enter Limit");
					int n = sc.nextInt();
					for(int j=1 ; j<= n ;j++) {
						System.out.println("1st one ");
						pt1.setInt(sc.nextInt(),sc.nextInt());
						System.out.println("2st one");
						pt1.setString(sc.nextInt(), sc.next());
						System.out.println("3rd one");
						pt1.setInt(sc.nextInt(), sc.nextInt());
						int k = pt1.executeUpdate();
					}
				case 3:
					System.out.println("Updation of the table");
				
				}
				
				
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}}
