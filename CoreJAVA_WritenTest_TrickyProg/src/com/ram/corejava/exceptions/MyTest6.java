package com.ram.corejava.exceptions;

public class MyTest6 {
	
	 static  int myMethod() {
		 
		try {
			 
			return  10;
		 }
		 catch(Exception e)
		 {    
			 return  20; 
		 }
		 finally {
			return 30;
		 }
	    

	}
	

	public static void  main(String[] args) {
		System.out.println(myMethod());

}}
