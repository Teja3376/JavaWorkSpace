package com.ram.corejava.multithreading;
/*
 Daemon threads do not prevent the JVM from shutting down 
 when all user threads are done.


 */
public class MyTest6_DaemonThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Daemon thread running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	MyTest6_DaemonThread t1 = new MyTest6_DaemonThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread ending");
    }
}
