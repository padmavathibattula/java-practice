package com.java.programs.strings;

import java.util.Scanner;

/*
 * 14. Write a program to remove all the vowels from a string.
       Input:
       Enter a string: Hello World
       Output:
       The string without vowels is: Hll Wrld
 */

public class RemoveAllVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");// Hello World
		String str = sc.nextLine();
		String outputStr = "";
		outputStr = str;
		outputStr = outputStr.replace("a", "");// false
		outputStr = outputStr.replace("e", "");// true->e->means remove the this vowel
		outputStr = outputStr.replace("i", "");// false
		outputStr = outputStr.replace("o", "");// true->o->means remove the this vowel
		outputStr = outputStr.replace("u", "");// false
		outputStr = outputStr.replace("A", "");// false
		outputStr = outputStr.replace("E", "");// false
		outputStr = outputStr.replace("I", "");// false
		outputStr = outputStr.replace("O", "");// false
		outputStr = outputStr.replace("U", "");// false
		System.out.println("The string without vowels is: " + outputStr);//ouputStr:Hll Wrld
		sc.close();

	}

}
