package Leetcode;

public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = { 4,2,0,3,2,5 };
		trap(height);

	}

	public static int trap(int[] height) {

		int[] leftmax = new int[height.length];
		int[] rightmax = new int[height.length];

		int left = 0;
		int right = 0;

		for (int i = 0; i < height.length; i++) {

			if (height[i] >= left) {
				left = height[i];
			}

			leftmax[i] = left;

		}

		for (int i = height.length - 1; i >= 0; i--) {

			if (height[i] >= right) {

				right = height[i];
			}

			rightmax[i] = right;
		}

//		for (int i = 0; i < leftmax.length; i++) {
//
//			System.out.print(leftmax[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < rightmax.length; i++) {
//
//			System.out.print(rightmax[i] + " ");
//		}

		int ans = 0;

		for (int i = 0; i < height.length; i++) {

			ans += Math.min(leftmax[i], rightmax[i]) - height[i];

		}

		//System.out.println(ans);
		return ans;
	}

}
