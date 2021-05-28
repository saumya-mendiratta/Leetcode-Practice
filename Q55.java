package Leetcode;

public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {3,2,3,0,4};
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {

		boolean[] arr = new boolean[nums.length];
		arr[arr.length - 1] = true;

		for (int i = arr.length - 2; i >= 0; i--) {

			int j = i + 1;
			while (j <= i + nums[i] && j <nums.length) {

				if (arr[j]) {
					arr[i] = true;
					break;
				}

				j++;
			}

		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		return arr[0];
	}
}
