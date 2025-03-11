package com.ram.corejava.constructors;
/*
 Constructor Chaining with this and super :
 The this() calls the other constructor in the same class, 
 and super() calls the   constructor of the superclass.
 */
class A4 {
    A4() {
        System.out.println("Class A Constructor");
    }
    A4(int t){
    	System.out.println("A4 : t value :"+t);
    }
}

class B4 extends A4 {
    B4() {
    	
        this(10);
        System.out.println("Class B Constructor");
    }
    
    B4(int x) {
    	 
        super(20);
        System.out.println("Class B Constructor with parameter: " + x);
    }
    B4(String c){
    	super();
    	System.out.println("Constructor String :"+c);
    }
}

public class MyTest3 {
    public static void main(String[] args) {
        B4 b = new B4();
        B4 b1 = new B4("JAVA");
    }
}
