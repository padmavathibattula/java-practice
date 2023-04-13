package com.java.program;

import java.util.Scanner;

public class NumbersInTriangleShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, rows;
		System.out.println("Enter the number of rows:");
		rows = sc.nextInt();
		sc.close();
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i+ "");
			}
			System.out.println();
		}
	}

}
