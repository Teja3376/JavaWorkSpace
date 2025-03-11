package com.ram.corejava.oops;
//Private methods are not inherited, so show in B is a new method, 
//not an override.
//The method myShow() from the type A is not visible
class A {
    private void myShow() {
        System.out.println("A");
    }
}
class B extends A {
    public void show() {
        System.out.println("B");
    }
}
public class MyTest1 {
    public static void main(String[] args) {
        B b = new B();
        b.show(); // B
        //b.myShow();
    }
}
