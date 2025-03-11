package com.ram.corejava.wrapper_caching;
//Integer Autoboxing
//For values outside the cached range (-128 to 127), 
//new objects are created, so a and b have different references.


public class MyTest2 {
    public static void main(String[] args) {
        Integer a = 500;
        Integer b = 500;
        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println(a == b); // false
        System.out.println(a1 == b1); //true
    }
}
