package com.ram.corejava.arrays;

public class MyTest4 {

	public static void main(String[] args) {
		int [][] arr = new int[3][];
		arr[0]=new int[]{1,2};
		arr[1]=new int[]{4,5,6,7};
		arr[2]=new int[]{7,8,9};
		//System.out.println(arr[0]);
		System.out.println(arr[1][2]);
		System.out.println(arr.length);
	}
}
