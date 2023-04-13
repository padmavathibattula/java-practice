package com.java.example;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("It is an Even number");
		} else {
			System.out.println("It is an Odd number");
		}
		scanner.close();
	}

}
