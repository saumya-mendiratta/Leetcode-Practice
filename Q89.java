package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q89 {

	public static void main(String[] args) {

		System.out.println(grayCode(2));
	}

	public static List<Integer> grayCode(int n) {

		if (n == 0) {
			List<Integer> br = new ArrayList<Integer>();
			br.add(0);
			return br;
		}

		List<Integer> rr = grayCode(n - 1);

		List<Integer> mr = new ArrayList<>(rr);

		for (int i = rr.size() - 1; i >= 0; i--) {

			int num = (int) Math.pow(2, n - 1);
			mr.add(num + rr.get(i));
		}

		return mr;
	}
}
