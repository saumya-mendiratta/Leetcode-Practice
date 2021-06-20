package Leetcode;

import java.util.HashSet;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {

		int i = 0;
		int j = i + 1;
		int count = 0;
		int max = 0;

		HashSet<Character> set = new HashSet<>();

		while (j < s.length()) {

			if (i != j)
				set.add(s.charAt(i));

			if (j <= s.length() - 1 && !set.contains(s.charAt(j))) {

				set.add(s.charAt(j));
				count = j - i + 1;
				j++;

			} else {

				while (set.contains(s.charAt(j))) {
					set.remove(s.charAt(i));
					// System.out.println(s.charAt(i));
					i++;
				}

				count = j - i + 1;

//				set.add(s.charAt(j));
//				j++;

			}

			if (count > max)
				max = count;

		}

		return max;

	}
}
