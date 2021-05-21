package Leetcode;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxArea(int[] height) {

		int max = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {

			int area = (right - left) * Math.min(height[left], height[right]);

			if (area > max)
				max = area;

			if (height[left] < height[right])
				left++;
			else
				right--;

		}

		return max;
	}
}
