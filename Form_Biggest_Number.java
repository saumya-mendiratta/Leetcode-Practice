package Leetcode;

import java.util.Arrays;

public class Form_Biggest_Number {

	public static void main(String[] args) {

		int[] arr = { 74, 21, 33, 51, 77, 51, 90, 60, 5, 56 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				String s1 = Integer.toString(arr[i]);
				String s2 = Integer.toString(arr[j]);

				int num1 = Integer.parseInt(s1 + s2);
				int num2 = Integer.parseInt(s2 + s1);

				if (num1 > num2) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}

	}

}
