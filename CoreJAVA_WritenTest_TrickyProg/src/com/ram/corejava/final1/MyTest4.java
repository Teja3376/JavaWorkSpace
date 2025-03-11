package com.ram.corejava.final1;
// final variables cannot be reassigned once initialized.


public class MyTest4 {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // Uncommenting this line will cause a compile-time error
        System.out.println(x);
    }
}
