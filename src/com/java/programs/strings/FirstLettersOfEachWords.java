package com.java.programs.strings;

import java.util.Scanner;

/*
 * 18. Write a program that prompts the user to enter a string and then
       capitalizes the first letter of each word.
       Input:
       Enter a string: java programming is fun
       Output:
       Java Programming Is Fun
*/
public class FirstLettersOfEachWords {
	public  String getFirstLetterOfEachWord(String[] words, String output) {
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String firstletter = word.substring(0, 1).toUpperCase();
			String remaingLetters = word.substring(1, word.length()).toLowerCase();
			word = firstletter + remaingLetters;
			output = output + word + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String output = " ";
		FirstLettersOfEachWords obj = new FirstLettersOfEachWords();
		output = obj.getFirstLetterOfEachWord(words, output);
		System.out.println(output);
		sc.close();
	}
}
