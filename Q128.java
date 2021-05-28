package Leetcode;

import java.util.HashMap;

public class Q128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int val : nums) {

			if (!map.containsKey(val)) {

				if (map.containsKey(val + 1)) {
					map.put(val + 1, false);
				}

				if (map.containsKey(val - 1)) {
					map.put(val, false);
					continue;
				}

				map.put(val, true);

			}

		}

		// System.out.println(map.keySet());
		int maxcount = Integer.MIN_VALUE;

		for (int val : map.keySet()) {

			int count = 0;
			boolean value = map.get(val);

			// System.out.println(val + " " + value);
			if (value) {
				int i = 0;
				while (map.containsKey(val + i)) {
					count = count + 1;
					i++;
				}
			}

			if (count > maxcount)
				maxcount = count;
		}
		
		return maxcount;
	}
}
