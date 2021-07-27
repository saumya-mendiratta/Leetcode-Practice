package Leetcode;

public class Contest_Q2 {

	public static void main(String[] args) {

		System.out.println(canJump("01101110", 2, 3));

	}

	public static boolean canJump(String nums, int minJump, int maxJump) {

		int lastPos = 0;
		for (int i = 0; i < nums.length(); i++) {

			if (nums.charAt(i) != '0')
				continue;

			for (int j = i + minJump; j < nums.length() && j <= i + maxJump; j++) {

				if (i + minJump <= j && j <= Math.min(i + maxJump, nums.length() - 1) && nums.charAt(j) == '0')
					if (i + j >= lastPos) {
						lastPos = j;
					}
			}

			if (lastPos == 0)
				break;
		}
		return lastPos == nums.length() - 1;

	}

}
