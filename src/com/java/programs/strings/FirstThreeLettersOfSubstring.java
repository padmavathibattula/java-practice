package com.java.programs.strings;

import java.util.Scanner;

/*
 * 17. Write a program that prompts the user to enter a word, and then prints
       out the first three letters of the word using the substring() method.
       Input:
       Enter a word: Elephant
       Output:
       First three letters: Ele
*/
public class FirstThreeLettersOfSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = sc.nextLine();
		System.out.println("First tree letters: " + str.substring(0, 3));
		sc.close();
	}
}
