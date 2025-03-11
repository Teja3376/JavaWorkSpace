package com.studenttribe.corejava.logicalprograms;

import java.util.Scanner; // Import Scanner class for console input

public class ValidParentthese {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		String s = "({[]})";
		System.out.println("Enter"+ valid(s));
	}
	public static boolean valid(String s) {
		while(true) {
			if(s.contains("()")) {
				s = s.replace("()", "");
				System.out.println(s);
			}
			else if(s.contains("{}")) {
				s = s.replace("{}", "");
				System.out.println(s);
			}
			else if(s.contains("[]")) {
				s = s.replace("[]", "");
				System.out.println(s);
			}
			else {
				return s.isEmpty();
			}
		}
	}
	
}
