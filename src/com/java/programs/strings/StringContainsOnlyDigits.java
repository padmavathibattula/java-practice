package com.java.programs.strings;

import java.util.Scanner;
/*
 * 1.Write a program to find the sum of all elements in an array.
     Input:
     Enter the size of the array: 5
     Enter the array elements: 1 2 3 4 5
     Output:
     The sum of all elements in the array is 15
*/
public class StringContainsOnlyDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("The string contains only digits ");
		}

		sc.close();
	}
}
