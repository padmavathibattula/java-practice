package com.java.programs.strings;

import java.util.Scanner;

/*
 10. Write a program to replace a character in a string.
     Input:
     Enter a string: hello world
     Enter the character to replace: o
     Enter the new character: a
     Output:
     The new string is: hella warld
*/
public class ReplaceCharater {
	public  String getReplace(String str, char oldCh, char newCh) {
		return str.replace(oldCh, newCh);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.print("Enter the character to replace : ");
		char oldCh = sc.next().charAt(0);
		System.out.print("Enter the new character: ");
		char newCh = sc.next().charAt(0);
		ReplaceCharater obj = new ReplaceCharater();
		String newChar = obj.getReplace(str, oldCh, newCh);
		System.out.println("The new string is: " + newChar);
		sc.close();
	}
}
