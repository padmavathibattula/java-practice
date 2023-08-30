package com.example.programs.simple;

import java.util.Scanner;

public class RightPascalsTriangleNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			// Loop to iterate over each column of the ith row
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Printing Lower Half for rows-1 rows
		// Loop to iterate over each row in reverse order
		for (int i = rows - 1; i >= 1; i--) {
			// Loop to iterate over each column of the ith row
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
