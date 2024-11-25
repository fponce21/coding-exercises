package com.ponce.linearalgorithms;

public class FindMin {

	public static void main(String[] args) {
		
		int[] arr = {18,22,-23,56,1,0};
		
		System.out.println(min(arr));
		
	}
	
	//assum arr.length != 0
	//return the minimum value in the array
	
	static int min(int[] arr) {
		int ans = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < ans) {
				ans = arr[i];
				}
		}
		
		return ans;
	}

}
