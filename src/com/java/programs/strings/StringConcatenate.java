package com.java.programs.strings;

import java.util.Scanner;

public class StringConcatenate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string:");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string:");
		String str2 = sc.nextLine();
		sc.close();
		String str3 = str1 + str2;
		System.out.println("The concatenated string is: " + str3);
	}

}
