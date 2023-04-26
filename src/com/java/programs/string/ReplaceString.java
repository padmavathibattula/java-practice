package com.java.programs.string;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.print("Enter the character to replace : ");
		char oldCh = sc.nextLine().charAt(0);
		System.out.print("Enter the new character: ");
		char newCh = sc.nextLine().charAt(0);
		String newChar=str.replace(oldCh, newCh);
		System.out.println("The new string is: " + newChar);
		sc.close();
	}
}
