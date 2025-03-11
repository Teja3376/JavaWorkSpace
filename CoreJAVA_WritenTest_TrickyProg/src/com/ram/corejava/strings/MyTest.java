package com.ram.corejava.strings;
/*
 Method Overloading: Allows multiple methods with the same name but 
 different parameter types or numbers of parameters.
 method overloading and the way Java resolves method calls when null 
 is passed as an argument.
 */
public class MyTest {
    public static void main(String[] args) {
    	MyTest t = new MyTest();
        t.myMethod(null);
    }

    public void myMethod(Object o) {
        System.out.println("Object method");
    }

    public void myMethod(String s) {
        System.out.println("String method");
    }
}
