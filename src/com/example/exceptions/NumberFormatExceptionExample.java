package com.example.exceptions;

/*
 * write a java program that reads a string from the user and converts it to an integer handle exception- 
 * when the user enter a non numeric value
 */
import java.util.Scanner;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String inputString = sc.next();
			int output = Integer.parseInt(inputString);
			System.out.println(output);
			sc.close();
		System.out.println("The rest of the program");
	}

}
