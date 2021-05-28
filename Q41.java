package Leetcode;

public class Q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1};
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {

		int i = 0;
//		int ans = 1;

		while (i < nums.length) {

			if (nums[i] <= 0 || nums[i] == i + 1 || nums[i] > nums.length) {
				i++;
			} else {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;

			}
		}

//		for(int val:nums) {
//			System.out.print(val + " ");
//		}
//		
//		System.out.println();
		
		for (int j = 0; j < nums.length; j++) {

			if (nums[j] != j + 1) {
				return j + 1;
			}

		}

		if(nums.length==0)
			return 1;
		else
		return nums[nums.length-1] +1 ;

	}
}
