package Leetcode;

import java.util.List;

import jdk.management.resource.internal.TotalResourceContext;

import java.util.ArrayList;

public class Q52_NQueen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n =totalNQueens(1);
	System.out.println(n);
	}

	public static int totalNQueens(int n) {

		boolean[][] board = new boolean[n][n];
		Nqueen(board, 0, 0, n , "");
		return count;
	}
	
	static int count =0;

	public static void Nqueen(boolean[][] board, int row, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
//			count ++;
			System.out.println(++count + " " + ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if(isitsafe(board, row, col)) {
			// Place
			board[row][col] = true;
			Nqueen(board, row + 1, qpsf + 1, tq, ans + "(" + row + " " + col + ")");
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
