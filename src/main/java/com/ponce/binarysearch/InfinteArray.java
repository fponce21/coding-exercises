package com.ponce.binarysearch;

public class InfinteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int binarySearch(int [] arr, int target, int start, int end) {
		
		while ( start <= end) {
			//find the middle element
			int mid = start - (end - start) / 2;
			
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				//answer found
				return mid;
			}
		}
		
		return -1;
	}
	
	static int ans(int[] arr, int target) {
		// first find the range
		//start w/a box of size 2
		int start = 0;
		int end = 1;
		
		//condition for the target to lie in the range
		while(target > arr[end]) {
			int temp = end + 1; // this is the new start
			//double the box value
			//end = previous end + sizeOfBox*2
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		return binarySearch(arr, target, start, end);
		
	}
	
}
