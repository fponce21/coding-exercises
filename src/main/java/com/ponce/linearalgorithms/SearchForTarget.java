package com.ponce.linearalgorithms;

public class SearchForTarget {

	public static void main(String[] args) {
		
		int[] nums = {23,45,1,2,8,69,45,6,-98,78,-34};
		int target = 45;
		
		boolean ans = linearSearch3(nums, target);
		System.out.println(ans);
		
		}
	
	//search in the array: returns the index if item is found
	//otherwise if item not found then return -1
	static int linearSearch(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		//run a for loop
		for(int index = 0; index < 0; index ++) {
			
			int element = arr[index];
			if(element ==target) {
				return index;
			}
		}
		return -1;
	}
	
	static int linearSearch2(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for (int element : arr) {
			if(element ==target) {
				return element;
			}
		}
		//this line will execute if none of the return statements above have executed
		//hence target not found
		return Integer.MAX_VALUE;
	}
	
	static boolean linearSearch3(int[] arr, int target) {
		
		if (arr.length == 0) {
			return false;
		}
		
		for(int element : arr) {
			if (element == target) {
				return true;
			}
		}
		return false;
		
	}
	
}
