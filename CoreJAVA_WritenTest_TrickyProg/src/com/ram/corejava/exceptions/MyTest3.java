package com.ram.corejava.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
 Method Overriding with Exception Handling:
  The overriding method can throw a subclass of the exception 
  declared in the parent method.
 */
class A {
    void display() throws IOException {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void display() throws FileNotFoundException {
        System.out.println("Class B");
    }
}

public class MyTest3 {
    public static void main(String[] args) {
        try {
            A a = new B();
            a.display(); // Class B
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
