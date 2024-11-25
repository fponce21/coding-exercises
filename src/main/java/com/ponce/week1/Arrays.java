package com.ponce.week1;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
	
	static int arr[] = new int[] {1,2,3,4,5,6,7};
	
	static void subArray(int n) {
	
	for(int i=0; i < n;i++) {
		for(int j=i; j<n;j++) {
			for(int k=i; k<=j;k++) {
				System.out.print(arr[k] + " ");
				
				
			}
			
		}
	}
	}

	public static void main(String[] args) {

		//Intialize arrayList
		ArrayList<String> patients = new ArrayList<>();
		
		patients.add("Leo");
		patients.add("Sam");
		patients.add("Masha");
		patients.add("Ania");
		patients.add("Matt");
		patients.add("Mon");
		patients.add("Sav");
		patients.add("Trevor");
		
		System.out.println(patients);
		
		patients.add(0,"Will");
		
		System.out.println(patients.get(0));
		
		patients.set(0,"Tony");
		
		System.out.println(patients);
		
		patients.remove(2);

		System.out.println(patients);

		for( int i = 0; i < patients.size(); i++) {
			System.out.println(patients.get(i));
		}
		
		Collections.sort(patients);

		for(String i : patients) {
			System.out.println(i);
		}
		
		System.out.println("All non-empty Subarrays" + " ");
		subArray(arr.length);

		

	}

}
