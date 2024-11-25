package com.ponce.binarysearch;

public class RotationCount {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(countRotations(arr));

	}

	static int findPivotsWithDuplicates(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4cases to cover

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}

			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// if middle, start, and end elements are equal just skip the duplicates
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				// check if start is pivot
				if (arr[start] > arr[start - 1]) {
					return start;
				}
				start++;

				// check whether end is pivot
				if (arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
			}
			// left side is sorted, so pivot shoud be in right
			else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;

	}

	private static int countRotations(int[] arr) {
		int pivot = findPivotsWithDuplicates(arr);
		return pivot + 1;
	}

}