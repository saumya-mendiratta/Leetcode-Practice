package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] nums = {-1,0,1,2,-1,-4};
		int[] nums = { -2, 0, 0, 2, 2 };

		List<List<Integer>> ans = threeSum(nums);

		System.out.println(ans);
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		int a = 0;

		while (a < nums.length - 2) {

			if (a > 0 && nums[a] == nums[a - 1]) {
				a++;
				continue;
			}

			int low = a + 1;
			int high = nums.length - 1;
			int sum = 0 - (nums[a]);

			while (low < high) {

				List<Integer> list = new ArrayList<>();

				int bc = nums[low] + nums[high];

				if (bc == sum) {

					list.add(nums[a]);
					list.add(nums[low]);
					list.add(nums[high]);

					ans.add(list);

//						list.clear();

					while (low < nums.length - 1 && nums[low + 1] == nums[low]) {
						low++;
					}

					low++;

					while (high > 0 && nums[high - 1] == nums[high]) {
						high--;
					}

					high--;

				} else {

					if (bc < sum) {

						while (low < nums.length - 1 && nums[low + 1] == nums[low]) {
							low++;
						}

						low++;

					} else {

						while (high > 0 && nums[high - 1] == nums[high]) {
							high--;
						}

						high--;
					}

				}

			}

			a++;
		}

		return ans;
	}
}
