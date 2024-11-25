package com.ponce.binarysearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		
		int[] arr = { -20, -13, -3, 0, 3, 7, 10, 14 };
		int[] arr2 = {14,10,7,3,0,-3,-13,20 };

		int target = -20;

		System.out.println(orderAgnosticBs(arr, target));
		System.out.println(orderAgnosticBs(arr2, target));

		
		
	}

	static int orderAgnosticBs(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		//find whether array is sorted in asc or desc
		boolean isAsc = arr[start] < arr[end];
		
		while (start <= end) {
			//find middle element
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1 ;
				} else {
					start = mid + 1;
				}
			} else {
				if(target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		
		return -1;
		
	}
	
}
