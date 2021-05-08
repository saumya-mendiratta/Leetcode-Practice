package Leetcode;

import java.util.Arrays;

public class Q169 {

	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
	    System.out.println(majorityElement(nums));

	}

	 public static int majorityElement(int[] nums) {
		 
		 int n=nums.length/2;
		 
		 Arrays.parallelSort(nums);
	
		 return nums[n];
	 }
}
