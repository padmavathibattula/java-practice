package com.java.programs.patterns;

import java.util.Scanner;

public class MirroredRightTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, rows;
		System.out.println("Enter the number of rows:");
		rows = sc.nextInt();

		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+ "");
			}
			System.out.println("");  
		}
		sc.close();
	}

}
