package com.studenttribe.corejava.logicalprograms;
import java.util.Scanner; // Import Scanner class for console input

public class ValidParentthese1 {
    public static boolean valid(String s) {
        // Loop until no more pairs can be removed
        boolean changed;
        do {
            changed = false;
            if (s.contains("()")) {
                s = s.replace("()", "");
                changed = true;
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
                changed = true;
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
                changed = true;
            }
        } while (changed); // Continue until no changes are made

        // If the string is empty, it means all pairs were balanced
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with parentheses, braces, and brackets:");
        String s = sc.nextLine(); // Read the entire line
        System.out.println(valid(s) ? "Valid" : "Invalid");
    }
}
