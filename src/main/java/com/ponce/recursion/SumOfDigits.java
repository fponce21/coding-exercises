package com.ponce.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = sum(1342);
		int ans2 = prod(123);
		System.out.println(ans);
		System.out.println(ans2);

	}
	
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10) + sum(n/10);
	}
	
	static int prod(int n) {
		if(n%10 == n) {
			return n;
		}
		return (n%10) * prod(n/10);
	}

}
