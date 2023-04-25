package com.java.programs.patterns;

import java.util.Scanner;

public class PrintSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of rows :");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j == 1 || j == num || i == 1 || i == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
