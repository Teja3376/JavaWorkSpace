package com.ram.corejava.strings;
//Strings are immutable. Changing s1 does not affect s2.
public class MyTest2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        s1 = "World";
        System.out.println(s1); // World
        System.out.println(s2); // Hello
    }
}
