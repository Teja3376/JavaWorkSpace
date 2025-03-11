package com.ram.corejava.multithreading;
/*
 Thread Priorities
Thread priority hints to the scheduler which thread should be prioritized,
 but the actual behavior  is JVM and OS dependent.
 */
public class MyTest3 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
    	MyTest3 t1 = new MyTest3();
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        MyTest3 t2 = new MyTest3();
        t2.setPriority(Thread.MAX_PRIORITY); // Priority 10
        t1.start();
        t2.start();
    }
}
