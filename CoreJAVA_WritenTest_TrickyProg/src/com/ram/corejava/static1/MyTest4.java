package com.ram.corejava.static1;
// Recursive Method with No Base Case
//The recursive method infinite has no base case, 
//leading to a StackOverflowError.
public class MyTest4 {
    public static void main(String[] args) {
    	myInfinite();
    }

    public static void myInfinite() {
    	myInfinite(); // StackOverflowError
    }
}
