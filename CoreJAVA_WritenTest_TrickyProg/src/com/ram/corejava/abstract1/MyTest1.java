package com.ram.corejava.abstract1;
/*
 Abstract classes can have constructors, which are called when a subclass 
 object is created.
 
 
 *
 *
 */
abstract class A {
    A() {
        System.out.println("Abstract class constructor");
    }
}

class B extends A {
    B() {
        System.out.println("Subclass constructor");
    }
}

public class MyTest1 {
    public static void main(String[] args) {
        B b = new B();
    }
}
