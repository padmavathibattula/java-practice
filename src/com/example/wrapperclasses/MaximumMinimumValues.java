package com.example.wrapperclasses;

import java.util.Scanner;
/*
 * write a java program to find the maximum and minimum value of a primitive data type using the wrapper classes
 */

public class MaximumMinimumValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a is:");
		int a = sc.nextInt();
		System.out.print("Enter the number b is:");
		int b = sc.nextInt();
		System.out.println("The maximum value of two integers:" + Integer.max(a, b));
		System.out.println("The minimum value of two integers: " + Integer.min(a, b));
		sc.close();

	}

}
