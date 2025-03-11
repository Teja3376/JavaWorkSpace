package com.ram.corejava.multithreading;
/*
 Thread Lifecycle: join():
 The join() method ensures the main thread waits for t1 to complete 
 before continuing.
 */
public class MyTest2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	MyTest2 t1 = new MyTest2();
        t1.start();
        t1.join(); // Main thread waits for t1 to finish
        System.out.println("Main thread running");
    }
}
