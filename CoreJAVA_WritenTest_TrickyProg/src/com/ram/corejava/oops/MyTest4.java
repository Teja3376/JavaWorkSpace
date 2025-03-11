package com.ram.corejava.oops;
/*
  Covariant Return Type:
  Overriding methods can return a subtype of the original return type 
  (covariant return type).
 */
class A3 {
    A3 display() {
        System.out.println("A");
        return this;
    }
}

class B3 extends A3 {
    @Override
    B3 display() {
        System.out.println("B");
        return this;
    }
}

public class MyTest4 {
    public static void main(String[] args) {
    	A3 a = new A3();
        a.display(); // A
    	
        B3 b = new B3();
        b.display(); // B
    }
}
