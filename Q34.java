package Leetcode;

import java.util.Arrays;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int[] nums = { 3, 3, 3 ,3};

		int[] arr = searchRange(nums, 3);

		for (int val : arr)
			System.out.println(val);
	}

	public static int[] searchRange(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;
		int mid = (high + low) / 2;

		int[] arr = new int[2];

		Arrays.fill(arr, -1);

		while (low <= high) {

			if (nums[mid] > target) {
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] == target) {

				int left = mid ;
				int right = mid;

				int lefthelper=left;
				int righthelper=right;
				
				while (left>0 && nums[left-1] == target ) {
					left--;
					lefthelper=left;
				}

				while (right < nums.length - 1  &&  nums[right+1] == target) {
					right++;
					righthelper=right;
				}

				arr[0] = lefthelper;
				arr[1] = righthelper;

				return arr;
			}

			mid = (high + low) / 2;
		}

		return arr;
	}
}
