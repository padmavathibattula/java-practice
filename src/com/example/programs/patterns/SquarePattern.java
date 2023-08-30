package com.example.programs.patterns;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int i;
		int j;
		int my_input = scanner.nextInt();
		scanner.close();
		for (i = 1; i <= my_input; i++) {
			for (j = 1; j <= my_input; j++) {
				System.out.print("* ");
			}
		  System.out.println();
		}

	}

}
