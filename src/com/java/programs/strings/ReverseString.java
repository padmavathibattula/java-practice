package com.java.programs.strings;
import java.util.Scanner;
/*
 * 2.Write a program to reverse a string.
     Input:
     Enter a string: hello world
     Output:
     The reversed string is: dlrow olleh

*/
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");// hello world
		String inputStr = sc.next();
		sc.close();
		String outputStr = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			outputStr = outputStr + inputStr.charAt(i);
			//outputStr = outputStr.concat(inputStr.charAt(i));// do not use this like 
		}
		System.out.println("The reversed string is: "+outputStr);
	}

}
