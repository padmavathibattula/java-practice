package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6.Write a program to remove all strings from an ArrayList that have a
     length 6
     Input:
     [Apple,Banana,Mango,Orange,Pineapple]
     Output:
     ArrayList after removing strings with length 6:[Apple,Mango,Pineapple]
 */
public class RemoveStrings {
	public ArrayList<String> removeStringsFromArrayList(ArrayList<String> obj, int length) {
		for (int i = 0; i < obj.size(); i++) {
			String str =  obj.get(i);
			if (str.length() == length) {
				obj.remove(str);
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of a string");
		int size = sc.nextInt();
		
		ArrayList<String> obj = new ArrayList<>();
		sc.nextLine();
		System.out.println("Enter strings");
		for (int i = 0; i < size; i++) {
			obj.add(sc.nextLine());
		}
		System.out.println("Enter the length of the string to be remove");
		int length = sc.nextInt();
		RemoveStrings rmstr = new RemoveStrings();
		ArrayList<String> strList = rmstr.removeStringsFromArrayList(obj, length);
		System.out.println("Arraylist after removing strings with length" + length + ":" + strList);

	}

}
