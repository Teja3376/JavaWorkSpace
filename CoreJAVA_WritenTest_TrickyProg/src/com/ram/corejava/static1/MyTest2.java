package com.ram.corejava.static1;
//Static methods are resolved at compile-time based on the 
//reference type, not runtime object.


class A {
    static void show() {
        System.out.println("A");
    }
}
class B extends A {
    static void show() {
        System.out.println("B");
    }
}
public class MyTest2 {
    public static void main(String[] args) {
        A a = new B();
        a.show(); // A
    }
}
