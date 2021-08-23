package Leetcode;

public class Q240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean searchMatrix(int[][] matrix, int target) {

		// start from top right corner
		int i = 0;
		int j = matrix[0].length - 1;

		while (i <= matrix.length - 1 && j >= 0) {

			if (matrix[i][j] == target)
				return true;

			// Move left
			if (target < matrix[i][j])
				j--;
			// move bottom
			else
				i++;

		}

		return false;
	}

}
