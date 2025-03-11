package com.ram.corejava.multithreading;
/*
 ThreadLocal Example:
 ThreadLocal provides thread-local variables, ensuring that
  each thread has its own isolated copy.
 */
public class MyTest7_ThreadLocal {
    static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 1;
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 1 Initial Value: " + threadLocal.get());
                threadLocal.set(2);
                System.out.println("Thread 1 Modified Value: " + threadLocal.get());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 2 Initial Value: " + threadLocal.get());
                threadLocal.set(3);
                System.out.println("Thread 2 Modified Value: " + threadLocal.get());
            }
        });

        t1.start();
        t2.start();
    }
}
