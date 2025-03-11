package com.studenttribe.stacks;

import java.util.Stack;

public class Stack_demo4 {
	public static void main(String[] args) {
		Stack<String> mystack = new Stack();
		
		//push method is to add the values
		mystack.push("1st Enter"); //as 3rd proiorty
		mystack.push("2nd Enter"); //as 2nd proiorty
		mystack.push("3rd Enter"); //as 1st proiorty
		System.out.println(mystack);
		
		System.out.println(mystack.search("3rd Enter"));
		
	}
}
