package com.ram.corejava.static1;
/*
 Method calling only Addres of class :

 called depends on the Object  type.

 */
class A6 {
    public void display() {
        System.out.println(" method in A6");
    }
}

class B6 extends A6 {
   public void display() {
        System.out.println("method in B6");
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        A6 a = new B6();
        a.display(); //  method in B6
    }
}
