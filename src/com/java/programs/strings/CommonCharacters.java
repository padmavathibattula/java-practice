package com.java.programs.strings;

import java.util.Scanner;

/*
 * 22. Write a Java program to find the common characters between two given
       strings.
       Input:
       Enter first string: hello
       Enter second string: world
       Output:
       Common characters: lo
 */
public class CommonCharacters {
	public String getCommonCharacters(String str1, String str2) {
		String commonCharacters = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j) && !commonCharacters.contains(str1.charAt(i) + "")) {
					commonCharacters = commonCharacters + str1.charAt(i);
				}
			}
		}
		return commonCharacters;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string:");
		String str1 = sc.nextLine();
		System.out.print("Enter second string:");
		String str2 = sc.nextLine();
		CommonCharacters obj = new CommonCharacters();
		String commonCharacters = obj.getCommonCharacters(str1, str2);
		System.out.print("The common characters: " + commonCharacters);
		sc.close();
	}

}
