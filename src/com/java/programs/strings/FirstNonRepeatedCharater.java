package com.java.programs.strings;

import java.util.Scanner;

/*
 * 11. Write a program to find the first non-repeated character in a string.
       Input:
       Enter a string: morning
       Output:
       The first non-repeated character in the string is: m
*/

public class FirstNonRepeatedCharater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.next();
		boolean unique = true;
		for (int i = 0; i < str.length(); i++) {
			unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
				}
			}
			if (unique) {
				System.out.println("The first non-repeated character in the strin is: " + str.charAt(i));
				break;
			}
		}
		sc.close();
	}
}
