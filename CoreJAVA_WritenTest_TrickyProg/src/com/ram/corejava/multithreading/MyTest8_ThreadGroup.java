package com.ram.corejava.multithreading;
/*
  Thread groups manage multiple threads as a single unit, 
  though they are rarely used in modern Java.


 */
public class MyTest8_ThreadGroup {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Parent Group");
        Thread t1 = new Thread(tg, new Runnable() {
            public void run() {
                System.out.println("Thread 1 running");
            }
        });
        Thread t2 = new Thread(tg, new Runnable() {
            public void run() {
                System.out.println("Thread 2 running");
            }
        });

        t1.start();
        t2.start();

        System.out.println("Active Threads: " + tg.activeCount());
    }
}
