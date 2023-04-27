package com.java.programs.strings;
import java.util.Scanner;
public class RemoveAllWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputStr = sc.nextLine();
		inputStr = inputStr.replaceAll(" ", "");
		System.out.println("The string after removing white spaces is:" + inputStr);
		sc.close();
	}

}
