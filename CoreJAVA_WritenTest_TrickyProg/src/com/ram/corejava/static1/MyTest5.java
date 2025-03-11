package com.ram.corejava.static1;
//A non-static method can call a static method directly.


public class MyTest5 {
    public static void main(String[] args) {
    	MyTest5 t = new MyTest5();
        t.nonStaticMethod();
    }

    public void nonStaticMethod() {
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("Static method");
    }
}
