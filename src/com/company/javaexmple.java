package com.company;

public class javaexmple{
	public static int fact(int n) {
	
		if (n==0) {
			return 1;
		}
		
	int smallans;
	int ans;
	
	
	smallans = fact(n-1);
	return n*fact(n-1);
	
	}
	

	public static void main(String[] args) {
		// factorial
		
		int n= 5 ;
		int ans = fact(n);
		System.out.println(" ans " + ans);

	}

}
