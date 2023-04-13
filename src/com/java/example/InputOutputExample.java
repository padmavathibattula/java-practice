package com.java.example;

import java.util.Scanner;

public class InputOutputExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // logic
		System.out.print("Enter a number :"); // output
		int num = scanner.nextInt(); // input
		int square = num * num; // logic
		System.out.println("The square of the number is : " +square); // output
		scanner.close(); // logic
		
		
	}

}
