package com.java.program;

import java.util.Scanner;

public class CelsiusToFahreheit {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the temparature in Celsius : ");
		double celsius = sc.nextDouble();
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.println( celsius+ "°C is equal to "+fahrenheit+"°F.");
		sc.close();
	}

}
