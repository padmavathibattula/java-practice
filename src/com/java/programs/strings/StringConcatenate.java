package com.java.programs.strings;

import java.util.Scanner;
/*
 * 7.Write a program to concatenate two strings.
     Input:
     Enter the first string: hello
     Enter the second string: world
     Output:
     The concatenated string is: helloworld
*/

public class StringConcatenate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string:");//hello 
		String str1 = sc.nextLine();
		System.out.print("Enter the second string:");// world
		String str2 = sc.nextLine();
		sc.close();
		String str3 = str1.concat(str2);
		System.out.println("The concatenated string is: " + str3);//helloworld
	}

}
