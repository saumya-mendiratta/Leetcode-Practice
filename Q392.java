package Leetcode;

public class Q392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  s = "axc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {

		int first =0;
		int second = 0;
		
		while(second<t.length()) {
			
			if(s.charAt(first)==t.charAt(second)) {
				
				first++;
				second++;
				
				if(first==s.length()) {
					return true;
				}
				
			}else {
				second++;
			}
			
		}
		
		return false;
	}
}
