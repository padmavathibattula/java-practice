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
	public boolean hasSubString(String str, String subString) {
		boolean hasSubString = false;
		if (str.contains(subString)) {// hello world.contains(world)
			hasSubString = true;
		}
		return hasSubString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");// Hello World
		String str = sc.nextLine();
		System.out.print("Enter the substring to search: ");// world
		String subString = sc.nextLine();
		SubStringCheck obj = new SubStringCheck();
		boolean output = obj.hasSubString(str, subString);
		System.out.println("The string contains the substring?: " + output);
		sc.close();
	}

}
