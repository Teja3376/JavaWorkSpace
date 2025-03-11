package com.ram.corejava.abstract1;
// static methods are hidden , not overridden
// static method of the parent class is hidden by the static method of the subclass,
// and which method gets called depends on the type of the reference variable 
// stati methods will call by type of reference not object 
abstract class Writer {
	public static void write() {
		System.out.println("Writer... write method "); 		
	}
}
class Author extends Writer {	
	public static  void write() {
		System.out.println("Writing Book..."); 		
	}
}
class Programmer extends Writer {	
	public static void write() {
		System.out.println("Writing Code...Programmer"); 
		
	}
}
public class MyTest2 {

	public static void main(String[] args) {
		Writer w= new Programmer();
		w.write();

	}

}
