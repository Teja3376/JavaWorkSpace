package com.ram.corejava.collections;

import java.util.HashSet;
/*
 HashSet with Duplicate Objects :
 HashSet uses hashCode() and equals() to check for duplicates. Here, 
 both methods are overridden to treat all objects as equal,
  resulting in only one entry.

 */
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
   
    @Override
    public int hashCode() {
        return 1;
    }
    
    @Override
    public boolean equals(Object obj) {
        return true;
    }


}
public class MyTest4 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("A"));
        set.add(new Person("B"));
        System.out.println(set.size()); // 1
    }
}
