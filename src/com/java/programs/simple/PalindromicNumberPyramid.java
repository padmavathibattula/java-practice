package com.java.programs.simple;

import java.util.Scanner;

public class PalindromicNumberPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		sc.close();
	}
}
