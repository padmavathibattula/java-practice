package com.java.programs.strings;

import java.util.Scanner;

public class LengthOfString {
	public  int getLengthOfString(String inputStr) {
		int output=inputStr.length();
		return output;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String inputStr = sc.nextLine();
		LengthOfString obj = new LengthOfString();
		int output=obj.getLengthOfString(inputStr);
		System.out.println("The length of the string is: "+output);
		sc.close();
	}
}
