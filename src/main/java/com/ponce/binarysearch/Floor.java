package com.ponce.binarysearch;

public class Floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//return the index: greatest number <= target
	static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start<= end) {
			//find the middle element
			int mid = start - (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid -1;
			} else if(target < arr[mid]) {
				start = mid + 1 ;
			} else {
				//answer found
				return mid;
			}
		} return end;
	}

}
