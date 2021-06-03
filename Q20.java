package Leetcode;

import java.util.Stack;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(])";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {

		Stack s1 = new Stack();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				s1.push(s.charAt(i));

			} else {
				char clo = s.charAt(i);

				if (s1.size() > 0) {

					char open = (char) s1.peek();
					if (clo == ')' && open == '(') {
						s1.pop();
					} else if (clo == '}' && open == '{')
						s1.pop();
					else if (clo == ']' && open == '[')
						s1.pop();
					else
						return false;

				} else
					return false;

			}
		}

		if (s1.size() == 0)
			return true;
		else
			return false;
	}
}
