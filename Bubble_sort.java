package Leetcode;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();

			System.out.println("no. of swaps:" + " " + bubble(arr, n));

		}

	}

	public static int bubble(int[] arr, int n) {

		int count = 0;

		for (int i = 0; i < n - 1; i++) {

			boolean swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					count++;
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

			if (!swapped)
				break;

		}

		for (int val : arr)
			System.out.print(val + " ");
		System.out.println();

		return count;
	}
}
