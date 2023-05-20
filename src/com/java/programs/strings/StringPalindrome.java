package com.java.programs.strings;

import java.util.Scanner;

/*
 * 4.Write a program to check whether a string is a palindrome or not.
     Input:
     Enter a string: racecar
     Output:
     The string is a palindrome.
*/
public class StringPalindrome {
	public boolean isPalindrome(String inputStr) {
		boolean isPalindrome = false;
		String rev = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			rev = rev + inputStr.charAt(i);// m,a,d,a,m
		}
		if (inputStr.equals(rev)) {// madam.equals(madam)
			isPalindrome = true;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");// madam
		String inputStr = sc.nextLine();
		sc.close();
		StringPalindrome obj = new StringPalindrome();
		boolean rev = obj.isPalindrome(inputStr);
		System.out.println(" The string is a palindrome?" + rev);
	}

}
