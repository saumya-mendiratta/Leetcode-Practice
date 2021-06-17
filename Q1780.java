package Leetcode;

public class Q1780 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkPowersOfThree(21));
	}

	public static boolean checkPowersOfThree(int n) {

		for (int i = 15; i >= 0; i--) {

			int x = (int) Math.pow(3, i);
			

			if (x <= n)
				n = n - x;

			if (n == 0)
				return true;

		}

		return false;
	}
}
