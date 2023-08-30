package com.example.programs.patterns;

import java.util.Scanner;

public class Year {
	public boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int inputyear = sc.nextInt();
		Year year = new Year();
		boolean isLeapYear = year.isLeapYear(inputyear);
		System.out.println("Is leap year?"  +isLeapYear);
		sc.close();
	}

}
