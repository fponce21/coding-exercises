package com.ponce.linearalgorithms;

public class EvenDigits {

	public static void main(String[] args) {
		int [] nums = {12,345,2,6,7896};
		
		//will print out 2 bc thats how many number have an even amount of digits (12 & 7896) 
		System.out.println(findNumbers(nums));

	}
	
	static int findNumbers(int[] nums) {
		int count = 0;
		
		for (int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		
		return count;
	}
	
	//function to check whether a number contains an even number of digits
	static boolean even(int num) {
		int numberOfDigits = digits(num);
	
		/*
		 * if (numberOfDigits % 2 == 0){
		 * 	return true;
		 * }
		 * 
		 * return false;
		 */
		
	return numberOfDigits % 2 == 0;
	}
	
	//count number of digits in a number
	
	static int digits(int num) {
		
		if (num < 0) {
			num = num * -1;
		}
		
		if(num == 0) {
			return 1;
		}
		
		int count = 0;
		while (num>0 ) {
			count++;
			num = num / 10;
		}
		 return count;
	}
	
	static int digits2(int num) {
		if(num < 0) {
			num = num * -1;
		}
		return (int)(Math.log10(num)) + 1;
	}

}
