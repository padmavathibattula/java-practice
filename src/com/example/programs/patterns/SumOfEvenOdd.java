package com.example.programs.patterns;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a limit : ");
		int number = scanner.nextInt();
		int evensum = 0;
		int oddsum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;
			} else {
				oddsum = oddsum + i;
			}

		}
		System.out.println("The sum of even numbers up to " + number + " is : " + evensum);
		System.out.println("The sum of odd numbers up to " + number + " is  : " + oddsum);
		scanner.close();

	}

}
