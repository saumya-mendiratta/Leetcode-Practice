package Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class Q496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

	public static int[] nextGreaterElement( int[] nums1 , int[] nums2) {

		int[] arr = new int[nums2.length];

		Stack<Integer> s = new Stack();
		HashMap<Integer , Integer> map = new HashMap<>();

		s.push(0);
		map.put(nums2[0], 0 );

		for (int i = 1; i < nums2.length; i++) {
			
			map.put(nums2[i],i );

			int peek = s.peek();
			if (!s.isEmpty() && nums2[i] <= nums2[peek])
				s.push(i);
			else {

				while ( !s.isEmpty() &&  nums2[s.peek()] < nums2[i]) {
					int idx = s.pop();
					arr[idx] = nums2[i];

				}
				s.push(i);
			}

		}
		
		while(!s.isEmpty()) {
			int idx=s.pop();
			arr[idx]=-1;
		}
		
		for (int i = 0; i < nums1.length; i++) {
			
			nums1[i]=arr[map.get(nums1[i])];
			
		}
		
		return nums1;

	}
}
