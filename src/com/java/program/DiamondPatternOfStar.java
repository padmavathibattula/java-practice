package com.java.program;

import java.util.Scanner;

public class DiamondPatternOfStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		for (int i = 1; i < rows; i += 2) {
			for (int k = rows; k >= i; k -= 2) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // end loop

		for (int i = 1; i <= rows; i += 2) {
			for (int k = 1; k <= i; k += 2) {
				System.out.print(" ");
			}
			for (int j = rows; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}

	}
}
