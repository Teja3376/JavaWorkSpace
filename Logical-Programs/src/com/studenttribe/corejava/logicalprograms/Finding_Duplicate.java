package com.studenttribe.corejava.logicalprograms;

public class Finding_Duplicate {
	public static void main(String[] args) {
		int a[] = {1,2,8,4,5,6,7,8,9,12};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
