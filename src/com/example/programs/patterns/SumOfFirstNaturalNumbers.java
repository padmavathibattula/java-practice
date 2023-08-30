package com.example.programs.patterns;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number ");
		int number = scanner.nextInt();
		int sum = 0;
		int i =0;
		while(i<=number) {
			sum += i;
			i++;
			
		}
		System.out.println("sum of the n natural numbers " +sum);
		scanner.close();
	}

}
