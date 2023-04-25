package com.java.programs.simple;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter n :  ");
		int num = sc.nextInt();
		int sum = 0, rem, temp, factorial;
		temp = num;
		while (temp > 0) {
			factorial = 1;
			int i = 1;
			rem = temp % 10;
			while (i <= rem) {
				factorial = factorial * i;
				i++;
			}
			sum = sum + factorial;
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println(num + " is a strong number. ");

		} else {
			System.out.println(num + " is not a strong number. ");
		}
		sc.close();

	}

}
