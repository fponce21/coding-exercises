package com.ponce.week1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// system.in is user input
		Scanner input = new Scanner(System.in);
		String name = input.next();

		int result = Integer.parseInt(name);

		if (result % 2 == 0) {
			System.out.println(result + " is an even number.");
		} else {
			System.out.println(result + " is an odd number.");
		}
	}
}