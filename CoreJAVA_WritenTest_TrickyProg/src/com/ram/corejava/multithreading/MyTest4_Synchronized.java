package com.ram.corejava.multithreading;
/*
 Thread Synchronization with synchronized Method :
 The synchronized keyword ensures that only one thread can execute
  the printNumbers() method at a time on the same object.
 */
public class MyTest4_Synchronized {
    synchronized void printNumbers() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
    	MyTest4_Synchronized obj = new MyTest4_Synchronized();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.printNumbers();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.printNumbers();
            }
        });
        t1.start();
        t2.start();
    }
}
