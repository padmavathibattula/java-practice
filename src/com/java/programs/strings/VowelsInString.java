package com.java.programs.strings;
import java.util.Scanner;
public class VowelsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String inputStr = sc.nextLine();
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == 'a' || inputStr.charAt(i) == 'e' || inputStr.charAt(i) == 'i'
					|| inputStr.charAt(i) == 'o' || inputStr.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("The number of vowels in the string is:" + count);
		sc.close();
	}
}
