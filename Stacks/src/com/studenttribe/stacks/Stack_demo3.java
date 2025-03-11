package com.studenttribe.stacks;

import java.util.Stack;

public class Stack_demo3 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		
		//push method is to add the values
		mystack.push("1st Enter");
		mystack.push("2nd Enter");
		mystack.push("3rd Enter");
		System.out.println(mystack);
		
		System.out.println(mystack.peek());
		System.out.println(mystack);
		
	}
}
