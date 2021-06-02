package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q47 {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1 };
		List<List<Integer>> list = permuteUnique(nums);
		
		System.out.println(list);


	}

	public static List<List<Integer>> permuteUnique(int[] nums) {


		if(nums.length==1) {
			
			List<List<Integer>> br = new ArrayList<List<Integer>>();
			List<Integer> brr = new ArrayList<Integer>();
			brr.add(nums[0]);
			br.add(brr);
			return br;
			
		}
		
		HashMap<List,Integer> map = new HashMap<>();

		int ele = nums[0];

		int[] nums2 = new int[nums.length - 1];
		
		for (int i = 1; i < nums.length; i++) {
			nums2[i-1]=nums[i];
		}

		List<List<Integer>> rlist = permuteUnique(nums2);
		
		List<List<Integer>> mr = new ArrayList<List<Integer>>();


		for (int i = 0; i < rlist.size(); i++) {

			for(int j=0 ; j<=rlist.get(i).size() ; j++) {
			List<Integer> send = new ArrayList<Integer>(rlist.get(i));
			send.add(j, ele);
//			System.out.println(send);
//			System.out.println(rlist.contains(send));
			if(!map.containsKey(send)) {
			mr.add(send);
			map.put(send, 1);
			}
			}
		}

		
		return mr;
	}
}
