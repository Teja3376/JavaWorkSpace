package com.ram.corejava.multithreading;
/*
 Thread with Multiple Start Calls:
 Calling start() on a thread that has already been started 
 throws an IllegalThreadStateException.
 */
public class MyTest1 extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
    	MyTest1 t = new MyTest1();
        t.start();
        t.start(); // IllegalThreadStateException
    }
}
