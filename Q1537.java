package Leetcode;

public class Q1537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxSum(int[] nums1, int[] nums2) {

		long sum1 = 0;
		long sum2 = 0;
		long res = 0;

		int i = 0;
		int j = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] < nums2[j]) {
				sum1 += nums1[i];
				i++;
			} else if (nums1[i] > nums2[j]) {
				sum2 += nums2[j];
				j++;
			} else {

				res += Math.max(sum1, sum2) + nums1[i];
				i++;
				j++;
				sum1 = 0;
				sum2 = 0;

			}

		}

		while (i < nums1.length) {

			sum1 += nums1[i];
			i++;
		}

		while (j < nums2.length) {

			sum2 += nums2[j];
			j++;
		}

		res += Math.max(sum1, sum2);

		res %= 1000000007;

		return (int)res;

	}

}
