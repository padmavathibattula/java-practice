package com.java.programs.strings;
import java.util.Scanner;
/*
 * 5.Write a program to remove all the white spaces from a string.
     Input:
     Enter a string: hello world
     Output:
     The string after removing white spaces is: helloworld

 */
public class RemoveAllWhiteSpaces {
	public String removeWhiteSpaces(String inputStr) {
		return inputStr.replace(" ", "");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputStr = sc.nextLine(); 
		RemoveAllWhiteSpaces obj = new RemoveAllWhiteSpaces();
		String output=obj.removeWhiteSpaces(inputStr);
		System.out.println("The string after removing white spaces is:" + output);
		sc.close();
	}

}
