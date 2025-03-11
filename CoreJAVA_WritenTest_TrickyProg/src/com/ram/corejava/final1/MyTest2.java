package com.ram.corejava.final1;
//final parameters cannot be reassigned inside the method.
public class MyTest2 {
    public static void main(String[] args) {
        final int x = 10;
        myModify(x);
    }

    public static void myModify(final int a) {
        // a = 20; // Compile-time error
        System.out.println(a);
    }
}
