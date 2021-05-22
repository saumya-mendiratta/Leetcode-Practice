package Leetcode;

import java.util.Arrays;

public class Q287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static  int findDuplicate(int[] nums) {
		 
		int n = nums.length;
		int ans=0;
		int[] arr = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			
			if(arr[nums[i]]==0)
			arr[nums[i]]=1;
			else
			{
				ans=nums[i];
				break;
			}
		}
		
		return ans;
		
	 }
}
