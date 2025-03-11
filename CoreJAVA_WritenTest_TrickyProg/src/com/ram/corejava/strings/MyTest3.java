package com.ram.corejava.strings;
/*
 == compares references, while equals compares values. s1 and s2 
 have different references but the same value.


 */
public class MyTest3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
