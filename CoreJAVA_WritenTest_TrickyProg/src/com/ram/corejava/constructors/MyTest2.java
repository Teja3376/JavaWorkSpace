package com.ram.corejava.constructors;
//The default constructor initializes x to its default value, 0 for int.
class A1 {
    int x;
}

public class MyTest2 {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println(a.x); // 0
    }
}
