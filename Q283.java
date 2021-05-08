package Leetcode;

public class Q283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void moveZeroes(int[] nums) {

		int lastNonZeroFoundAt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[lastNonZeroFoundAt++] = nums[i];
			}
		}

		for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
			nums[i] = 0;

		}

	}
}
