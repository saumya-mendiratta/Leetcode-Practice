package Leetcode;

import java.util.Arrays;
import java.util.List;

public class Q1239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxLength(List<String> arr) {

		helper(arr, 0, "");
		int ans = max;
		max = 0;
		return ans;
	}

	static int max = 0;

	public static void helper(List<String> arr, int lastidx, String ans) {

		char[] temp = ans.toCharArray();
		Arrays.sort(temp);
		String s = new String(temp);
		ans = s;
		// System.out.println(ans);

		int flag = 0;

		for (int i = 1; i < ans.length(); i++) {
			if (ans.charAt(i) == ans.charAt(i - 1))
				flag = 1;
		}

		if (flag == 0 && ans.length() > max)
			max = ans.length();

		if (lastidx == arr.size())
			return;

		for (int i = lastidx; i < arr.size(); i++) {

			helper(arr, i + 1, ans + arr.get(i));

		}

	}

}
