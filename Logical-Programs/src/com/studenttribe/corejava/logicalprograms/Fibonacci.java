package com.studenttribe.corejava.logicalprograms;

public class Fibonacci {
	public static void main(String[] args) {
		int fiba= 10;
		int n = 0;
		int n1 = 1;
		int n2 = 2;
		for(int i=0 ; i<=fiba ;i++) {
			n2 = n+n1;
			n=n1;
			n1= n2;
			System.out.println(n2);
		}
		System.out.println(n2);
	}
}
