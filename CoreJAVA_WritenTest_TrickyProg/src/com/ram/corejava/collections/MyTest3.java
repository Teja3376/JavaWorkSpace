package com.ram.corejava.collections;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
/*
 Fail-fast vs. Fail-safe Iterators :
 CopyOnWriteArrayList uses a fail-safe iterator that allows 
 modification without throwing  ConcurrentModificationException.

 */
public class MyTest3 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            list.add("C");
            System.out.println(itr.next()); // No exception, prints A, B
        }
        System.out.println(list); // [A, B, C, C]
    }
}
