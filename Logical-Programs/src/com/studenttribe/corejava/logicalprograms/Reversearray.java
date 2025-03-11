package com.studenttribe.corejava.logicalprograms;

public class Reversearray {
	public static void main(String[] args) {
		int a[] = {1,3,4,5,6,7,4,2};
		int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for(int j=0;j<a.length;j++) {
        	System.out.println(a[j]);
        }
	}
}
