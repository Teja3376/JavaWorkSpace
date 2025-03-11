package com.ram.corejava.static1;
/*
 Static Variables in Inheritance:
 Static variables are accessed using the class in which they are declared, 
 not through inheritance.
 */
class A2 {
    static int x = 10;
}

class B2 extends A2 {
    static int x = 20;
}

public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(A2.x); // 10
        System.out.println(B2.x); // 20
    }
}
