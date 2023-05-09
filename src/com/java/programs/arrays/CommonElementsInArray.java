package com.java.programs.arrays;

import java.util.Scanner;

/*
 * 11. Write a program to find the common elements between two arrays.
       Input:
       Enter the size of the 1st array: 5
       Enter the array elements: 1 2 3 4
       Enter the size of the 2nd array: 4
       Enter the array elements: 3 4 5 6
       Output:
       The common elements are: 3 4
*/
public class CommonElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Get the first array from the user
		System.out.print("Enter the size of the first array: ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.print("Enter the elements of the first array: ");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}

		// Get the second array from the user
		System.out.print("Enter the size of the second array: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.print("Enter the elements of the second array: ");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] commonElements=new int[size1];
		int index=0;

		// Traverse the first array
		for (int i = 0; i < size1; i++) {
			// Traverse the second array
			for (int j = 0; j < size2; j++) {
				// If the current element in the first array is equal to the current element in
				// the second array, add it to the list of common elements
				if (arr1[i] == arr2[j]) {
					commonElements[index]=arr1[i];
					index++;
					break;
				}
			}
		}

		// Print the common elements
		System.out.print("Common elements: ");
		for (int i=0;i<index;i++) {
			System.out.print(commonElements[i] + " ");
		}
		sc.close();

	}

}
