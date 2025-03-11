package com.ram.corejava.static1;
//Instance Initialization Block :
// Instance Initialization Blocks (IIBs) run each time 
//an object is created, before the constructor.
public class MyTest6 {
    {
        System.out.println("Instance Initialization Block");
    }
    MyTest6(){
    	System.out.println("Constructor");
    }
    static {
    	System.out.println("Static Block"
    			+ "");
    }
    public static void main(String[] args) {
    	MyTest6 t = new MyTest6();
        
    }
}
