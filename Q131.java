package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(partition("aab"));
	}

	public static List<List<String>> partition(String s) {

		List<String> list = new ArrayList<String>();
		List<List<String>> list2 = new ArrayList<>();
		helper(s, "", list, list2);
		return list2;
	}

	public static void helper(String s, String ans, List<String> list, List<List<String>> list2) {

		if (s.length() == 0) {
			List<String> br = new ArrayList<String>(list);
			list2.add(br);
			return;
		}

		for (int i = 0; i < s.length(); i++) {

			String ros = s.substring(i + 1);
			String right = s.substring(0, i + 1);

			if (isPalindrome(right)) {
				//System.out.println(right);
				list.add(right);
				helper(ros, "", list, list2);
				list.remove(list.size() - 1);
			}

		}

	}

	public static boolean isPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}

}
