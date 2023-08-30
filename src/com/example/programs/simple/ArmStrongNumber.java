package com.example.programs.simple;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int number = sc.nextInt();
		int temp, rem, result = 0;
		temp = number;
		while (temp != 0) {
			rem = temp % 10;
			result += Math.pow(rem, 3);
			temp /= 10;

		}
		if (result == number) {
			System.out.println(number + " is an ArmstrongNumber ");
		} else {
			System.out.println(number + " is not an ArmstrongNumber ");
		}
		sc.close();

	}

}
