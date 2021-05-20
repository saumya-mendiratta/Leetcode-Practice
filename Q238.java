package Leetcode;

public class Q238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] productExceptSelf(int[] nums) {

		int len = nums.length;
		
		int product =1;
		
		int[] output = new int[len];
		
		for (int i = 1; i < nums.length; i++) {
			
			output[i]*= output[i-1];
			
		}
		
		
		output[len-1] = output[len-2];
		product*= nums[len-1];
		
		for (int i = len-2; i >=0; i--) {
			
			product *= nums[i];
			output[i] = output[i-1] * product;	
			
			if(i==0) {
				
				output[0]= product;
			}
			
		}
		
		return output;
	}

}
