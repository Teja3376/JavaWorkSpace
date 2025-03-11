package com.studenttribe.corejava.logicalprograms;

public class LargeAndSmall {
    public static void main(String[] args) {
        int[] arr = {1,23,445,677,86,54,2,10,76};
        int largenum = arr[0];
        int smallnum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largenum) {
            	largenum = arr[i];
            }
            if (arr[i] < smallnum) {
            	smallnum = arr[i];
            }
        }

        System.out.println("Largest element: " + largenum);
        System.out.println("Smallest element: " + smallnum);
    }
}
