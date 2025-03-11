package task2.collection.me;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentData {
	public static void main(String[] args) {
		List <Student> mylist = new ArrayList<Student>();
		System.out.println("Enter the Limit of the Database: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("_____________________________________");
		System.out.println("Enter the Student Details : ");
		for( int i=1; i<=n;i++) {
			Student st = new Student();
			System.out.println("Enter Student no: ");
			st.setSno(sc.nextInt());
			System.out.println("Enter Student name: ");
			st.setSname(sc.next());
			System.out.println("Enter Student Mobile No: ");
			st.setSnumber(sc.nextLong());
			System.out.println("_____________________________________");
			mylist.add(st);
		}
		Iterator<Student> stu = mylist.iterator();
		while (stu.hasNext()) {
			Student s = stu.next();
			System.out.println("Student no: "+s.getSno());
			System.out.println("Student name: "+s.getSname());
			System.out.println("Student Mobile No: "+s.getSnumber());
		}
	}
}
