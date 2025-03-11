package com.ram.corejava.general;
/*
 Main Method Overloading:
  The JVM always calls the main(String[] args) method as the
   entry point, ignoring other overloaded main methods.


 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println("Main method");
    }

    public static void main(int[] args) {
        System.out.println("Overloaded main method");
    }
}
