package com.ram.corejava.exceptions;
//An Integer cannot be cast to a String, resulting in ClassCastException.


public class MyTest1 {
    public static void main(String[] args) {
        Object obj = new Integer(100);
        String str = (String) obj; // Throws ClassCastException
        System.out.println(str);
    }
}
