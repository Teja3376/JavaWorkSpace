package com.studenttribe.corejava.logicalprograms;

public class union {
	public static void main(String[] args) {
		int a[] = { 10,30,20,50,30};
		int b[] = { 30, 40, 50, 60, 70 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			int j = 0;
			for (j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					j = a.length;
				}
			}
			if (j == a.length) {
				System.out.println(b[i]);  
			}
		}
	}
}
