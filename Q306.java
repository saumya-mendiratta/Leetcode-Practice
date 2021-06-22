package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q306 {

	public static void main(String[] args) {

		System.out.println(isAdditiveNumber("5555558"));

	}

	public static boolean isAdditiveNumber(String num) {

		List<Integer> list = new ArrayList<>();
		List<Integer> main = new ArrayList<>();
		helper(num, list, main);
		return !main.isEmpty();

	}

	public static void helper(String s, List<Integer> list, List<Integer> main) {

		if (s.length() == 0) {

			if (list.size() >= 3) {
//				System.out.println(list);
				main.addAll(list);
			}

			return;

		}

		for (int i = 0; i < s.length() && i < 11; i++) {

			String ans = s.substring(0, i + 1);
			String ques = s.substring(i + 1);

			if (ans.length() > 1 && ans.charAt(0) == '0')
				continue;

			if (inRange(ans)) {
				int ansnum = Integer.parseInt(ans);

				if (isValid(list, ansnum)) {
					list.add(ansnum);
					helper(ques, list, main);
					list.remove(list.size() - 1);
				}

			}
		}

	}

	public static boolean isValid(List<Integer> list, long ansnum) {

		if (list.size() < 2)
			return true;

		int last = list.get(list.size() - 1);
		int slast = list.get(list.size() - 2);

//		System.out.println(ansnum);
//		System.out.println(list.size());

		return last + slast == ansnum;

	}

	public static boolean inRange(String ansnum) {

		if (ansnum.length() > 11)
			return false;

		return Long.parseLong(ansnum) <= Math.pow(2, 31) - 1;

	}

}
