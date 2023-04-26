package com.java.programs.string;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String inputStr = sc.nextLine();
		System.out.println("The length of the string is: " + inputStr.length());
		sc.close();
	}
}
