package com.java.programs.simple;

import java.util.Scanner;

public class BinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long binaryNumber, decimalNumber = 0, j = 1, rem;
		System.out.println("Enter the binary number : ");
		binaryNumber = sc.nextLong();
		while (binaryNumber != 0) {
			rem = binaryNumber % 10;
			decimalNumber = decimalNumber + rem * j;
			j = j * 2;
			binaryNumber = binaryNumber / 10;

		}
		System.out.println("Decimal number = " + decimalNumber);
		sc.close();

	}

}
