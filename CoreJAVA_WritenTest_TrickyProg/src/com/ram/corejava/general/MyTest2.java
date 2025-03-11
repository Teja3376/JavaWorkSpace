package com.ram.corejava.general;
//The else block is unreachable because the condition if (true) 
//always evaluates to
public class MyTest2 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello");
        } else {
            System.out.println("World"); // Unreachable code
        }
    }
}
