package com.ram.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
/*
 ConcurrentModificationException:
 Modifying a collection while iterating over it using an iterator
  results in ConcurrentModificationException
 */
public class MyTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            list.add("C"); // ConcurrentModificationException
            System.out.println(itr.next());
        }
    }
}
