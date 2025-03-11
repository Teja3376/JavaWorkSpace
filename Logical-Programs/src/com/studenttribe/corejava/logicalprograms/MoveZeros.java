package com.studenttribe.corejava.logicalprograms;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 7, 0, 8}; //array 1
        int size = arr.length;
        int count = 0; //count 
        for (int num : arr) {
            if (num == 0) {
                count++; // count increase in this situatiom
            }
        }
        int[] arr2 = new int[size - count];
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr2[index++] = num;
            }
        }
        Arrays.sort(arr2);
        index = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr[index++] = arr2[i];
        }
        for (int i = arr2.length; i < size; i++) {
            arr[index++] = 0;
        }
        System.out.println("Array after moving zeros:");
        System.out.println(Arrays.toString(arr));
    }
}
