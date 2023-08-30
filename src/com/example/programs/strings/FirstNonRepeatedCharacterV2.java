package com.example.programs.strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacterV2 {
	public  boolean getFirstNonRepeatedCharacter(String inputString, int length, boolean isRepeated) {
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
		return isRepeated;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inputString = sc.nextLine();
		sc.close();
		int length = inputString.length();
		boolean isRepeated = true;
		// System.out.println(inputString.indexOf("m"));
		// System.out.println(inputString.lastIndexOf("m"));
		FirstNonRepeatedCharacterV2 obj = new FirstNonRepeatedCharacterV2();
		
		obj.getFirstNonRepeatedCharacter(inputString, length, isRepeated);

	}
}
