package Leetcode;

public class max_circular_sum_LT918 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -2, -3, -1 };
		System.out.println(maxSubarraySumCircular(nums));
	}

	public static int maxSubarraySumCircular(int[] A) {

		int kadaneAns = Kadane(A);
		int totalSum = 0;

		for (int i = 0; i < A.length; i++) {

			totalSum += A[i];
			// Inverting the array
			A[i] = -A[i];
		}

		// Calculating the max -ve sum
		int maxNegativeSum = Kadane(A);

		int res = totalSum + maxNegativeSum;

		//Means all the elements are negative
		if (res == 0) {
			return kadaneAns;
		}else {
			return Math.max(kadaneAns, res); 
		}

	}

	public static int Kadane(int[] nums) {

		int currentBest = nums[0];
		int overallBest = nums[0];

		for (int i = 1; i < nums.length; i++) {

//				------csum -ve aarha h toh apna bnale ------
			if (currentBest <= 0) {
				currentBest = nums[i];

//					------csum +ve aarha h toh ussi me judd jaa ------
			} else {
				currentBest += nums[i];
			}

			if (currentBest > overallBest)
				overallBest = currentBest;

		}

		return overallBest;

	}
}
