package com.studenttribe.corejava.logicalprograms;

public class Palindrome {
	public static void main(String[] args) {
		int n=121;
		int n1=n;
		int rev = 0;
		while(n>0) {
			int rem = n%10; // to get value
			rev = rev *10 + rem;
			n = n/10; //to remove last value
		}
		if(rev==n1) {
			System.out.println("Palindrome : "+rev);
		}
		else {
			System.out.println("not a Palindrome : "+rev);
		}
	}
}
