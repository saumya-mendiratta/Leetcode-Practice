package Leetcode;

import java.util.HashMap;

public class Q1512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums ={6,5,1,5,7,7,9,1,5,7,1,6,10,9,7,4,1,8,7,1,1,8,6,4,7,4,10,5,3,9,10,1,9,5,5,4,1,7,4,2,9,2,6,6,4,2,10,3,5,3,6,4,7,4,6,4,4,6,3,4,10,1,10,6,10,4,9,6,6,4,8,6,9,5,4};
		System.out.println(numIdenticalPairs(nums));
	}

	public static int numIdenticalPairs(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}

		}

		System.out.println(map);
		System.out.println(map.keySet());
		int ans = 0;

		for (int val : map.keySet()) {

			if (map.get(val) > 1)
				ans += nCr(map.get(val), 2);
		}

		return ans;
	}

	static int nCr(int n, int r) {
		return (int) (fact(n) / (fact(r) * fact(n - r)));
	}

	static long fact(int n) {
		long res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}
}
