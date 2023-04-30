package com.java.programs.strings;

import java.util.Scanner;

/*
 * 13. Write a program to reverse each word in a sentence.
       Input:
       Enter a sentence: The quick brown fox
       Output:
       The reversed sentence is: ehT kciuq nworb xof
*/

public class ReverseEachWordInaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence :");// the quick brown fox
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String rev = "";
		for (int i = 0; i < words.length; i++) {//
			String word = words[i];
			String reverseword = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseword = reverseword + word.charAt(j);
			}
			rev = rev + reverseword + " ";
		}
		System.out.println("The reversed sentence is: " + rev);
		sc.close();
	}

}
