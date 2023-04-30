package com.java.programs.strings;

import java.util.Scanner;

/*
 * 12. Write a program to find the largest word in a sentence.
       Input:
       Enter a sentence: The quick brown fox jumps over the lazy dog
       Output:
       The largest word in the sentence is: jumps
*/
public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String longestWord = "";
		int longestWordlen = 0;
		for (int i = 0; i <words.length; i++) {
			String word = words[i];
			int len = word.length();
			if (len > longestWordlen) {
				longestWord = word;
				longestWordlen = len;
			}
		}
		System.out.println("The largest word in the sentence is: " + longestWord);
		sc.close();
	}

}
