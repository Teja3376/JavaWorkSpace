package com.ram.corejava.general;
//Switch statements support String starting from Java 7.
public class MyTest1 {
    public static void main(String[] args) {
        String s = "Hello";
        switch (s) {
            case "Hello":
                System.out.println("Hello");
                break;
            case "World":
                System.out.println("World");
                break;
            default:
                System.out.println("Default");
        }
    }
}
