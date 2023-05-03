package com.java.programs.strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacterV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inputString = sc.nextLine();
		sc.close();
		int length = inputString.length();
		boolean isRepeated = true;
		// System.out.println(inputString.indexOf("m"));
		// System.out.println(inputString.lastIndexOf("m"));
		for (int i = 0; i < length; i++) {
			char currentChar = inputString.charAt(i);
			if (inputString.indexOf(currentChar) == inputString.lastIndexOf(currentChar)) {
				System.out.println("The first nonrepeated character in the string is: " + currentChar);
				isRepeated = false;
				break;
			}

		}
		if(isRepeated) {
			System.out.println("There is no first nonrepeated character in the string");
		}

	}

}
