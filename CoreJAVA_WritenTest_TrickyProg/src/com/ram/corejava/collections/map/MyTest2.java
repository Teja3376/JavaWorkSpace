package com.ram.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class MyTest2 {

	public static void main(String[] args) {
		 Map<Integer,String> myMap=new TreeMap<>();;
		 
		 myMap.put(3,"Three");
		 myMap.put(1,"One");
		 myMap.put(2,"Two");
		 
		 myMap.putAll(myMap);
		 System.out.println(myMap);

	}

}
