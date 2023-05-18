package com.java.programs.strings;

import java.util.Scanner;

/*
 8.Write a program to convert a string to lowercase.
Input:
Enter a string: HELLO WORLD
Output:
The string in lowercase is: hello world

 */
public class ConvertStringToLowercase {
	public  String getConvertStringToLowercase(String inputStr) {
		String lowerCase = inputStr.toLowerCase();
		return lowerCase;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");// HELLO WORLD
		String inputStr = sc.nextLine();
		ConvertStringToLowercase obj = new ConvertStringToLowercase();
		String lowerCase =obj. getConvertStringToLowercase(inputStr);// hello world
		System.out.println("The String in lowercase is: " + lowerCase); // hello world
		sc.close();
	}
}
