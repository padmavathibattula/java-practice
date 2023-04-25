package com.java.programs.simple;

import java.util.Scanner;

public class HollowStarPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		sc.close();
		// Outer loop for the number of rows
		for (int i = 1; i <= rows; i++) {
			// first inner loop for spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// second inner loop for stars and intermediate spaces
			for (int k = 1; k <= 2 * i - 1; k++) {
				// check if its first and last column or last row
				// print star otherwise print space
				if (k == 1 || k == 2 * i - 1 || i == rows)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
