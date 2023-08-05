package LabProgram1114;

import java.util.*;

public class ParenthesesMatch {
	public static void main(String[] args) {
		System.out.println(checkParen("{( 19 +(<4*4>) * 49  + <1*1>)} + 12 "));
	}

	public static boolean checkParen(String s) {
		// implement this method to return true if grouping symbols match
		// each other, otherwise return false.

		/* Type your code here. */
		Stack<Character> parens = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{' || ch == '<') {
				parens.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}' || ch == '>') {
				if (parens.size() == 0) {
					return false;
				}
				char open = parens.pop();
				if (!(open == '(' && ch == ')' || open == '[' && ch == ']' || open == '{' && ch == '}' || open == '<' && ch == '>' )) {
					return false;
				}
			}
		}
		if (parens.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}