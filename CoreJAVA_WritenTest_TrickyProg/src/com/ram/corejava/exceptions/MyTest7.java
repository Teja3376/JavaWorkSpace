package com.ram.corejava.exceptions;

public class MyTest7 {
	
	 static  int myMethod() {
		int i=1;
		try {
			i= i + 1;
			return  i;
		 }
		 catch(Exception e)
		 {   i = i +2;
			 
		 }
		 finally {
			 i = i +3;
		 }
	    return i;

	}
	

	public static void  main(String[] args) {
		System.out.println(myMethod());

}}
