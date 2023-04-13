package com.java.program;

import java.util.Scanner;

public class PyramidPatternOfStars {
	public static void main(String args[]) {
		int i, j, rows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		rows = sc.nextInt();
		sc.close();
		for (i = 1; i <= rows; i++) {
			for (j = rows-i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
