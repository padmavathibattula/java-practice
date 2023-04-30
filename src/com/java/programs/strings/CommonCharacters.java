package com.java.programs.strings;

import java.util.Scanner;

/*
 * 22. Write a Java program to find the common characters between two given
       strings.
       Input:
       Enter first string: hello
       Enter second string: world
       Output:
       Common characters: l
 */
public class CommonCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string:");
		String str1 = sc.nextLine();
		System.out.print("Enter second string:");
		String str2 = sc.nextLine();
		int count = 0;
		for(int i = 0; i < str1.length() && i < str2.length(); i++) {
		    if(str1.charAt(i) == str2.charAt(i)){
		        count++;
		    }
		}
		System.out.print("The common character: " + count);
		sc.close();
	}
}
