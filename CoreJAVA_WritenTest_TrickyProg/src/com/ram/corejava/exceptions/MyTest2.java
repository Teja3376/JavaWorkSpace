package com.ram.corejava.exceptions;
/*
 * Return in Finally Block:
 The finally block executes after the try block and before the 
 method returns, overriding any   return value from the try block.
 */
public class MyTest2 {
    public static int method() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(method()); // 20
    }
}
