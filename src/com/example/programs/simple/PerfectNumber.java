package com.example.programs.simple;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int sum = 0;
		long number = sc.nextLong();
		int i = 1;
		while (i <= number / 2) {
			if (number % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == number) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not perfect number ");
		}
		sc.close();

	}

}
