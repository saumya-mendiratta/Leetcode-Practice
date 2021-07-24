package Leetcode;

import java.util.Stack;

public class Contest_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkZeroOnes("10011010011"));
	}

	public static boolean checkZeroOnes(String s) {

		int c0 = 0;
		int maxc0 = 0;

		int c1 = 0;
		int maxc1 = 0;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			stack.push(s.charAt(i));

		}

		while (!stack.isEmpty()) {

			char ele = stack.pop();

			if (ele == '0') {
				c0++;
				c1 = 0;
			} else {
				c1++;
				c0 = 0;
			}

			if (c1 > maxc1) {
				maxc1 = c1;
//				c1 = 0;
			}
			if (c0 > maxc0) {
				maxc0 = c0;
//				c0 = 0;
			}

		}

		return maxc1 > maxc0;

	}
}
