package com.ram.corejava.strings;
//What is OUput :
// A. Hi World  B. Hello World C. Compile time Error D. Runtime Error
public class MyTest5_StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb;
		sb=new StringBuffer("Hello World");
		sb.replace(0,5,"Hi");
		System.out.println(sb); //Hi World 

	}

}

