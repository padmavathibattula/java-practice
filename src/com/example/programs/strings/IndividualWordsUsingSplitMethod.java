package com.example.programs.strings;

import java.util.Scanner;

/*
 * 16. Write a program that prompts the user to enter a sentence, and then
       splits the sentence into individual words using the split() method. The
       program should then print out each word on a separate line.
       Input:
       Enter a sentence: The quick brown fox jumps over the lazy dog.
       Output:
       The
       quick
       brown
       fox
       jumps
       over
       the
       lazy
       dog
 */
public class IndividualWordsUsingSplitMethod {
	public String[] getWords(String str) {
		String[] words = str.split(" ");
		return words;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = sc.nextLine();
		IndividualWordsUsingSplitMethod obj = new IndividualWordsUsingSplitMethod();
		String[] words = obj.getWords(str);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		sc.close();
	}
}
