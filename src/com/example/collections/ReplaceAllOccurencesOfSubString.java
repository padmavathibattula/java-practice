package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 7.Write a program to replace all occurrences of a specific substring in an
     ArrayList of strings.
     Input:
     [Apple,Banana,Mango,Orange]
     Substring to replace: an
     New substring: **
     Output:
     ArrayList after replacing an with **:[Apple,B****a,M**go,Or**ge]
 */
public class ReplaceAllOccurencesOfSubString {
	public static ArrayList<String> replaceSubstring(ArrayList<String> list, String targetSubstring, String replacement) {
		ArrayList<String> outputStrings=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String val = list.get(i);
			String modifiedString = val.replaceAll(targetSubstring, replacement);
			outputStrings.add(modifiedString);
		}
		return outputStrings;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ArrayList1 length:");
		int size = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		sc.nextLine();
		System.out.println("Enter strings");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextLine());
		}
        System.out.println("Substring to replace:");
		String targetSubstring = sc.nextLine();
		System.out.println("New substring:");
		String replacement = sc.nextLine();
		ReplaceAllOccurencesOfSubString obj = new ReplaceAllOccurencesOfSubString();
		ArrayList<String> output = obj.replaceSubstring(list, targetSubstring, replacement);
		System.out.println("ArrayList after replacing an with **: " + output);
	}
}
