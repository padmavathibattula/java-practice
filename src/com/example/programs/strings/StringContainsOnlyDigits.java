package com.example.programs.strings;

import java.util.Scanner;

/*
 * 19. Write a program that prompts the user to enter a string and then
       checks if it contains only digits (0-9).
       Input:
       Enter a string: 123456
       Output:
       The string contains only digits
*/
public class StringContainsOnlyDigits {
	public boolean hasDigits(String str) {
	 boolean hasDigits = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				hasDigits = false;
			}
		}

		return hasDigits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		StringContainsOnlyDigits obj = new StringContainsOnlyDigits();
		boolean output = obj.hasDigits(str);
		System.out.println("The string contains only digits?:" + output);
		sc.close();
	}
}
