package com.java.programs.strings;

import java.util.Scanner;
/*
9.Write a program to find the frequency of a character in a string.
  Input:
  Enter a string: hello world
  Enter a character: l
  Output:
  The frequency of 'l' in the string is: 3
*/
public class FrequencyOfCharacter {
	public  int getFrequencyOfCharacter(String str, char ch, int frequency) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				frequency++;
			}
		}
		return frequency;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");// hello world
		String str = sc.nextLine();
		System.out.print("Enter a character:");//l
		char ch = sc.next().charAt(0);
		int frequency = 0;
		FrequencyOfCharacter obj = new FrequencyOfCharacter();
		frequency = obj.getFrequencyOfCharacter(str, ch, frequency);
		System.out.println("The frequency of " + ch + " in the String is " + frequency);
		sc.close();
	}

}
