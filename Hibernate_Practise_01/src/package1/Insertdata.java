package package1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insertdata {
	public static void main(Strings[] args) {
//		Configuration cfg = new Configuration();
		 Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		 SessionFactory factory = cfg.buildSessionFactory();
		 try {
			 Session session =factory.openSession();
			 Transaction tx = session.beginTransaction();
			 	StudentBean student = new StudentBean();
			 	student.setSno(1);
			 	student.setSname("Teja");
			 	student.setAge(20);
			 	session.save(student);
			 	tx.commit();
			 
		 }
		 catch(Exception e) {
			 
			 System.out.println(e);
		 }
	}
}
