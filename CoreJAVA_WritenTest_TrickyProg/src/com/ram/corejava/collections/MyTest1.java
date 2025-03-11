package com.ram.corejava.collections;

import java.util.ArrayList;
import java.util.List;
// What is the Output : 
public class MyTest1 {

	public static void main(String[] args) {
		 List mylist=new ArrayList();
		 mylist.add("One");
		 mylist.add("Two");
		 mylist.add("Three");
		 mylist.add(1,"Four");
		 System.out.println(mylist); 
		
	}
}
