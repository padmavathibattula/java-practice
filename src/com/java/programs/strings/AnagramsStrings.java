package com.java.programs.strings;

import java.util.Scanner;

/*
 * 20. Write a Java program to check if two given strings are anagrams or
       not.
       Input:
       Enter first string: listen
       Enter second string: silent
       Output:
       Strings are anagrams
*/
public class AnagramsStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string :");//isten
		String str1 = sc.nextLine();
		System.out.print("Enter second string :");//sient
		String str2 = sc.nextLine();
		boolean flag = true;
		int noofChars = 256;
		if (str1.length() != str2.length()) {
			flag = false;
		}

		// Create an array to store the count of each character in str1
		int[] charCount = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;// Increment the count for each character in str1
			charCount[str2.charAt(i)]--;// Decrement the count for each character in str2
		}

		// Check if all the counts are zero
		for (int i = 0; i < noofChars; i++) {
			if (charCount[i] != 0) {
				flag = false;

			}
		}
		System.out.print("The strings are not anagrams");
		if (flag) {

			System.out.println("The two strings are anagrams.");

		}
		sc.close();
	}
}
