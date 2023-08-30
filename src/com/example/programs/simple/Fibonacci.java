package com.example.programs.simple;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int term = sc.nextInt();
		int n1 = 0, n2 = 1, n3;
		for (int i = 1; i <= term; i++) {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}

}
