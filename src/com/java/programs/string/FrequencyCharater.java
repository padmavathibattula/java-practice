package com.java.programs.string;

import java.util.Scanner;

public class FrequencyCharater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		System.out.print("Enter a character:");
		char ch = sc.nextLine().charAt(0);
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				frequency++;
			}
		}
		System.out.println("The frequency of " + ch + " in the String is " + frequency);
		sc.close();
	}

}
