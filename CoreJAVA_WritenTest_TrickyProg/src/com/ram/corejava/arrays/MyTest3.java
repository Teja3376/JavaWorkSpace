package com.ram.corejava.arrays;
/*
  Array Covariance :
  Arrays are covariant, meaning String[] can be assigned to Object[],
   but storing incompatible types results in ArrayStoreException.
 */
public class MyTest3 {
    public static void main(String[] args) {
        Object[] objArray = new String[5];
        objArray[0] = "Hello";
        objArray[1] = 10; // ArrayStoreException at runtime
    }
}
