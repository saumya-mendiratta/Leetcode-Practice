package Leetcode;

import java.util.Arrays;

public class Q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getPermutation(5, 25));
	}

	static long count = 0;
	static String res = "";
	static int flag = 0;

	public static String getPermutation(int n, int k) {

		boolean[] availabible = new boolean[n];
		Arrays.fill(availabible, true);

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = i + 1;

		res = "";
		long fact = factorial(n - 1);

		int idx = (int) (k / fact);

		if (k % fact == 0)
			idx -= 1;

		count = (idx) * fact;
		flag = 0;

		helper(arr, idx, k, availabible, "");

		return res;
	}

	public static void helper(int[] arr, int idx, int k, boolean[] availabible, String ans) {

		if (ans.length() == arr.length) {
//				System.out.println(ans);
			count++;
			if (count == k) {
				res = ans;
				flag = 1;
			}

			return;
		}

		if (flag == 1)
			return;

		int i = 0;

		if (ans == "")
			i = idx;

		while (i < arr.length) {

			if (!availabible[i]) {
				i++;
				continue;
			}

			availabible[i] = false;

			helper(arr, idx, k, availabible, ans + arr[i]);

			availabible[i] = true;

			i++;
		}

	}

	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
