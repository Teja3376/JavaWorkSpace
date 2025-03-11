package com.ram.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTest1 {

	public static void main(String[] args) {
		 Map<String,Integer> myMap=new HashMap<>();;
		 
		 myMap.put("A",null);
		 myMap.put("B",2);
		 myMap.put(null,3);
		 
		 
		// System.out.println(myMap);
		 System.out.println(myMap.get(null));

	}

}
