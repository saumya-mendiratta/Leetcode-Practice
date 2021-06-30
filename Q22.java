package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generateParenthesis(3));
	}

	public  static List<String> generateParenthesis(int n) {

		List<String> list = new ArrayList<String>();

		helper(n, "", list, 0, 0);

		return list;

	}

	public static void helper(int n, String ans, List<String> list, int opcount, int clcount) {

		if (clcount > opcount || opcount > n || clcount > n)
			return;

		if (opcount == n && clcount == n) {

			//System.out.println(ans);
			list.add(ans);
		}

		helper(n, ans + '(', list, opcount + 1, clcount);

		helper(n, ans + ')', list, opcount, clcount + 1);

	}

}
