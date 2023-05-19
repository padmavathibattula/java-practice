package com.java.programs.strings;

import java.util.Scanner;

/*
 * 15. Write a program to check whether a string contains a given substring
       or not.
       Input:
       Enter a string: Hello World
       Enter the substring to search: World
       Output:
       The string contains the substring
*/
public class SubStringCheck {
	public String getSubString(String str, String subString) {
		if (str.contains(subString)) {//hello world.contains(world)
			System.out.println("The string contains the substring");// world
		} else {
			System.out.println("The string does not contain substring");
		}
		return subString;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");// Hello World
		String str = sc.nextLine();
		System.out.print("Enter the substring to search: ");// world
		String subString = sc.nextLine();
		SubStringCheck obj = new SubStringCheck();
		obj.getSubString(str, subString);
		sc.close();
	}

}
