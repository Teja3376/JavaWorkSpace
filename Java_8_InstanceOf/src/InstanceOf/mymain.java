package InstanceOf;

class Employee{
	void diplay(){
		System.out.println("Hello");
	}
}
public class mymain{
	public static void main(String[] args) {
		int a =10;
		String name = "hello";
		mymain myobj = new mymain(); //main class obj 
		Employee emp = new Employee(); //first class obj
		System.out.println(name instanceof String); //boolean type
		System.out.println(emp instanceof Employee);
		System.out.println(myobj instanceof mymain);
	}
}
