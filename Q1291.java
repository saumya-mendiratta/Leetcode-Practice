package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import sun.misc.Queue;

public class Q1291 {

	public static void main(String[] args) {
		
		sequentialDigits(1000, 13000);
		
	}

	public static List<Integer> sequentialDigits(int low, int high) {

		helper(0, low, high);
		Collections.sort(list);
		List<Integer> ans = new ArrayList<>(list);
		list.removeAll(list);
		return ans;
	}

	static List<Integer> list = new ArrayList<>();

	public static void helper(int curr, int low, int high) {

		if (curr > high)
			return;

		if (curr >= low && curr <= high) {
//				System.out.println(curr);
			list.add(curr);
//				return nahi krna kyuki 1234 ke baad 12345 bhi chaiye
		}

		if (curr == 0) {

			for (int i = 1; i <= 8; i++) {

				helper(i, low, high);
			}

		}

		else {
			int ld = curr % 10;
			if (ld < 9)
				helper(curr * 10 + (ld + 1), low, high);
		}

	}

}
