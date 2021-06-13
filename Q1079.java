package Leetcode;

import java.util.Arrays;

public class Q1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numTilePossibilities(String tiles) {

		char[] temparray = tiles.toCharArray();
		Arrays.sort(temparray);
		String s = new String(temparray);
		helper(s, "");
		int ans = count;
		count = 0;
		return ans;
	}

	static int count = 0;

	public static void helper(String tiles, String ans) {

		if (ans.length() != 0) {
			// System.out.println(ans);
			count++;
		}

		for (int i = 0; i < tiles.length(); i++) {

			if (i >= 1 && tiles.charAt(i) == tiles.charAt(i - 1))
				continue;

			helper(tiles.substring(0, i) + tiles.substring(i + 1), ans + tiles.charAt(i));

		}

	}

}
