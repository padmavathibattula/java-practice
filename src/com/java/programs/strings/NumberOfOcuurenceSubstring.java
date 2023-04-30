package com.java.programs.strings;

import java.util.Scanner;

/*
 * 21. Write a Java program to find the number of occurrences of a given
       substring in a string.
       Input:
       Enter a string: hello world
       Enter a substring: llo
       Output:
       Number of occurrences: 1
*/
public class NumberOfOcuurenceSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");// hello world
		String str = sc.nextLine();
		System.out.print("Enter a string :");// llo
		String substr = sc.nextLine();
		int occurence = 0;
		int fromIndex = 0;
		while (str.indexOf(substr, fromIndex) != -1) {//0->llo->true,5->4->false
			occurence++;//1
			fromIndex = str.indexOf(substr, fromIndex) + substr.length();//2+3->5,
		}
		System.out.println("Number of occurences:" + occurence);//1
		sc.close();
	}

}
