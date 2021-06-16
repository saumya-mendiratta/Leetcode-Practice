package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Q136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int singleNumber(int[] nums) {
	        
	        int setsum =0;
	        int numsum=0;
	        
	        Set<Integer> map = new HashSet<>();
	         
	        for(int i =0 ; i<nums.length ; i++){

	            if(!map.contains(nums[i]))
	            {
	                setsum+=nums[i];
	                map.add(nums[i]);
	            }
	            
	            numsum+=nums[i];     
	            
	        }
	        
	         
	        return 2*setsum - numsum;
	    }
}
