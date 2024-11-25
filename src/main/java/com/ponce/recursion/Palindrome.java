package com.ponce.recursion;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalin(1234321) );

	}
	
	private static int helper(int n, int digits) {
		if(n%10==n) {
			return 1;
		}
		
		int rem = n % 10;
		return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits - 1);
	}
	
	static int rev(int n) {
		//sometimes u need some additional varibles in the arguments
		//in that case, make another function
		int digits = (int)(Math.log10(n)) + 1;
		return helper(n,digits);
	}
	
	static boolean isPalin(int n) {
		return n == rev(n);
	}

}
