package com.java.programs.simple;

import java.util.Scanner;

public class DiagonalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		sc.close();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("0 ");
			}
			System.out.print(i + " ");

			for (int k = i; k < rows; k++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
