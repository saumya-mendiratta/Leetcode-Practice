package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> list = combinationSum3(3, 9);
		System.out.println(list);
	}

	public static List<List<Integer>> combinationSum3(int k, int n) {

		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = i + 1;
		}

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		combinehelper(arr, 0, k,n,0, list, list2);
		return list;
	}

	public static void combinehelper(int[] arr, int idx, int k, int n , int sum ,List<List<Integer>> list, List<Integer> list2) {

		if(sum>n)
			return;
		
		if (list2.size() == k && sum==n) {
			list.add(new ArrayList<>(list2));
			return;
		}

		if (list2.size() + arr.length - idx < k) {
			return;
		}

		if (idx == arr.length)
			return;

		if (list2.size() == 0 && arr.length - idx < k)
			return;

		for (int i = idx; i < arr.length; i++) {

			list2.add(arr[i]);
			sum+=arr[i];
			combinehelper(arr, i + 1, k, n, sum, list, list2);
			sum-=arr[i];
			list2.remove(list2.size() - 1);
		}

	}
}
