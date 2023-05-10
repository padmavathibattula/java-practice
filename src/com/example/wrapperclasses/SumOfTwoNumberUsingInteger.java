package com.example.wrapperclasses;

import java.util.Scanner;
/*
 * write a program to find the sum of two integers using integer.sum()
 */

public class SumOfTwoNumberUsingInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a is: ");
		int a = sc.nextInt();
		System.out.print("Enter the number b is: ");
		int b = sc.nextInt();
		System.out.println("The sum of two integers: " + Integer.sum(a, b));
		//System.out.println("The sum of two doubles: " + Double.sum(a, b));
		sc.close();
	}

}
