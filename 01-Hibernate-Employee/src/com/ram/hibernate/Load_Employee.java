package com.ram.hibernate;
//import org.hibernate.cfg.*;
//import org.hibernate.*;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Load_Employee {
	
  
	public static void main(String arr[]) throws Exception{
		
		
		 Configuration cfg = new Configuration();
			cfg.configure();
			 SessionFactory factory;
			factory = cfg.buildSessionFactory();
				
			Session session= factory.openSession();
			
			 Transaction tx = session.beginTransaction();
		  try {
			  	session = factory.openSession();
			  	
			                     //"slect * from employee where empid=1"
			  Employee emp = (Employee) session.load(Employee.class, new Integer(100));	
		
		     
			  System.out.println("Employee name: " + emp.getEmpno());   
			System.out.println("Employee name: " + emp.getEname());
			System.out.println("Employee sal: " + emp.getSal());
			System.out.println("Employee hire date: " + emp.getHiredate());
			System.out.println("Employee dept no: " + emp.getDeptno());
		
		
		  } catch (HibernateException e) {
				// TODO Auto-generated catch block
		       System.out.println("employee not found");
		       e.printStackTrace();
		       
			}
		
	}


}
