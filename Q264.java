package Leetcode;

public class Q264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(1));
	}

	public static  int nthUglyNumber(int n) {
	   
		int[] strg=new int[n+1];
		
		//1 sbse pehle ayega hi
		strg[0]=1;
		
		int i2=0;
		int i3=0;
		int i5=0;
		
		for (int i = 1; i < strg.length; i++) {
			
			int canditate2= 2*strg[i2];
			int canditate3= 3*strg[i3];
			int canditate5= 5* strg[i5];
			
			int min = Math.min(canditate2, Math.min(canditate3, canditate5));
			
			strg[i]=min;
			
			if(min==canditate2)
				i2++;
			if(min==canditate3)
				i3++;
			if(min==canditate5)
				i5++;
	
			
		}
		
		return strg[n-1];
		
	}
}
