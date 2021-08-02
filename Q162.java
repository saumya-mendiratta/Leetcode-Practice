package Leetcode;

public class Q162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findPeakElement(int[] nums) {

		int lo = 0;
		int hi = nums.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			// BASE case for n-1th element
			if (mid == nums.length - 1)
				return mid;

			// case 4
			if (mid >= 1 && mid <= nums.length - 1 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
				return mid;
			// case 1
			else if (nums[mid + 1] > nums[mid])
				lo = mid + 1;
			// case 2 & 3
			else
				hi = mid - 1;

		}

		return 0;
	}

}
