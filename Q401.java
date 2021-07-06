package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q401 {

	public static void main(String[] args) {

		System.out.println(readBinaryWatch(1));
	}

	public static List<String> readBinaryWatch(int turnedOn) {

		int[] arr = { 1, 2, 4, 8, 1, 2, 4, 8, 16, 32 };
		List<String> list = new ArrayList<>();
		helper(turnedOn, arr, 0, 0, 0, list);

		return list;
	}

	public static void helper(int turnedOn, int[] arr, int vidx, int hr, int min, List<String> list) {

		if (hr > 11 || min > 59) 
			return;
		
		if (turnedOn == 0) {
			//System.out.println(hr + ":" + min);
			String str = "";

			if (min <= 9)
				str = hr + ":0" + min;
			else
				str = hr + ":" + min;

			list.add(str);
			return;
		}

		if (vidx == arr.length)
			return;

		// ON

			if (vidx <= 3)
				helper(turnedOn - 1, arr, vidx + 1, hr + arr[vidx], min , list);
			else
				helper(turnedOn - 1, arr, vidx + 1, hr, min + arr[vidx] , list);

		// OFF
		helper(turnedOn, arr, vidx + 1, hr, min , list);

	}
}
