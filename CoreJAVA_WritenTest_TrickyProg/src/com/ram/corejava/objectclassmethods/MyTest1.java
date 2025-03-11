package com.ram.corejava.objectclassmethods;
/*
  Finalize Method:
  The finalize method is called by the garbage collector before 
  an object is reclaimed.
 */
public class MyTest1 {
    public static void main(String[] args) {
    	MyTest1 t = new MyTest1();
        t = null;
        System.gc(); // Suggests the JVM to call garbage collector
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");
    }
}
