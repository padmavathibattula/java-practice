package com.java.programs.strings;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		String inputStr = sc.nextLine();
		sc.close();
		String rev = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			rev = rev + inputStr.charAt(i);
		}
		if (inputStr.equals(rev)) {
			System.out.println("The String is a palindrome");
		} else {
			System.out.println("The String is not a palindrome");
		}
	}
}
