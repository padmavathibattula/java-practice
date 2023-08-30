package com.example.programs.strings;

import java.util.Scanner;

/*
 * 11. Write a program to find the first non-repeated character in a string.
       Input:
       Enter a string: morning
       Output:
       The first non-repeated character in the string is: m
*/

public class FirstNonRepeatedCharater {
	public  String getFirstNonRepeatedCharacter(String str) {
		boolean unique;
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
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.next();
		FirstNonRepeatedCharater obj = new FirstNonRepeatedCharater();
		obj.getFirstNonRepeatedCharacter(str);
		sc.close();
	}
}
