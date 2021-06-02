package Leetcode;

import java.util.Arrays;

public class book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =  {250, 74, 159, 181, 23, 45, 129, 174};
//		int[] a = {12,34,67,90};
//		int[] a = {10,20,30,40};
		
//		helper(a, 59, 2);
		System.out.println(findPages(a, a.length, 6));
	}

	public static int findPages(int[] a, int n, int m) {
		
		int lo =0;
		int high=0;
		int ans=0;
		
		
		for(int val:a) {
			high+=val;
		}
		
		int mid = 0;
		
		while(lo<=high) {
			
			 mid = (lo+high)/2;
			
			if(helper(a , mid , m)) {
				ans=mid;
				high=mid-1;
			}else {
				lo=mid+1;
			}
			
		}
		
		return ans;
	}

	private static boolean helper(int[] a, int mid, int m) {
		
		int sum=0;
		int count =1;
		int curr=0;
		
		while(curr < a.length) {
			
			if(sum+a[curr]<=mid) {
				sum = sum + a[curr];
				curr++;
			}else {
				sum=0;
				count ++;
			}
			
			if(count>m)
				return false;
		}
		
//		System.out.println(mid);
//		System.out.println(count);
	
		return true;
	}
	
	
}
