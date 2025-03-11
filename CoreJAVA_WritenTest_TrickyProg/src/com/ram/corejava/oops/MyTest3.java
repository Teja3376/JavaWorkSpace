package com.ram.corejava.oops;
/*
 Overloading with Varargs:
 The method with exact parameters is preferred over the varargs method.
 */
public class MyTest3 {
    public void method(int... nums) {
        System.out.println("Varargs method");
    }

    public void method(int a, int b) {
        System.out.println("a value :"+a);
        System.out.println("b value :"+b);
    }

    public static void main(String[] args) {
    	MyTest3 t = new MyTest3();
        t.method(1, 2); // Two parameters method
    }
}
