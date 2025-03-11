package com.ram.corejava.exceptions;
/*
 . Nested Try-Catch-Finally:
   Each try-catch-finally block executes independently. 
   The inner finally block is executed before the outer catch block.
 */
public class MyTest4 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch");
            } finally {
                System.out.println("Inner Finally");
            }
        } catch (Exception e) {
            System.out.println("Outer Catch");
        } finally {
            System.out.println("Outer Finally");
        }
    }
}
