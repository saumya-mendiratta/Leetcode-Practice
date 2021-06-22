package Leetcode;

import java.util.Stack;

public class Q394 {

	public static void main(String[] args) {

//		System.out.println(decodeString("3[a2[c]]"));

		char c = '3';

		System.out.println(c-'0');
	}

	public static String decodeString(String s) {

		Stack<String> strstack = new Stack<>();
		Stack<Integer> numstack = new Stack<>();

		String ans = "";
		String str = "";
		String ret = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '[' || s.charAt(i) == ']' || (s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'a' <= 26)) {

				if (s.charAt(i) != ']') {
					String temp = "" + s.charAt(i);
					strstack.push(temp);
				} else {

					ans = "";

					while (!strstack.isEmpty() && !strstack.peek().equals("[")) {
						// System.out.println(strstack.peek() + " ");
						str = strstack.peek() + str;
						strstack.pop();
					}

					if (!strstack.isEmpty())
						strstack.pop();

					int count = numstack.pop();
					// System.out.println(count);

					for (int k = 1; k <= count; k++)
						ans += str;

					strstack.push(ans);
					str = "";

				}

			} else {

				int num = Character.getNumericValue(s.charAt(i));
				numstack.push(num);
			}

		}

		while (!strstack.isEmpty())
			ret = strstack.pop() + ret;

		return ret;
	}

}
