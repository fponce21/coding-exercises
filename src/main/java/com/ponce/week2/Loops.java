package com.ponce.week2;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// Q: Print nums 1-5
		
		
		/*for loop syntax
		 * 
		 * for(intializatino; condition; increment/decrement){
		 * 	body
		 * }
		 * 
		 */

		for (int num =1; num<=5; num +=1)
			System.out.println(num);
		
		String str = "John is really fucking cool";
		
		System.out.println(str);
		
		
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		
//		for(int num = 1; num <= n; num++) {
//			//can insert anything in here to be printed n nums of time
//			System.out.println(num + " ");
//		}
		
		//while loop
		/* Do not know how many times to loop
		 * 
		 */
		
		int num = 1;
		while(num<=5) {
			System.out.println(num);
			num+=1;
		}
		
		
		//do while
		/*
		 * do {
		 * 
		 * }
		 * while(condition);
		 */
		
		int n = 1;
		do {
			System.out.println(n);
			n++;
		} while (n<=5);
		
	}
	
	//print nums from 1 to n 


}

