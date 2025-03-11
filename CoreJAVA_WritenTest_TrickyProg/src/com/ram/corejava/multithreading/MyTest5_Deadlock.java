package com.ram.corejava.multithreading;
/*
 Deadlock:
 This is  deadlock, where each thread is waiting
  for the other to release a lock.
 */
public class MyTest5_Deadlock {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1: Holding lock 1...");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    synchronized (lock2) {
                        System.out.println("Thread 1: Holding lock 1 & 2...");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread 2: Holding lock 2...");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    synchronized (lock1) {
                        System.out.println("Thread 2: Holding lock 2 & 1...");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
