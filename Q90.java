package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = { 1, 2, 2 };
		System.out.println(subsetsWithDup(nums));

	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Arrays.sort(nums);
		subsetHelperLastidx(nums, 0, list, list2);
		return list;
	}
	

	public static void subsetHelperLastidx(int[] nums, int lastidx, List<List<Integer>> list, List<Integer> list2) {

		list.add(new ArrayList<>(list2));

		for (int i = lastidx; i < nums.length; i++) {

			if(i>lastidx && nums[i]==nums[i-1])
				continue;
			
			list2.add(nums[i]);
			subsetHelperLastidx(nums, i + 1, list, list2);
			list2.remove(list2.size() - 1);

		}

	}
}
