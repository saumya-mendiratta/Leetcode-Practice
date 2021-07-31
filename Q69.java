package Leetcode;

public class Q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		float f = (5 + 2) / 3f;
//
//		int mid = (int) ((int) f * f);
//		System.out.println(f);

		System.out.println(mySqrt(3));

	}

	public static int mySqrt(int x) {

		int lo = 0;
		int hi = x;
		int mid = 0;

		while (lo <= hi) {

			mid = (lo + hi) / 2;

			int product = mid * mid;
			int product2 = (mid+1)*(mid+1);
			
			if (x>=product && x< product2 )
				return mid;

			if (product < x)
				lo = mid + 1;
			else
				hi = mid - 1;

		}

		return  mid;
	}

}
