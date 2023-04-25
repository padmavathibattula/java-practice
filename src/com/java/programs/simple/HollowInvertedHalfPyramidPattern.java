package com.java.programs.simple;

import java.util.Scanner;

public class HollowInvertedHalfPyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows = sc.nextInt();
		int i, j;
		// loop to print number from 1 to rows
		for (i = 1; i <= rows; i++) {
			// For loop to display number from i to rows
			for (j = i; j <= rows; j++) {
				if (i == 1 || j == i || j == rows)
					System.out.print(j + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
