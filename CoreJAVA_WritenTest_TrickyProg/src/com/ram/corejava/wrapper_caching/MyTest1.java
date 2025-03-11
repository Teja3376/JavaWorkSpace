package com.ram.corejava.wrapper_caching;
//Integer caching happens for values between -128 and 127.
public class MyTest1 {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2); // true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4); // false
    }
}
