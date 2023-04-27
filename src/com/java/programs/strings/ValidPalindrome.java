package com.java.programs.strings;
import java.util.Scanner;
public class ValidPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inputStr = sc.nextLine();
		String rev = "";
		inputStr = inputStr.replaceAll(" ", "");
		sc.close();
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			rev = rev + inputStr.charAt(i);
		}
		if (inputStr.equalsIgnoreCase(rev)) {
			System.out.println("The String is valid a palindrome ");
		} else {
			System.out.println("The string is not valid a palindrome ");
		}
	}

}
