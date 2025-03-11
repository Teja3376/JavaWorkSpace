package com.ram.hibernate;

import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Insert_Employee {
	

	public static void main(String arr[]) throws Exception{
		
		
		 Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			 SessionFactory factory = cfg.buildSessionFactory();
				
			 
		   
		  try {
			  Session	session = factory.openSession();
			  Transaction tx = session.beginTransaction();
						  
			  Employee emp=new Employee();
			            emp.setEmpno(100);
			            emp.setEname("Raju");
			            emp.setSal(55000);
			            emp.setHiredate(new Date(2024-10-10));
			            emp.setDeptno(30);
			        session.save(emp);
			            System.out.println("Employee Record is Inserted..");
		 tx.commit();
		 session.close();
		  } catch (HibernateException e) {
				// TODO Auto-generated catch block
		       System.out.println("employee not found");
		       e.printStackTrace();
		       
			}
		
	}


}
