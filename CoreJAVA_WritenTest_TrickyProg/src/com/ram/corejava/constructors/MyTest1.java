package com.ram.corejava.constructors;
//Constructor Chaining
//Constructors in the superclass are called before the subclass's 
//constructors.


class A {
    A() {
        System.out.println("A");
    }
}
class B extends A {
    B() {
        System.out.println("B");
    }
}
public class MyTest1 {
    public static void main(String[] args) {
        B b = new B(); // A B
    }
}
