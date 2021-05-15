package Leetcode;

import java.util.HashMap;

public class Q525 {

	public static void main(String[] args) {

		int[] nums = {0,1};
		System.out.println(findMaxLength(nums));
	}

	public static int findMaxLength(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int sum = 0;
		int max = 0;

		map.put(0, -1);
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0)
				sum--;
			else
				sum++;

			if (map.containsKey(sum)) {
				int idx = map.get(sum);
				int len = i - idx;

				if (len > max)
					max = len;
			}else {
				map.put(sum, i);
			}

		}

		return max;
	}
}
