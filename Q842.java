package Leetcode;

import java.util.ArrayList;
import java.util.List;

import com.sun.scenario.animation.SplineInterpolator;

public class Q842 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		helper("1235", "");
		System.out.println(splitIntoFibonacci("1011"));
	}

	public static List<Integer> splitIntoFibonacci(String num) {

		List<Integer> list = new ArrayList<>();
		List<Integer> main = new ArrayList<>();
		helper(num, list, main);
		return main;

	}

	public static void helper(String num, List<Integer> list, List<Integer> main) {

		if (num.length() == 0) {

			// ek baar main list me add hgya toh dubara ans aane pe add nai krna
			if (list.size() >= 3 && main.size() == 0)
				main.addAll(list);
//				System.out.println(list);
			return;
		}

		for (int i = 0; i < num.length() && i <= 10; i++) {

			String right = num.substring(0, i + 1);
			String ques = num.substring(i + 1);

			// preeciding zeroes not allowed
			if (right.length() > 1 && right.charAt(0) == '0')
				continue;

			if (isRange(right)) {
				int rightnum = Integer.parseInt(right);

				if (isFibbo(list, rightnum)) {
					list.add(rightnum);
					helper(ques, list, main);
					list.remove(list.size() - 1);
				}

			}
		}

	}

	public static boolean isRange(String right) {

		if (right.length() >= 11)
			return false;

		return Long.parseLong(right) <= Math.pow(2, 31) - 1;
	}

	public static boolean isFibbo(List<Integer> list, int num) {

		if (list.size() < 2)
			return true;

		int last = list.get(list.size() - 1);
		int slast = list.get(list.size() - 2);

		return num == last + slast;

	}

}
