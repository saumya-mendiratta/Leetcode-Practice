package Leetcode;

import java.util.ArrayList;

public class Q79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'E', 'S' }, { 'A', 'D', 'E', 'E' } };
		char[][] board = { { 'A', 'B' } };

		System.out.println(exist(board, "BA"));
	}

	public static boolean exist(char[][] board, String word) {

		flag = 0;
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> col = new ArrayList<Integer>();

		boolean[][] tracker = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {

				if (board[i][j] == word.charAt(0)) {
					row.add(i);
					col.add(j);
				}

			}

		}

//		System.out.println(row);
//		System.out.println(col);

		for (int i = 0; i < row.size(); i++) {
			if (flag == 0)
				helper(board, tracker, word, row.get(i), col.get(i), "" , 0);
		}

		return flag == 1;
	}

	static int flag = 1;

	public static void helper(char[][] board, boolean[][] tracker, String word, int row, int col, String ans , int idx) {

		if (ans.equals(word) || ans.contains(word)) {
			flag = 1;
		}

		if (!word.contains(ans))
			return;

		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || tracker[row][col])
			return;
		
		if(board[row][col]!=word.charAt(idx))
			return;
		

		if (flag == 0) {
			// right
			tracker[row][col] = true;
			helper(board, tracker, word, row, col + 1, ans + board[row][col] , idx+1);
			tracker[row][col] = false;

			// bottom
			tracker[row][col] = true;
			helper(board, tracker, word, row + 1, col, ans + board[row][col], idx+1);
			tracker[row][col] = false;

			// left
			tracker[row][col] = true;
			helper(board, tracker, word, row, col - 1, ans + board[row][col], idx+1);
			tracker[row][col] = false;

			// up
			tracker[row][col] = true;
			helper(board, tracker, word, row - 1, col, ans + board[row][col], idx+1);
			tracker[row][col] = false;
		}

	}

}
