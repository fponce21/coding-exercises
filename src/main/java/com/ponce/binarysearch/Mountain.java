package com.ponce.binarysearch;

public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int mid = start + (end - start)/ 2;		
			
			if(arr[mid] > arr[mid + 1]) {
				//you are in the descending part of the array
				//this may be the answer, ut look at left side
				//this is why end != mid - 1
				end = mid;
			} else {
				//you are in ascending part of array
				start = mid + 1; // bc we know that mid + 1 element > mid element
			}
			
		}
		//in the end, start == end and pointing to largest number bc of the 2 checks above
		//start and end are always trying to find the max element in above 2 checks
		//at every point of time for start and end, they have the best possible answer till that time
		//and if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
		return start; //or return end as both are =
	}

}
