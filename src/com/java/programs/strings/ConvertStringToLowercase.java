package com.java.programs.strings;

import java.util.Scanner;

public class ConvertStringToLowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputStr = sc.nextLine();
		String lowerCase = inputStr.toLowerCase();
		System.out.println("The String in lowercase is: " + lowerCase);
		sc.close();
	}

}
