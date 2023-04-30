package com.java.programs.strings;

import java.util.Scanner;
/*
 * 6.Write a program to check whether a string is a valid palindrome ignoring
     case sensitivity and white spaces.
     Input:
     Enter a string: A man a plan a canal Panama
     Output:
     The string is a valid palindrome
*/
public class ValidPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");// A man a plan a canal panama
		String inputStr = sc.nextLine();
		String rev = "";
		inputStr = inputStr.replace(" ", "");
		sc.close();
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			rev = rev + inputStr.charAt(i);
		}
		if (inputStr.equalsIgnoreCase(rev)) {
			System.out.println("The String is a valid palindrome ");
		} else {
			System.out.println("The string is not a valid palindrome ");
		}
	}

}
