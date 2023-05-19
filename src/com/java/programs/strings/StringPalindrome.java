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
	public String getStringPalindrome(String inputStr, String rev) {
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			rev = rev + inputStr.charAt(i);//m,a,d,a,m
		}
		if (inputStr.equals(rev)) {//madam.equals(madam)
			System.out.println("The String is a palindrome");
		} else {
			System.out.println("The String is not a palindrome");
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");// madam
		String inputStr = sc.nextLine();
		sc.close();
		String rev = "";
		StringPalindrome obj = new StringPalindrome();
		obj.getStringPalindrome(inputStr, rev);
	}

	
}
