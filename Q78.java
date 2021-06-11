package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q78 {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		System.out.println(subsets(nums));
	}

	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
//		subsetHelper(nums, 0, list, list2);
		subsetHelperLastidx(nums, 0, list, list2);
		return list;
	}

	public static void subsetHelper(int[] nums, int idx, List<List<Integer>> list, List<Integer> list2) {

		if (idx == nums.length) {
			list.add(new ArrayList<>(list2));
			return;
		}

		// Include
		list2.add(nums[idx]);
		subsetHelper(nums, idx + 1, list, list2);
		list2.remove(list2.size() - 1);

		// Not include
		subsetHelper(nums, idx + 1, list, list2);

	}

	public static void subsetHelperLastidx(int[] nums, int lastidx, List<List<Integer>> list, List<Integer> list2) {

		list.add(new ArrayList<>(list2));

		for (int i = lastidx; i < nums.length; i++) {

			list2.add(nums[i]);
			subsetHelperLastidx(nums, i + 1, list, list2);
			list2.remove(list2.size() - 1);

		}

	}

}
