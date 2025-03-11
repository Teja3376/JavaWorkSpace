package com.ram.corejava.static1;
/*
 Nested Static Classes:
 A static nested class can be instantiated without an 
 instance of the outer class.
 */
class Outer {
    static class Inner {
        void display() {
            System.out.println("Inner class");
        }
    }
}

public class MyTest7 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}

