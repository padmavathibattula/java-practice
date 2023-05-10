package com.example.wrapperclasses;

import java.util.Scanner;

public class SumOfTwoNumberUsingDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a is: ");
		double a = sc.nextDouble();
		System.out.print("Enter the number b is: ");
		double b = sc.nextDouble();
		Double obj = Double.sum(a, b);
		System.out.println("The sum of two doubles: "+obj.doubleValue() );
		sc.close();
	}

}
