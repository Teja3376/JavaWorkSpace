package com.studenttribe.corejava.logicalprograms;
public class Array_n {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 1, 2};
        int size = arr.length;
        int count = 1;
   		int appear = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] == appear)
                count++;
            else
                count--;
            if (count == 0) {
            	appear = arr[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == appear)
                count++;
        }
        if (count > size / 2)
            System.out.println("The majority element is " + appear);
        else
            System.out.println("No majority element found");
    }
}
