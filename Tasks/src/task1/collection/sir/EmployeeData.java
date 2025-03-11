package task1.collection.sir;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class EmployeeData {
	public static void main(String[] args) {
		List <Employee> mylist = new ArrayList<Employee>();
		System.out.println("Enter Employee details limit: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Employee details: ");
		System.out.println("-----------------------------");
		for (int i=1;i<=n;i++) {
			Employee emp = new Employee();
			System.out.println("Enter Employee no: ");
			emp.setEno(sc.nextInt());
			System.out.println("Enter Employee Name: ");
			emp.setEname(sc.next());
			System.out.println("Enter Employee Salary: ");
			emp.setEsal(sc.nextDouble());
			System.out.println("-----------------------------");
			mylist.add(emp);
		}
		Iterator <Employee> emp = mylist.iterator();
		while(emp.hasNext()) {
			Employee emp1 = emp.next();
			System.out.println(emp1.getEno());
			System.out.println(emp1.getEname());
			System.out.println(emp1.getEsal());
		}
	}
}
