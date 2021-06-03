package Leetcode;

public class Max_subarray_KADANE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] nums = {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1};
		int [] nums= {0};
//		int[] nums = { 1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {

		int currentBest = nums[0];
		int overallBest = nums[0];

		for (int i = 1; i < nums.length; i++) {

//			------csum -ve aarha h toh apna bnale ------
			if (currentBest <0) {
				currentBest = nums[i];
				
//				------csum +ve aarha h toh ussi me judd jaa ------
			}else {
				currentBest += nums[i];
			}
	
			
			if (currentBest > overallBest)
				overallBest = currentBest;

		}

		return overallBest;

	}
}
