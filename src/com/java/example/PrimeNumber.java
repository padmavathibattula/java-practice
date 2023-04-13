package com.java.example;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number");
		boolean flag = false;
		int num = scanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i  == 0) {
				flag = true;
				break;

			}

		}
		if (flag) {
			System.out.println(num + " is not  a prime number");
		} else {
			System.out.println(num + "is a prime number");
		}
		scanner.close();

	}

}
