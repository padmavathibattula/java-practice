package com.java.example;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String[] args) {
		int i, fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number ");
		int number = scanner.nextInt();
		scanner.close();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + number + " is : " + fact+ " using for loop ");

		// while
		int j = 1, fact1 = 1;

		while (j <= number) {

			fact1 = fact1 * j;
			j++;
		}
		System.out.println("factorial of " + number + " is : " + fact1+ " using while loop");
	}
}
