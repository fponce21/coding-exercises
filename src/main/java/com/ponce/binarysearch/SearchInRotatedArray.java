package com.ponce.binarysearch;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int search (int[] nums, int target) {
		int pivot = findPivotWithDuplicates(nums);
		
		//if you did not find a pivot, it means the array is not rotated
		if (pivot == -1) {
			//just do normal binary search
			return binarySearch(nums, target, 0, nums.length -1);
		}
		
		if(nums[pivot] == target) {
			return pivot;
		}
		
		if(target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot -1);
		}
		
		return binarySearch(nums, target, pivot + 1, nums.length -1);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		while(start <= end) {
			//find the middle element
			int mid = start + (end - start) / 2;
			
			if(target<arr[mid]) {
				end = mid -1;
				
			} else if(target> arr[mid]) {
				start = mid + 1;
			} else {
				//answer found
				return mid;
			}
		}
		return -1;
	}
	
	static int findPivotWithDuplicates(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			//4 cases
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			if(mid > start && arr[mid] > arr[mid + 1]) {
				return mid - 1;
			}
			
			//if elements at middle, start, end are = then skip duplicates
			if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
				//skip the duplicates
				//NOTE: what if these elements at start and end were the pivot?
				//check if start is pivot
				if ( start < end && arr[start] > arr[start + 1]) {
					return start;
				}
				start++;
				
				//chck whether end is pivot
				if(end > start && arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
				
			}
			//left side is soted, so pivot should be in right
			else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	

}
