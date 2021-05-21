package Leetcode;

public class Q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

//		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

		int[][] matrix = { { 1 } };

		rotate(matrix);
	}

	public static void rotate(int[][] matrix) {

		int len = matrix.length - 1;

		for (int i = 0; i <= matrix.length / 2; i++) {

			for (int j = i; j < len - i; j++) {

				int temp = matrix[j][len - i];

				matrix[j][len - i] = matrix[i][j];

				int temp2 = matrix[len - i][len - j];
				matrix[len - i][len - j] = temp;
				temp = temp2;

				// temp = swap( matrix[len - i][len - j] , temp );

				int temp3 = matrix[len - j][i];
				matrix[len - j][i] = temp;
				temp = temp3;

				// temp = swap(matrix[len -j ][i] , temp);

				int temp4 = matrix[i][j];
				matrix[i][j] = temp;
				temp = temp4;

				// temp = swap(matrix[i][j] , temp);

			}

		}

//		for (int i = 0; i < matrix.length; i++) {
//			
//			for (int j = 0; j < matrix[0].length; j++) {
//				
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

}
