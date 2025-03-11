package com.ram.corejava.collections.map;

import java.util.HashMap;
/*
 HashMap Key Modification
 Modifying the key reference after inserting it into 
 HashMap does not affect the map since keys are looked up
  based on their hash code, which is computed when they are added.
 */
public class MyTest4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String key = new String("key");
        map.put(key, "value");
        key = key + "modified";
        System.out.println(map.get("key")); // value
    }
}
