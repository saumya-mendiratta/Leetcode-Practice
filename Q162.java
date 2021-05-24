package Leetcode;

public class Q162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findPeakElement(int[] nums) {

		int low = 0;
		int high = nums.length - 1;

		int mid = (high + low) / 2;

		while (low <= high) {

			if (mid < nums.length - 1 && nums[mid + 1] > nums[mid]) {
				low = mid + 1;
			} else if (mid > 0 && nums[mid - 1] > nums[mid]) {
				high = mid - 1;
			} else if (mid < nums.length - 1 && mid > 0 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				return mid;
			}

			else
				return mid;

			mid = (high + low) / 2;
		}

		return -1;

	}

}
