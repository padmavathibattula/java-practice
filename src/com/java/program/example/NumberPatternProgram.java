package com.java.program.example;

import java.util.Scanner;

public class NumberPatternProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			// Loop to iterate over each column of the ith row
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
