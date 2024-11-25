package com.ponce.recursion;

public class Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ans = fun(19);

	}
	
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(--n);
	}

}
