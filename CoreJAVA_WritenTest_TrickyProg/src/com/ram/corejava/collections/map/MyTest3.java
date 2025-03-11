package com.ram.corejava.collections.map;
/*
 HashMap with null Keys and Values :
 HashMap allows one null key, and the last inserted value
  for the null key is retained. It also allows multiple null values.


 */
import java.util.HashMap;

public class MyTest3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "value1");
        map.put("key1", null);
        map.put(null, "value2");
        System.out.println(map); // {null=value2, key1=null}
    }
}
