package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 4, 5, 9 };
		int[] nums2 = { 4, 4, 8, 9, 9 };

		intersect(nums1, nums2);
	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> list = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums2[j] < nums1[i]) {
				j++;
			}

		}

		System.out.println(list);
		int[] arr = new int[list.size()];
		int k = 0;
		for (int val : list) {
			arr[k] = val;
			k++;
		}
		return arr;
	}
}
