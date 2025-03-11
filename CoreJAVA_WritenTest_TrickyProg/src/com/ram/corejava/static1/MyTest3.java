package com.ram.corejava.static1;
//Uninitialized static variables have default values (0 for int).
// static variables have default values for String is null
public class MyTest3 {
    static int x;
   static String name;
    public static void main(String[] args) {
        System.out.println(x); // 0
        System.out.println(name);
    }
}
