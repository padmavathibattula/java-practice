package com.example.programs.simple;

import java.util.Scanner;

public class NaturalNumberSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		System.out.println("Sum of Squares = " + sum);
		sc.close();

	}

}
