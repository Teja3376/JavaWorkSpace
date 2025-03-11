package com.ram.corejava.oops;

public class MyTest2 {
    public void method(int... nums) {
        System.out.println("Varargs method");
    }

    public void method(int a, int b) {
        System.out.println("Two parameters method");
    }

    public static void main(String[] args) {
    	MyTest2 t = new MyTest2();
        t.method(1, 2); // Two parameters method
    }
}
