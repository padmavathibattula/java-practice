package com.java.programs.strings;

import java.util.Scanner;

public class AnagramsStrings2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first String: ");// listen
		String str1 = sc.nextLine();
		System.out.print("Enter a second String: ");// silent
		String str2 = sc.nextLine();
		sc.close();
		int length1 = str1.length();
		int length2 = str2.length();
		if (length1 != length2) {
			System.out.println("The strings are not anagrams");
			return;
		}

		for (int i = 0; i < length1; i++) {
			char currentChar = str1.charAt(i);
			str2 = str2.replaceFirst("" + currentChar, "");
		}
		if (str2.isEmpty()) {
			System.out.println("The strings are anagrams");
		} else {
			System.out.println("The strings are not anagrams");
		}

	}

}
