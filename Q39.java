package Leetcode;
import java.util.List;

import java.util.ArrayList;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 5 };
		
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		coinUnlimited(candidates, 0, target, list, list2);
		return list;
	}
	
	  public static void coinUnlimited(int[] arr ,  int lastidx , int money ,  List<List<Integer>> list ,  List<Integer> list2 ) {
			
			if(money==0) {
				//new list bnake add kra kyuki agar temp daal dete toh jab bhi temp me change krte list ke andar bhi changes hojate 
				//so add the copy of ans list2
				list.add(new ArrayList<Integer>(list2));
	            return;
			}
			
			if(money<0 || lastidx==arr.length)
				return;
			
			for (int i = lastidx ; i < arr.length; i++) {
				
				//Add the element in list jaise ans me krte the 
	            list2.add(arr[i]);
	            
	            
	            coinUnlimited(arr, i  , money -arr[i] , list , list2);
				
				//undo wala step
				//yaha aagya toh yaa toh positive bc se aya h ya -ve toh hatta do woh wala element
				//kyuki +ve se aaya hga toh list me add hgya hga ab waise bhi zrurat nahi -ve se aaaya toh htaana hi hai 
				list2.remove(list2.size()-1);
				
			}
			
		}
}
