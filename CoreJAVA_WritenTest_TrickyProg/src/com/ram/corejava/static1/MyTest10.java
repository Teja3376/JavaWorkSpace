package com.ram.corejava.static1;
/*
 Method Hiding :
 Static methods are hidden, not overridden, and the method 
 called depends on the reference type.

 */
class A5 {
    static void display() {
        System.out.println("Static method in A");
    }
}

class B5 extends A5 {
    static void display() {
        System.out.println("Static method in B");
    }
}

public class MyTest10 {
    public static void main(String[] args) {
        A5 a = new B5();
        a.display(); // Static method in A
    }
}
