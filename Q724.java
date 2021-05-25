package Leetcode;

public class Q724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -1, -1, 0, 1, 1, 0 };

		System.out.println(pivotIndex(nums));
	}

	public static int pivotIndex(int[] nums) {

		int len = nums.length;

		int pivot = -1;
		int right = 0;

		int[] output = new int[len];

		output[0] = 0;

		for (int i = 1; i < nums.length; i++) {

			output[i] = nums[i - 1] + output[i - 1];

		}

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		System.out.println();

		for (int i = len - 1; i >= 0; i--) {

			if (i == len - 1) {
				right = 0;

				if (right == output[i])
					pivot = i;
			} else {
				right = right + nums[i + 1];

				if (right == output[i])
					pivot = i;

			}

		}

		return pivot;
	}
}
