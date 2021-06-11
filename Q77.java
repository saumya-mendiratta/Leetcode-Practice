package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> list = combine(4, 3);
		System.out.println(list);
	}

	public static List<List<Integer>> combine(int n, int k) {

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		combinehelper(arr, 0, k, list, list2);
		return list;
	}

	public static void combinehelper(int[] arr, int idx, int k, List<List<Integer>> list, List<Integer> list2) {

		if (list2.size() == k) {
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
			combinehelper(arr, i + 1, k, list, list2);
			list2.remove(list2.size() - 1);
		}

	}

}
