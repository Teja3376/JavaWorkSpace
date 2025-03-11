package com.ram.corejava.exceptions;

public class MyTest5 {

	public static void main(String[] args) {
		 try {
			 System.out.println("In try");
			 System.exit(0);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 finally {
			 System.out.println("Finally Block ");
		 }

	}

}
