package com.studenttribe.stacks;

import java.util.Stack;

public class Stack_demo1 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.add("hello");
		mystack.add("charan");
		mystack.add("Teja");
		System.out.println(mystack);
		//First in First Out
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	}
}
