package com.studenttribe.corejava.logicalprograms;

public class Consecutive {
	public static void main(String[] args) {
		int a[] = {11,12,14,15};
		int n = a.length + 1; 
		int min = a[0];
        int max = a[a.length - 1];
        int na = 0;
        int nac = 0;

        for (int i = 1; i <= max; i++) {
        	na= na+i;

        }

        for (int num : a) {
            nac = nac + num;
        }

        int miss = na - nac;
        System.out.println("The missing number is: " + miss);
	}
}
