package com.java.programs.arrays;

import java.util.Scanner;

/*
 * 10. Write a program to remove a specific element from an array.
       Input:
       Enter the size of the array: 5
       Enter the array elements: 1 2 3 4 5
       Enter the element to be removed: 3
       Output:
       Array after removing 3: 1 2 4 5
 */

public class RemoveAspecificElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array:");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the array: ");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to be removed:");
		int element = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) // If element found
			{
				// shifting elements
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				break;
			}
		}
		System.out.println("Array after removing");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}
}
