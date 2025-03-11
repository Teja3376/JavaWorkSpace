package com.ram.corejava.strings;

public class MyTest4 {

	public static void main(String[] args) {
		String s1="Hello";
		String str2=new String("Hello");
		
		if(s1.equals(str2))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(s1==str2)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
