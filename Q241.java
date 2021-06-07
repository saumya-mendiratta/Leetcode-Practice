package Leetcode;

import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orb.Operation;

public class Q241 {

	public static void main(String[] args) {

		System.out.println(diffWaysToCompute("2-1-1"));
	}

	public static List<Integer> diffWaysToCompute(String expression) {

		if (expression.length() == 1) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(Integer.parseInt(expression));
			return list;
		}

		List<Integer> ans = new ArrayList<Integer>();
		int opcount=0;
		
		for (int i = 0; i < expression.length(); i++) {

			List<Integer> left = new ArrayList<Integer>();
			List<Integer> right = new ArrayList<Integer>();

			
			if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
				
				opcount++;
				
				String leftexpression = expression.substring(0, i);
				String rightexpression = expression.substring(i + 1);
				char operation = expression.charAt(i);

				left = diffWaysToCompute(leftexpression);
				right = diffWaysToCompute(rightexpression);

				if (operation == '+') {
					for (int val1 : left) {
						for (int val2 : right) 				
							ans.add(val1+val2);			
					}
				}

				else if (operation == '-') {
					for (int val1 : left) {
						for (int val2 : right) 
							ans.add(val1-val2);
					}
				}

				else if (operation == '*') {
					for (int val1 : left) {
						for (int val2 : right) 
							ans.add(val1*val2);
					}
				}
			}

		}
		
		if(opcount==0) {
			ans.add(Integer.parseInt(expression));
			return ans;
		}

		return ans;
	}
}
