package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="";
		System.out.println(letterCombinations(s));
	}

	public static List<String> letterCombinations(String digits) {

		if (digits.length() == 0) {
			List<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = digits.charAt(0);

		String ros = digits.substring(1);

		List<String> rr = letterCombinations(ros);

		List<String> mr = new ArrayList<>();

		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {

			for (String val : rr) {
				mr.add(code.charAt(i)+val);
			}

		}
		
		return mr;
	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "";
		else if (ch == '2')
			return "abc";
		else if (ch == '3')
			return "def";
		else if (ch == '4')
			return "ghi";
		else if (ch == '5')
			return "jkl";
		else if (ch == '6')
			return "mno";
		else if (ch == '7')
			return "pqrs";
		else if (ch == '8')
			return "tuv";
		else if (ch == '9')
			return "wxyz";
		else
			return "";
	}
}
