package com.ram.corejava.arrays;
// Array indices start at 0, so the last valid index for 
//an array of size 5 is 4.


public class MyTest1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[5] = 50; // Throws ArrayIndexOutOfBoundsException
    }
}

