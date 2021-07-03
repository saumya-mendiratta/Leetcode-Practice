package Leetcode;

import java.util.List;
import java.util.ArrayList;

public class Q51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solveNQueens(4));
	}

	public static List<List<String>> solveNQueens(int n) {

		List<List<String>> list = new ArrayList<>();
		List<String> dotlist = new ArrayList<>();
		boolean[][] board = new boolean[n][n];

		String dots = "";
		for (int i = 1; i <= n; i++)
			dots += ".";

		helper(n, board, 0, 0, dots, dotlist, list);

		return list;
	}

	public static void helper(int n, boolean[][] board, int qpsf, int row, String dots, List<String> dotlist,
			List<List<String>> list) {

		if (qpsf == n) {
			list.add(new ArrayList<>(dotlist));
			return;
		}

		if (row >= n)
			return;

		for (int col = 0; col < n; col++) {

			if (isitsafe(board, row, col)) {

				board[row][col] = true;

				StringBuilder sb = new StringBuilder(dots);
				sb.setCharAt(col, 'Q');

				String str = sb.toString();
				dotlist.add(str);

				helper(n, board, qpsf + 1, row + 1, dots, dotlist, list);

				dotlist.remove(dotlist.size() - 1);
				board[row][col] = false;
			}

		}

	}

	public static boolean isitsafe(boolean board[][], int row, int col) {

		// horizontally left
		int r = row;
		int c = col - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;

			c--;

		}

		// verically up
		r = row - 1;
		c = col;
		while (r >= 0) {
			if (board[r][c])
				return false;

			r--;

		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;

			r--;
			c--;

		}
		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;

			r--;
			c++;

		}

		return true;
	}

}
