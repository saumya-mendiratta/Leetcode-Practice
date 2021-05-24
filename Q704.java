package Leetcode;

public class Q704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,0,3,5,9,12};
		System.out.println(search(nums, 2));
	}

	public static int search(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		int mid = (high + low) / 2;
		
		while (low <= high) {


			if (target > nums[mid]) {
				low = mid + 1;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}

			mid = (high + low) / 2;
		}

		return -1;
	}
}
