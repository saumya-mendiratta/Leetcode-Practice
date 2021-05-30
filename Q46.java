package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> list = permute(nums);
		
		System.out.println(list);

//		List<Integer> rr = new ArrayList<Integer>();
//		rr.add(1);
//		rr.add( 2);
//		List<Integer> send = new ArrayList<Integer>(rr);
//		send.add(2, 3);
//		System.out.println(send);
//		System.out.println(rr);
	}

	public static List<List<Integer>> permute(int[] nums) {


		if(nums.length==1) {
			
			List<List<Integer>> br = new ArrayList<List<Integer>>();
			List<Integer> brr = new ArrayList<Integer>();
			brr.add(nums[0]);
			br.add(brr);
			return br;
			
		}
		

		int ele = nums[0];

		int[] nums2 = new int[nums.length - 1];
		
		for (int i = 1; i < nums.length; i++) {
			nums2[i-1]=nums[i];
		}

		List<List<Integer>> rlist = permute(nums2);
		
		List<List<Integer>> mr = new ArrayList<List<Integer>>();


		for (int i = 0; i < rlist.size(); i++) {

			for(int j=0 ; j<=rlist.get(i).size() ; j++) {
			List<Integer> send = new ArrayList<Integer>(rlist.get(i));
			send.add(j, ele);
//			System.out.println(send);
			mr.add(send);
			}
		}

		return mr;

	}

}
