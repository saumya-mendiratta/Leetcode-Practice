package Leetcode;

public class Q122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {

		int minprice = Integer.MAX_VALUE;
		int profit = 0;

		int ans = 0;

		for (int i = 0; i < prices.length; i++) {

			if (prices[i] < minprice) {
				
				minprice = prices[i];
				
			} 
			if (prices[i] - minprice > profit) {

				profit += prices[i] - minprice;
				ans += profit;
				minprice = prices[i];
				profit=0;

			} 
			if ( i>=1 && prices[i] < prices[i-1]) {
				
				minprice = prices[i];
				profit=0;
				
			}

		}
		
		return ans ; 
	}
}
