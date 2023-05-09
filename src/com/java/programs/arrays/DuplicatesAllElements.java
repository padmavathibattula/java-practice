package com.java.programs.arrays;

import java.util.Scanner;

/*
 * 16. Write a program to remove all duplicates from an array.
       Input:
       Enter the size of the array: 8
       Enter the array elements: 1 2 3 2 4 1 5 1
       Output:
       1 2 3 4 5
 */
public class DuplicatesAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the  array :");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int size = arr.length;
		// use nested for loop to find the duplicate elements in array
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// use if statement to check duplicate element
				if (arr[i] == arr[j]) {
					// delete the current position of the duplicate element
					for (int k = j; k < size - 1; k++) {
						arr[k] = arr[k + 1];
					}
					// decrease the size of array after removing duplicate element
					size--;

					// if the position of the elements is changes, don't increase the index j
					j--;
				}
			}
		}
		sc.close();
		/* display an array after deletion or removing of the duplicate elements */
		System.out.println("Array elements after deletion of the duplicate elements: ");
		// for loop to print the array
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
