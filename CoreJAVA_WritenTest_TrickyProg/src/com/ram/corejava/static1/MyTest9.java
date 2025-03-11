package com.ram.corejava.static1;
/*
 Static Variable Initialization :
 Static blocks can be used to initialize static variables, 
 and they run once when the class is loaded.

 */
public class MyTest9 {
    static int x = 10;

    static {
        x = x * 2;
    }

    public static void main(String[] args) {
        System.out.println(x); // 20
    }
}
