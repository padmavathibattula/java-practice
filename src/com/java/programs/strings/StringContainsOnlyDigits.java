package com.java.programs.strings;

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
	public boolean  hasContainsOnlyDigits(String str, boolean flag) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("The string contains only digits ");
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		boolean flag = true;
		StringContainsOnlyDigits obj = new StringContainsOnlyDigits();
		obj.hasContainsOnlyDigits(str, flag);

		sc.close();
	}
}
