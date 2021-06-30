package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q784 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(letterCasePermutation("3z4"));

	}


	public static List<String> letterCasePermutation(String s) {

		if (s.length() == 0) {
			List<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char c = s.charAt(0);
		String ros = s.substring(1);
		List<String> mr = new ArrayList<>();

		List<String> rr = letterCasePermutation(ros);

		for (String val : rr) {

			if (Character.isDigit(c)) {
				mr.add(c + val);
			} else {
				String temp = "" + c;
				mr.add(temp.toLowerCase() + val);
				mr.add(temp.toUpperCase() + val);
			}
		}

		return mr;
	}

}
