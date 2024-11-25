package com.ponce.linearalgorithms;

public class SearchInRange {

	public static void main(String[] args) {

		int[] arr = {18,12,-7,3,14,28};
		int target = -7;
		
		//will print out index at which the target is at
		System.out.println(linearSearh(arr, target, 1, 4));

	}

	static int linearSearh(int[] arr, int target, int start, int end) {

		if (arr.length == 0) {
			return -1;
		}

		for (int index = start; index <= end; index++) {
			// check for element at every index if it is = to target
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		return -1;
	}

}
