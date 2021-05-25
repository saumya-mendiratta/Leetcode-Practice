package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		merge(intervals);
	}

	public static int[][] merge(int[][] intervals) {

		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		int[] helper=new int[2];
		helper[0]=intervals[0][0];
		helper[1]=intervals[0][1];
		
		for (int i = 0; i < intervals.length; i++) {
			
			if (intervals[i][0] <= helper[1] && intervals[i][0] >= helper[0]) {
				
				helper[1]=Math.max(intervals[i][1], helper[1]);	
			}else {
				list.add(helper[0]);
				list.add(helper[1]);
				
				helper[0]=intervals[i][0];
				helper[1]=intervals[i][1];
				
			}
			
		}
		
		list.add(helper[0]);
		list.add(helper[1]);
		
		//System.out.println(list);
		
		int[][] arr = new int[list.size() / 2][2];
		int idx = 0;

		for (int k = 0; k < arr.length; k++) {

			arr[k][0] = list.get(idx++);
			arr[k][1] = list.get(idx++);

		}

			return arr;
	}
}
