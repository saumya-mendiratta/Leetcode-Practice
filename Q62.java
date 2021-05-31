package Leetcode;

import java.util.ArrayList;

public class Q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maze(0, 0, 2, 1));
//		System.out.println(count);
	}

//	public static int uniquePaths(int m, int n) {
//
//		System.out.println(maze(0, 0, 2, 1));;
////		return count;
//	}
	
//	static int count =0;
	
	public static int maze(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}

		ArrayList<String> mr = new ArrayList<>();

		int rrh=0;
		int rrv =0;
		if (cc + 1 <= ec) {
			 rrh = maze(cr, cc + 1, er, ec);
//			for (String val : rrh) {
//
//				mr.add("H" + val);
//			}

		}

		if (cr + 1 <= er) {
			 rrv = maze(cr + 1, cc, er, ec);
//			for (String val : rrv) {
//
//				mr.add("V" + val);
//			}

		}

		return rrh + rrv;
	}
}
