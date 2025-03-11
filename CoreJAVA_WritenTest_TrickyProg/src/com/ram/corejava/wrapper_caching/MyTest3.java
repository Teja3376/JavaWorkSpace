package com.ram.corejava.wrapper_caching;
/*
 Autoboxing with null:
 Unboxing a null Integer to an int causes a NullPointerException.
 */
public class MyTest3 {
    public static void main(String[] args) {
        Integer i = null;
        int j = i; // NullPointerException
    }
}
