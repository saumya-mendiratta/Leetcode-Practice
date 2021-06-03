package Leetcode;

public class Q263 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isUgly(0));
	}

	public static boolean isUgly(int n) {

		if(n==0)
			return false;
	
		while(n!=1) {
			
			if(n%2==0)
				n=n/2;
			else if(n%3==0)
				n=n/3;
			else if(n%5==0)
				n=n/5;
			else
				return false;
		}
		return true;
	}
}
