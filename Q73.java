package Leetcode;

public class Q73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		setZeroes(matrix);

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void setZeroes(int[][] matrix) {

		boolean col = true;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {

					if (j == 0) {
						col = false;
					}
					else {

						matrix[i][0] = 0;
						matrix[0][j] = 0;

					}
				}
			}
		}

		for (int i = matrix.length - 1; i >= 0; i--) {

			for (int j = matrix[0].length - 1; j > 0; j--) {
		

				 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}

			}

		}
		
		if(!col) {
			
			for(int i=0 ; i<matrix.length ; i++)
				matrix[i][0]= 0;
		}

	}

}
