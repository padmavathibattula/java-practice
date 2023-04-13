package com.java.example;

import java.util.Scanner;

public class Calcualator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number2 : ");
		int num2 = sc.nextInt();
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int division = num1 / num2;
		int modulus = num1 % num2;
		System.out.println("The addition of two numbers : " + addition);
		System.out.println("The subtraction of two numbers : " + subtraction);
		System.out.println("The multiplication of two numbers : " + multiplication);
		System.out.println("The division of two numbers : " + division);
		System.out.println("The modulus of two numbers : " + modulus);
		sc.close();

	}

}
