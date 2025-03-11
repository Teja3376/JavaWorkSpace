package com.ram.corejava.final1;

// final variable has to   initialize the value
// or we can initialize value through constructor 
public class MyTest3 {

	final int t;
	
	MyTest3(int k){
		this.t=k;
	}
	
	
	public static void main(String[] args) {
		MyTest3 t3=new MyTest3(10);

	}

}
