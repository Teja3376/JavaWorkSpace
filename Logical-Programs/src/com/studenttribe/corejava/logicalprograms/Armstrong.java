package com.studenttribe.corejava.logicalprograms;

public class Armstrong {
	public static void main(String[] args) {
		int sum = 0;
		int n = 143;
		int n1 = n;
		int n2 = n;
		int count = 0;
		while (n>10) {
			count++;
			n=n/10;
		}
		while(n1>0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem,count));
			n1 = n1/10;
		}
		if(sum == n1) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a Armstrong");
		}
	}
}
