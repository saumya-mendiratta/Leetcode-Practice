package Leetcode;

import java.util.HashMap;

public class Q560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int subarraySum(int[] nums, int k) {
	        
	        HashMap<Integer , Integer> map = new HashMap<>();
	        
	        int count =0;
	        
	            
	        int currsum = 0;
	        
	        for(int i =0 ; i < nums.length ; i++){
	            
	            currsum+=nums[i];
	            
	            if(currsum==k ) 
	                count++;
	            
	            if(map.containsKey(currsum-k)){
	                count+= map.get(currsum-k);
	            }
	            
	            //map me value daalne ke liye csum ki 
	            if(map.containsKey(currsum))
	                 map.put(currsum , map.get(currsum) +1);
	            else
	                map.put(currsum,1);
	            
	            
	        }
	        
	        return count;
	    }
}
