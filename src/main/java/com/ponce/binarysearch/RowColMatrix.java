package com.ponce.binarysearch;

public class RowColMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int[] search(int[][] matrix, int target) {
		int row = 0;
		int column = matrix[0].length - 1;

		while (row < matrix.length && column >= 0) {
			if (matrix[row][column] == target) {
			}
			return new int[] { row, column };
		}

		if (matrix[row][column] < target) {
			row++;
		} else {
			column--;
		}
		return new int[] { row, column };
	}
}
