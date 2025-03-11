package com.ram.corejava.static1;
// Static blocks execute before the main method when the class is loaded.
public class MyTest1 {
	static {
		System.out.println("Static Block-1");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
	}
	static {
		System.out.println("Static Block-2");
	}
}
