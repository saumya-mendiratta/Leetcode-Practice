package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(restoreIpAddresses("25525511135"));

	}

	public static List<String> restoreIpAddresses(String s) {

		List<String> list = new ArrayList<String>();
		List<String> main = new ArrayList<String>();
		helper(s, list, main);
		return main;

	}

	public static void helper(String s, List<String> list, List<String> main) {

		if (list.size() > 4)
			return;

		if (s.length() == 0) {

			if (list.size() == 4) {
				// System.out.println(list);
				String ip = "";
				for (int i = 0; i < list.size(); i++) {
					if (i == list.size() - 1)
						ip = ip + list.get(i);
					else
						ip = ip + list.get(i) + ".";
				}
				main.add(ip);
			}

			return;
		}

		for (int i = 0; i < s.length() && i < 12; i++) {

			String ans = s.substring(0, i + 1);
			String ques = s.substring(i + 1);

			// preceeding zeroes nhi rkhne aur 255 se bda hua toh nahi call deni
			// isliye check ans.len >3
			if ((ans.length() > 1 && ans.charAt(0) == '0') || ans.length() > 3)
				continue;

			long asnsnum = Long.parseLong(ans);

			if (asnsnum <= 255 && asnsnum >= 0) {
				list.add(ans);
				helper(ques, list, main);
				list.remove(list.size() - 1);
			}

		}

	}

}
