package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lexicalOrder(13));
	}

	public  static List<Integer> lexicalOrder(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		lexico(0, list, n);
		
		return list;
		
	}
	
	public static void lexico(int n , List<Integer> list , int total ) {
		
		if(n<=total)
			list.add(n);
		else
			return;
		
		for(int i =0 ; i<=9 ; i++) {
			
			if(n==0 && i==0)
				continue;
			
			lexico(n*10 + i, list , total);
			
		}
		
	}
}
