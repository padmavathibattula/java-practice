package com.java.programs.arrays;

import java.util.Scanner;

public class NumberOfOccurrenceOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the arry : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the number of elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int search = 0;
		System.out.print("Enter the element to be searched :");
		search = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				count = count + 1;
			}
		}
		System.out.print("The element " + search + " occurs " + count + " times in the array");
		sc.close();
	}
}
